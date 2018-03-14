package edu.asu.diging.gilesecosystem.requests.service.impl;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import edu.asu.diging.gilesecosystem.requests.ICompletedStorageRequest;
import edu.asu.diging.gilesecosystem.requests.ICompletionNotificationRequest;
import edu.asu.diging.gilesecosystem.requests.IRequest;
import edu.asu.diging.gilesecosystem.requests.IRequestFactory;
import edu.asu.diging.gilesecosystem.requests.RequestStatus;
import edu.asu.diging.gilesecosystem.requests.exceptions.MessageCreationException;
import edu.asu.diging.gilesecosystem.requests.impl.CompletionNotificationRequest;
import edu.asu.diging.gilesecosystem.requests.kafka.IRequestProducer;
import edu.asu.diging.gilesecosystem.requests.service.ICompletionNotifier;

public abstract class ACompletionNotifier implements ICompletionNotifier {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IRequestProducer requestProducer;  
      
    @Autowired
    private IRequestFactory<ICompletionNotificationRequest, CompletionNotificationRequest> requestFactory;
    
    @Value("${topic_completion_notification}")
    private String topic;
    
    @PostConstruct
    public void init() {
        requestFactory.config(CompletionNotificationRequest.class);
    }
    
    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.service.impl.ICompletionNotifier#sendNotification(edu.asu.diging.gilesecosystem.requests.ICompletedStorageRequest)
     */
    @Override
    public void sendNotification(ICompletedStorageRequest request, RequestStatus status) {
        logger.debug("Sending notification completion request.");
        
        ICompletionNotificationRequest completionRequest = null;
        try {
            completionRequest = requestFactory.createRequest(getRequestPrefix() + request.getDocumentId(), request.getUploadId());
        } catch (InstantiationException | IllegalAccessException e) {
            logger.error("Could not create request.", e);
            // TODO: for now fail silently, but we'll have to send it to September
        }
        
        completionRequest.setStatus(status);
        fillRequest(completionRequest, request);
        
        try {
            requestProducer.sendRequest(completionRequest, topic);
        } catch (MessageCreationException e) {
            logger.error("Could not send request.", e);
            // TODO: for now fail silently, but we'll have to send it to September
        }
    }
    
    public abstract void fillRequest(ICompletionNotificationRequest completionRequest, IRequest request);
    
    public abstract String getRequestPrefix();
}
