package edu.asu.diging.gilesecosystem.requests.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.ICompletedTextExtractionRequest;

public class CompletedTextExtractionRequest extends TextExtractionRequest implements ICompletedTextExtractionRequest {

    public final static String REQUEST_TYPE = "giles.request_type.text_extraction.complete";
    
    @JsonProperty
    private String extractionDate;
    
    @JsonProperty
    private String downloadUrl;
    
    @JsonProperty
    private String downloadPath;
    
    @JsonProperty
    private List<String> pagesDownloadUrls;
    
    @JsonProperty
    private List<String> pagesDownloadPaths;

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

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#getPagesDownloadUrls()
     */
    @Override
    public List<String> getPagesDownloadUrls() {
        return pagesDownloadUrls;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#setPagesDownloadUrls(java.util.List)
     */
    @Override
    public void setPagesDownloadUrls(List<String> pagesDownloadUrls) {
        this.pagesDownloadUrls = pagesDownloadUrls;
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
    public List<String> getPagesDownloadPaths() {
        return pagesDownloadPaths;
    }

    @Override
    public void setPagesDownloadPaths(List<String> pagesDownloadPaths) {
        this.pagesDownloadPaths = pagesDownloadPaths;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#getType()
     */
    @Override
    public String getType() {
        return REQUEST_TYPE;
    }
}
