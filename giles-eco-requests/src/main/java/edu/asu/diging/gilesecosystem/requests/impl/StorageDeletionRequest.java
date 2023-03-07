package edu.asu.diging.gilesecosystem.requests.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.FileType;
import edu.asu.diging.gilesecosystem.requests.IStorageDeletionRequest;

public class StorageDeletionRequest extends Request implements IStorageDeletionRequest  {
    public final static String REQUEST_TYPE = "giles.request_type.storage_deletion";
    
    @JsonProperty
    private String storageFileId;
    
    @Override
    public String getType() {
        return REQUEST_TYPE;
    }
    
    @Override
    public String getStorageFileId() {
        return storageFileId;
    }

    @Override
    public void setStorageFileId(String storageFileId) {
        this.storageFileId = storageFileId;
    }
}
