package edu.asu.diging.gilesecosystem.requests.impl;

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
    public String getType() {
        return REQUEST_TYPE;
    }  
}
