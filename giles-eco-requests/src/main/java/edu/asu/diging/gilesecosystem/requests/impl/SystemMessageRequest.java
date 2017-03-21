package edu.asu.diging.gilesecosystem.requests.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.asu.diging.gilesecosystem.requests.ISystemMessageRequest;

public class SystemMessageRequest extends Request implements ISystemMessageRequest {

    public final static String REQUEST_TYPE = "giles.request_type.system_message";
    
    @JsonProperty
    private String requestId;

    @JsonProperty
    private String requestType;

    @JsonProperty
    private String applicationId;
    
    @JsonProperty
    private String messageType;
    
    @JsonProperty
    private String title;
    
    @JsonProperty
    private String message;
    
    @JsonProperty
    private String stackTrace;
    
    @JsonProperty
    private String messageTime;

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ISystemMessageRequest#getRequestId()
     */
    @Override
    public String getRequestId() {
        return requestId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ISystemMessageRequest#setRequestId(java.lang.String)
     */
    @Override
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ISystemMessageRequest#getRequestType()
     */
    @Override
    public String getRequestType() {
        return requestType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ISystemMessageRequest#setRequestType(java.lang.String)
     */
    @Override
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ISystemMessageRequest#getApplicationId()
     */
    @Override
    public String getApplicationId() {
        return applicationId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ISystemMessageRequest#setApplicationId(java.lang.String)
     */
    @Override
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public String getMessageType() {
        return messageType;
    }

    @Override
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ISystemMessageRequest#getTitle()
     */
    @Override
    public String getTitle() {
        return title;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ISystemMessageRequest#setTitle(java.lang.String)
     */
    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ISystemMessageRequest#getMessage()
     */
    @Override
    public String getMessage() {
        return message;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ISystemMessageRequest#setMessage(java.lang.String)
     */
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ISystemMessageRequest#getStackTrace()
     */
    @Override
    public String getStackTrace() {
        return stackTrace;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ISystemMessageRequest#setStackTrace(java.lang.String)
     */
    @Override
    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    @Override
    public String getMessageTime() {
        return messageTime;
    }

    @Override
    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }

    @Override
    public String getType() {
        return REQUEST_TYPE;
    }
}
