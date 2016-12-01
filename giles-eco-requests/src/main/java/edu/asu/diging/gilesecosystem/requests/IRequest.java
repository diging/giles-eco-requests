package edu.asu.diging.gilesecosystem.requests;


public interface IRequest {

    public abstract String getUploadId();

    public abstract void setUploadId(String uploadId);

    public abstract RequestStatus getStatus();

    public abstract void setStatus(RequestStatus status);

    public abstract void setDocumentId(String documentId);

    public abstract String getDocumentId();

    public abstract void setRequestType(String requestType);

    public abstract String getRequestType();

    public abstract void setRequestId(String requestId);

    public abstract String getRequestId();

    public abstract String getDownloadUrl();

    public abstract void setDownloadUrl(String downloadUrl);

    public abstract String getDownloadPath();

    public abstract void setDownloadPath(String downloadPath);

    public abstract void setFileId(String fileId);

    public abstract String getFileId();

}