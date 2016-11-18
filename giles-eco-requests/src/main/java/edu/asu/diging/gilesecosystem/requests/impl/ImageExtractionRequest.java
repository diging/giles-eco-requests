package edu.asu.diging.gilesecosystem.requests.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.IImageExtractionRequest;

public class ImageExtractionRequest extends Request implements IImageExtractionRequest {

    public final static String REQUEST_TYPE = "giles.request_type.image_extraction";
    
    
    @JsonProperty
    private String filename;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.IImageExtractionRequest#getFilename()
     */
    @Override
    public String getFilename() {
        return filename;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.IImageExtractionRequest#setFilename(java.lang.String)
     */
    @Override
    public void setFilename(String filename) {
        this.filename = filename;
    }    
    
    @Override
    public String getType() {
        return REQUEST_TYPE;
    }

}
