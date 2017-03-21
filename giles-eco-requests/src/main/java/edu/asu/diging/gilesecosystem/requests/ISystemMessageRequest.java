package edu.asu.diging.gilesecosystem.requests;


public interface ISystemMessageRequest extends IRequest {
    
    public final static String ERROR = "ERROR";
    public final static String WARNING = "WARNING";
    public final static String INFO = "INFO";
    public final static String DEBUG = "DEBUG";

    public abstract String getRequestId();

    public abstract void setRequestId(String requestId);

    public abstract String getRequestType();

    public abstract void setRequestType(String requestType);

    public abstract String getApplicationId();

    public abstract void setApplicationId(String applicationId);

    public abstract String getTitle();

    public abstract void setTitle(String title);

    public abstract String getMessage();

    public abstract void setMessage(String message);

    public abstract String getStackTrace();

    public abstract void setStackTrace(String stackTrace);

    public abstract void setMessageType(String messageType);

    public abstract String getMessageType();

    public abstract void setMessageTime(String messageTime);

    public abstract String getMessageTime();

}