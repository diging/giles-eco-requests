package edu.asu.diging.gilesecosystem.requests.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.ITextExtractionRequest;

public class TextExtractionRequest extends Request implements ITextExtractionRequest {

    public final static String REQUEST_TYPE = "giles.request_type.text_extraction";
    
    @JsonProperty
    private String filename;
    
    @Override
    public String getFilename() {
        return filename;
    }

    @Override
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public String getType() {
        return REQUEST_TYPE;
    }
}
