package edu.asu.diging.gilesecosystem.requests.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.ITextExtractionRequest;

public class TextExtractionRequest extends Request implements ITextExtractionRequest {

    public final static String REQUEST_TYPE = "giles.request_type.text_extraction";
    
    @JsonProperty
    private String downloadUrl;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ITextExtractionRequest#getDownloadUrl()
     */
    @Override
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ITextExtractionRequest#setDownloadUrl(java.lang.String)
     */
    @Override
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    
    public String getType() {
        return REQUEST_TYPE;
    }
}
