package edu.asu.diging.gilesecosystem.requests;

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
     * @return
     */
    public abstract String getNotifier();

    public abstract void setNotifier(String notifier);

    void setSize(long size);

    long getSize();

    void setFilename(String textFilename);

    String getFilename();

    void setContentType(String contentType);

    String getContentType();

}