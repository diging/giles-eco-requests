package edu.asu.diging.gilesecosystem.requests.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.FileType;
import edu.asu.diging.gilesecosystem.requests.IStorageDeletionRequest;

public class StorageDeletionRequest extends Request implements IStorageDeletionRequest  {
    public final static String REQUEST_TYPE = "giles.request_type.storage_deletion";
    
    @JsonProperty
    private FileType fileType;
    
    @JsonProperty
    private String username;
    
    @JsonProperty
    private String storageFileId;
    
    @Override
    public String getType() {
        return REQUEST_TYPE;
    }
    
    @Override
    public FileType getFileType() {
        return fileType;
    }
    
    @Override
    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }
    
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
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
