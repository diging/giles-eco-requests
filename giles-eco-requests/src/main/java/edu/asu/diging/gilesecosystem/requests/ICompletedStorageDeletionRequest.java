package edu.asu.diging.gilesecosystem.requests;

public interface ICompletedStorageDeletionRequest extends IRequest {
    public abstract String getStorageFileId();

    public abstract void setStorageFileId(String storageFileId);
}
