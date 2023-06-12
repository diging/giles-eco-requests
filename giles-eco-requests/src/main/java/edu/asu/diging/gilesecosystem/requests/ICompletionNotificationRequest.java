package edu.asu.diging.gilesecosystem.requests;

import java.util.List;

import edu.asu.diging.gilesecosystem.requests.impl.Page;

/**
 * Requests of this type should be used to notify Giles about the completion of a 
 * process that is not part of the core Giles Ecosystem infrastructure.
 * 
 * @author jdamerow
 *
 */
public interface ICompletionNotificationRequest extends IRequest {

    /**
     * Returns an id to identify the sender of the request. The id should be
     * registred for Giles for display.
     * 
     * @return id of the sender of the request
     */
    public abstract String getNotifier();

    public abstract void setNotifier(String notifier);

    void setSize(long size);

    long getSize();

    void setFilename(String textFilename);

    String getFilename();

    void setContentType(String contentType);

    String getContentType();

    void setImageFilename(String imgFilename);

    String getImageFilename();

    void setPages(List<Page> pages);

    List<Page> getPages();

    void setExtractionDate(String extractionDate);

    String getExtractionDate();
    
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