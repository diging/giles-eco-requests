package edu.asu.diging.gilesecosystem.requests;

public interface ICompletedStorageRequest extends IStorageRequest {

    public abstract String getStorageDate();

    public abstract void setStorageDate(String storageDate);

    public abstract String getStoredFileId();

    public abstract void setStoredFileId(String fileId);

}