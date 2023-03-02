package edu.asu.diging.gilesecosystem.requests;

public interface IStorageDeletionRequest extends IRequest {
    public abstract void setUsername(String username);

    public abstract String getUsername();
    
    public abstract void setFileType(FileType fileType);

    public abstract FileType getFileType();

    public abstract String getStorageFileId();

    public abstract void setStorageFileId(String storageFileId);
}
