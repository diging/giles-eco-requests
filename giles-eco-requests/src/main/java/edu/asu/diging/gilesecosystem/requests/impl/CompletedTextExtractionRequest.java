package edu.asu.diging.gilesecosystem.requests.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.ICompletedTextExtractionRequest;

public class CompletedTextExtractionRequest extends TextExtractionRequest implements ICompletedTextExtractionRequest {

    public final static String REQUEST_TYPE = "giles.request_type.text_extraction.complete";
    
    @JsonProperty
    private String extractionDate;
    
    @JsonProperty
    private String textFilename;
    
    @JsonProperty
    private String downloadUrl;
    
    @JsonProperty
    private String downloadPath;
    
    @JsonProperty
    private List<Page> pages;

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#getExtractionDate()
     */
    @Override
    public String getExtractionDate() {
        return extractionDate;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#setExtractionDate(java.lang.String)
     */
    @Override
    public void setExtractionDate(String extractionDate) {
        this.extractionDate = extractionDate;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#getDownloadUrl()
     */
    @Override
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#setDownloadUrl(java.lang.String)
     */
    @Override
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public String getDownloadPath() {
        return downloadPath;
    }

    @Override
    public void setDownloadPath(String downloadPath) {
        this.downloadPath = downloadPath;
    }
    
    @Override
    public List<Page> getPages() {
        return pages;
    }

    @Override
    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    @Override
    public String getTextFilename() {
        return textFilename;
    }

    @Override
    public void setTextFilename(String textFilename) {
        this.textFilename = textFilename;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#getType()
     */
    @Override
    public String getType() {
        return REQUEST_TYPE;
    }
}
