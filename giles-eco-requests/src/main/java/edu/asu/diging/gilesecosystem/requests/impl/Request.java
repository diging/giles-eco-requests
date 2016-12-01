package edu.asu.diging.gilesecosystem.requests.impl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.IRequest;
import edu.asu.diging.gilesecosystem.requests.RequestStatus;

/**
 * Base class for all requests to be submitted to Kafka.
 * 
 * When subclassing this class, make sure to call super() if you override or overload the constructor.
 * 
 * @author jdamerow
 *
 */
public abstract class Request implements IRequest {
    
    @JsonProperty
    private String requestId;

    @JsonProperty
    private String requestType;

    @JsonProperty
    private String uploadId;
    
    @JsonProperty
    private String documentId;
    
    @JsonProperty
    private String fileId;
    
    @JsonIgnore
    private RequestStatus status; 
    
    @JsonProperty
    private String downloadUrl;
    
    @JsonProperty
    private String downloadPath;
    
    
    public Request() {
        setRequestType(getType());
    }
    
    /* (non-Javadoc)
     * @see edu.asu.giles.service.requests.impl.IRequest#getUploadId()
     */
    @Override
    public String getUploadId() {
        return uploadId;
    }
    /* (non-Javadoc)
     * @see edu.asu.giles.service.requests.impl.IRequest#setUploadId(java.lang.String)
     */
    @Override
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }
    /* (non-Javadoc)
     * @see edu.asu.giles.service.requests.impl.IRequest#getStatus()
     */
    @Override
    public RequestStatus getStatus() {
        return status;
    }
    /* (non-Javadoc)
     * @see edu.asu.giles.service.requests.impl.IRequest#setStatus(edu.asu.giles.service.requests.impl.RequestStatus)
     */
    @Override
    public void setStatus(RequestStatus status) {
        this.status = status;
    }
    
    @Override
    public String getDocumentId() {
        return documentId;
    }
    @Override
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
    @Override
    public String getRequestType() {
        return requestType;
    }
    @Override
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    @Override
    public String getRequestId() {
        return requestId;
    }
    @Override
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    
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
    
    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedImageExtractionRequest#getDownloadPath()
     */
    @Override
    public String getDownloadPath() {
        return downloadPath;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedImageExtractionRequest#setDownloadPath(java.lang.String)
     */
    @Override
    public void setDownloadPath(String downloadPath) {
        this.downloadPath = downloadPath;
    }
    
    @Override
    public String getFileId() {
        return fileId;
    }

    @Override
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
    
    
    @JsonIgnore
    public abstract String getType();
}
