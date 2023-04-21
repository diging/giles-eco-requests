package edu.asu.diging.gilesecosystem.requests.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.FileType;
import edu.asu.diging.gilesecosystem.requests.IStorageRequest;

/**
 * A request to Kafka to store a file.
 * 
 * @author jdamerow
 *
 */
public class StorageRequest extends Request implements IStorageRequest {
    
    public final static String REQUEST_TYPE = "giles.request_type.storage";
    
    @JsonProperty
    private FileType fileType;
    
    @JsonProperty
    private String username;
    
    @JsonProperty
    private String uploadDate;
    
    @JsonProperty
    private String filename;
    
    @JsonProperty
    private int pageNr;
    
    @JsonProperty
    private boolean imageExtracted;
   
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
    public String getUploadDate() {
        return uploadDate;
    }
    @Override
    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }
    @Override
    public String getFilename() {
        return filename;
    }

    @Override
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String getType() {
        return REQUEST_TYPE;
    }
    
    @Override
    public void setPageNr(int pageNr) {
        this.pageNr = pageNr;
    }
    
    @Override
    public int getPageNr() {
        return this.pageNr;
    }
    
    @Override
    public boolean getImageExtracted() {
        return imageExtracted;
    }

    @Override
    public void setImageExtracted(boolean imageExtracted) {
        this.imageExtracted = imageExtracted;
    }
}
