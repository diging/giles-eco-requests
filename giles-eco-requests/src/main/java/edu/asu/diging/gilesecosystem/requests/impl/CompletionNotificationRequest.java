package edu.asu.diging.gilesecosystem.requests.impl;

import edu.asu.diging.gilesecosystem.requests.ICompletionNotificationRequest;

public class CompletionNotificationRequest extends Request implements ICompletionNotificationRequest {

    public final static String REQUEST_TYPE = "giles.request_type.completion.notification";
    
    private String notifier;

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletionNotificationRequest#getNotifier()
     */
    @Override
    public String getNotifier() {
        return notifier;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletionNotificationRequest#setNotifier(java.lang.String)
     */
    @Override
    public void setNotifier(String notifier) {
        this.notifier = notifier;
    }
    
    @Override
    public String getType() {
        return REQUEST_TYPE;
    }  
}
