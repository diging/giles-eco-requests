package edu.asu.diging.gilesecosystem.requests.impl;


public class Page {

    private int pageNr;
    private String filename;
    private String pathToFile;
    private String downloadUrl;
    private String contentType;
    private long size;
    
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
}
