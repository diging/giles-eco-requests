package edu.asu.diging.gilesecosystem.requests.kafka.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.core.KafkaTemplate;

import edu.asu.diging.gilesecosystem.requests.IRequest;
import edu.asu.diging.gilesecosystem.requests.exceptions.MessageCreationException;
import edu.asu.diging.gilesecosystem.requests.impl.StorageRequest;
import edu.asu.diging.gilesecosystem.requests.service.IJsonMessageCreator;

public class KafkaRequestProducerTest {

    @Mock
    private IJsonMessageCreator messageCreator;

    @Mock
    private KafkaTemplate<Integer, String> template;

    @InjectMocks
    private KafkaRequestProducer producerToTest;

    @Before
    public void setUp() {
        producerToTest = new KafkaRequestProducer();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_sendRequest_valid() throws MessageCreationException {
        // setup
        String message = "jsonMessage";
        String topic = "topic";
        IRequest request = new StorageRequest();

        // mocking
        Mockito.when(messageCreator.createMessage(request)).thenReturn(message);

        // test
        producerToTest.sendRequest(request, topic);

        // assertion
        Mockito.verify(template).send(topic, message);
    }

    @Test(expected=MessageCreationException.class)
    public void test_sendRequest_requestIsNull() throws MessageCreationException {
        // setup
        String topic = "topic";
        
        // mocking
        Mockito.when(messageCreator.createMessage(null)).thenThrow(
                new MessageCreationException());
        
        // test
        producerToTest.sendRequest(null, topic);
    }
}
