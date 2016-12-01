package edu.asu.diging.gilesecosystem.requests.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.ICompletedStorageRequest;

public class CompletedStorageRequest extends StorageRequest implements ICompletedStorageRequest {
    
    public final static String REQUEST_TYPE = "giles.request_type.storage.complete";

    @JsonProperty
    private String storageDate;
    
    @JsonProperty
    private String storedfileId;
    
    public CompletedStorageRequest() {
        this.setRequestType(REQUEST_TYPE);
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedStorageRequest#getStorageDate()
     */
    @Override
    public String getStorageDate() {
        return storageDate;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedStorageRequest#setStorageDate(java.lang.String)
     */
    @Override
    public void setStorageDate(String storageDate) {
        this.storageDate = storageDate;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedStorageRequest#getFileId()
     */
    @Override
    public String getStoredFileId() {
        return storedfileId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedStorageRequest#setFileId(java.lang.String)
     */
    @Override
    public void setStoredFileId(String fileId) {
        this.storedfileId = fileId;
    }
    
}
