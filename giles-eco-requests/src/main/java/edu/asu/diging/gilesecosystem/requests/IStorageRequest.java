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
    
    public abstract void setPageNr(int pageNr);

    public abstract int getPageNr();
    
    /**
    Checks if the image has been extracted.
    @return {@code true} if the image has been extracted, {@code false} otherwise.
    */
    public abstract boolean getImageExtracted();
    
    /**
    Sets the image extraction status.
    @param imageExtracted {@code true} to indicate that the image has been extracted, {@code false} otherwise.
    */
    public abstract void setImageExtracted(boolean imageExtracted);
}