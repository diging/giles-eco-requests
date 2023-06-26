package edu.asu.diging.gilesecosystem.requests;

public interface IStorageRequest extends IRequest {

    public abstract void setFileType(FileType fileType);

    public abstract FileType getFileType();

    public abstract void setUsername(String username);

    public abstract String getUsername();

    public abstract void setUploadDate(String uploadDate);

    public abstract String getUploadDate();

    public abstract void setFilename(String filename);

    public abstract String getFilename();

    /**
    Checks if the the file is a derived file.
    @return {@code true} if the file is derived from a non base component, {@code false} otherwise.
    */
    public abstract boolean isDerivedFile();
    
    /**
    Sets the value if a file is dervied from a non base component or not.
    @param derivedFile {@code true} the file is derived from a non base component, {@code false} otherwise.
    */
    public abstract void setDerivedFile(boolean derivedFile);
}
