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
    private List<Page> pages;
    
    @JsonProperty
    private long size;

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
    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void setSize(long size) {
        this.size = size;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#getType()
     */
    @Override
    public String getType() {
        return REQUEST_TYPE;
    }
}
