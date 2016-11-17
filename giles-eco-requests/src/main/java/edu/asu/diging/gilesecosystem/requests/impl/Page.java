package edu.asu.diging.gilesecosystem.requests.impl;


public class Page {

    private int pageNr;
    private String filename;
    private String pathToFile;
    private String downloadUrl;
    
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
}
