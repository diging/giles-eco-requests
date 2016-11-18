package edu.asu.diging.gilesecosystem.requests.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.ICompletedOCRRequest;

public class CompletedOCRRequest extends OCRRequest implements ICompletedOCRRequest {

    public final static String REQUEST_TYPE = "giles.request_type.ocr.complete";
    
    @JsonProperty
    private String ocrDate;
    
    @JsonProperty
    private String textFilename;
    
    @JsonProperty
    private long size;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedOCRRequest#getOcrDate()
     */
    @Override
    public String getOcrDate() {
        return ocrDate;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedOCRRequest#setOcrDate(java.lang.String)
     */
    @Override
    public void setOcrDate(String ocrDate) {
        this.ocrDate = ocrDate;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedOCRRequest#getTextFilename()
     */
    @Override
    public String getTextFilename() {
        return textFilename;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedOCRRequest#setTextFilename(java.lang.String)
     */
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

    @Override
    public String getType() {
        return REQUEST_TYPE;
    }

}
