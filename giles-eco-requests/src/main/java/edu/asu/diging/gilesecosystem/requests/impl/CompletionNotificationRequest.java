package edu.asu.diging.gilesecosystem.requests.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.ICompletionNotificationRequest;

public class CompletionNotificationRequest extends Request implements ICompletionNotificationRequest {

    public final static String REQUEST_TYPE = "giles.request_type.completion.notification";
    
    private String notifier;
    
    @JsonProperty
    private String filename;
    
    @JsonProperty
    private long size;
    
    @JsonProperty
    private String contentType;
    
    @JsonProperty
    private String extractionDate;
    
    @JsonProperty
    private String imageFilename;
    
    @JsonProperty
    private List<Page> pages;
    
    @JsonProperty
    private String generatedByService;

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletionNotificationRequest#getNotifier()
     */
    @Override
    public String getNotifier() {
        return notifier;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletionNotificationRequest#setNotifier(java.lang.String)
     */
    @Override
    public void setNotifier(String notifier) {
        this.notifier = notifier;
    }
    
    @Override
    public String getFilename() {
        return filename;
    }

    @Override
    public void setFilename(String textFilename) {
        this.filename = textFilename;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    
    @Override
    public String getExtractionDate() {
        return extractionDate;
    }

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
    public String getImageFilename() {
        return imageFilename;
    }

    @Override
    public void setImageFilename(String imgFilename) {
        this.imageFilename = imgFilename;
    }

    @Override
    public String getType() {
        return REQUEST_TYPE;
    }
    
    @Override
    public String getGeneratedByService() {
        return generatedByService;
    }

    @Override
    public void setGeneratedByService(String generatedByService) {
        this.generatedByService = generatedByService;
    }
}
