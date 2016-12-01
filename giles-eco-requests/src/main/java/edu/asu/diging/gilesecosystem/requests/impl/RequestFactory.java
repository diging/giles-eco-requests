package edu.asu.diging.gilesecosystem.requests.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import edu.asu.diging.gilesecosystem.requests.IRequest;
import edu.asu.diging.gilesecosystem.requests.IRequestFactory;
import edu.asu.diging.gilesecosystem.requests.RequestStatus;
import edu.asu.diging.gilesecosystem.requests.exceptions.MisconfigurationException;

@Service
@Scope("prototype")
public class RequestFactory<T extends IRequest, V extends T> implements IRequestFactory<T, V> {
    
    private Class<V> classToInstantiate;
    
    @Override
    public void config(Class<V> classToInstantiate) {
        this.classToInstantiate = classToInstantiate;
    }
    
    /* (non-Javadoc)
     * @see edu.asu.giles.service.kafka.requests.IRequestFactory#createRequest(java.lang.String)
     */
    @Override
    public T createRequest(String id, String uploadId) throws InstantiationException, IllegalAccessException {
        if (classToInstantiate == null) {
            throw new MisconfigurationException("RequestFactory is not properly configured and doesn't know what objects to create.");
        }
        T request = classToInstantiate.newInstance();
        request.setRequestId(id);
        request.setUploadId(uploadId);
        request.setStatus(RequestStatus.NEW);
        return request;
    }
}
