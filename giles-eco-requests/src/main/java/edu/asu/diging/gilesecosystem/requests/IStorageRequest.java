package edu.asu.diging.gilesecosystem.requests;

public interface IStorageRequest extends IRequest {

    public abstract String getPathToFile();

    public abstract void setPathToFile(String pathToFile);

    public abstract String getDownloadUrl();

    public abstract void setDownloadUrl(String downloadUrl);

    public abstract void setFileType(FileType fileType);

    public abstract FileType getFileType();

    public abstract void setUsername(String username);

    public abstract String getUsername();

    public abstract void setUploadDate(String uploadDate);

    public abstract String getUploadDate();

    public abstract void setFilename(String filename);

    public abstract String getFilename();
}