package edu.asu.diging.gilesecosystem.requests.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.ICompletedImageExtractionRequest;

public class CompletedImageExtractionRequest extends ImageExtractionRequest implements ICompletedImageExtractionRequest {

    public final static String REQUEST_TYPE = "giles.request_type.image_extraction.complete";
    
    @JsonProperty
    private String extractionDate;
    
    @JsonProperty
    private String imageFilename;
    
    @JsonProperty
    private List<Page> pages;

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#getExtractionDate()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedImageExtractionRequest#getExtractionDate()
     */
    @Override
    public String getExtractionDate() {
        return extractionDate;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#setExtractionDate(java.lang.String)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedImageExtractionRequest#setExtractionDate(java.lang.String)
     */
    @Override
    public void setExtractionDate(String extractionDate) {
        this.extractionDate = extractionDate;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedImageExtractionRequest#getPages()
     */
    @Override
    public List<Page> getPages() {
        return pages;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedImageExtractionRequest#setPages(java.util.List)
     */
    @Override
    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedImageExtractionRequest#getImageFilename()
     */
    @Override
    public String getImageFilename() {
        return imageFilename;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedImageExtractionRequest#setImageFilename(java.lang.String)
     */
    @Override
    public void setImageFilename(String imgFilename) {
        this.imageFilename = imgFilename;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#getType()
     */
    @Override
    public String getType() {
        return REQUEST_TYPE;
    }
}
