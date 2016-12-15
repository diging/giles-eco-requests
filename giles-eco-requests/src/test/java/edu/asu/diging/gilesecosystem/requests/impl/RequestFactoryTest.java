package edu.asu.diging.gilesecosystem.requests.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.asu.diging.gilesecosystem.requests.IStorageRequest;
import edu.asu.diging.gilesecosystem.requests.RequestStatus;
import edu.asu.diging.gilesecosystem.requests.exceptions.MisconfigurationException;

public class RequestFactoryTest {

    private RequestFactory<IStorageRequest, StorageRequest> factoryToTest;
    
    @Before
    public void setUp() {
        factoryToTest = new RequestFactory<>();
    }
    
    @Test
    public void test_createRequest_success() throws InstantiationException, IllegalAccessException {
        factoryToTest.config(StorageRequest.class);
        
        final String ID = "id";
        final String UPLOAD_ID = "uploadId";
        
        IStorageRequest request = factoryToTest.createRequest(ID, UPLOAD_ID);
        
        Assert.assertEquals(ID, request.getRequestId());
        Assert.assertEquals(UPLOAD_ID, request.getUploadId());
        Assert.assertEquals(RequestStatus.NEW, request.getStatus());
    }
    
    @Test(expected =  MisconfigurationException.class)
    public void test_createRequest_notConfigured() throws InstantiationException, IllegalAccessException {
        final String ID = "id";
        final String UPLOAD_ID = "uploadId";
        
        factoryToTest.createRequest(ID, UPLOAD_ID);
    }
}
