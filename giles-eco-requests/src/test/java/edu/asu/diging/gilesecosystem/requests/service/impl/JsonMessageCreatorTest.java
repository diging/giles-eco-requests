package edu.asu.diging.gilesecosystem.requests.service.impl;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.asu.diging.gilesecosystem.requests.FileType;
import edu.asu.diging.gilesecosystem.requests.IStorageRequest;
import edu.asu.diging.gilesecosystem.requests.RequestStatus;
import edu.asu.diging.gilesecosystem.requests.exceptions.MessageCreationException;
import edu.asu.diging.gilesecosystem.requests.impl.StorageRequest;

public class JsonMessageCreatorTest {

    private JsonMessageCreator creatorToTest;
    
    @Before
    public void setUp() {
        creatorToTest = new JsonMessageCreator();
    }
    
    @Test
    public void test_createMessage_storageRequest() throws MessageCreationException, IOException {
        IStorageRequest request = new StorageRequest();
        request.setDocumentId("docId");
        request.setDownloadPath("downloadPath");
        request.setDownloadUrl("downloadUrl");
        request.setFileId("fileId");
        request.setFilename("filename");
        request.setFileType(FileType.IMAGE);
        request.setRequestId("requestId");
        request.setRequestType("requestType");
        request.setStatus(RequestStatus.COMPLETE);
        request.setUploadDate("uplodadDate");
        request.setUploadId("uploadId");
        request.setUsername("username");
        
        String msg = creatorToTest.createMessage(request);
        
        String expected = IOUtils.toString(getClass().getResourceAsStream("/storageRequest.json"), "UTF-8");
        
        Assert.assertEquals(expected, msg);
    }
}
