package edu.asu.diging.gilesecosystem.requests.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.IOCRRequest;

public class OCRRequest extends Request implements IOCRRequest {

    public final static String REQUEST_TYPE = "giles.request_type.ocr";
    
    @JsonProperty
    private String filename;
    
    @JsonProperty
    private int pagenr;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.IOCRRequest#getFilename()
     */
    @Override
    public String getFilename() {
        return filename;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.IOCRRequest#setFilename(java.lang.String)
     */
    @Override
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    @Override
    public int getPagenr() {
        return pagenr;
    }

    @Override
    public void setPagenr(int pagenr) {
        this.pagenr = pagenr;
    }
    

    @Override
    public String getType() {
        return REQUEST_TYPE;
    }

}
