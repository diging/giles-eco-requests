package edu.asu.diging.gilesecosystem.requests.impl;

import edu.asu.diging.gilesecosystem.requests.PageStatus;

public class Page {

    private long id;
    private int pageNr;
    private String filename;
    private String pathToFile;
    private String downloadUrl;
    private String contentType;
    private long size;
    private PageStatus status;
    private String errorMsg;
    
    public int getPageNr() {
        return pageNr;
    }
    public void setPageNr(int pageNr) {
        this.pageNr = pageNr;
    }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getPathToFile() {
        return pathToFile;
    }
    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }
    public String getDownloadUrl() {
        return downloadUrl;
    }
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    public long getSize() {
        return size;
    }
    public void setSize(long size) {
        this.size = size;
    }
    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public PageStatus getStatus() {
        return status;
    }
    public void setStatus(PageStatus status) {
        this.status = status;
    }
    public String getErrorMsg() {
        return errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
