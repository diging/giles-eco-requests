package edu.asu.diging.gilesecosystem.requests.impl;

import edu.asu.diging.gilesecosystem.requests.ICompletedStorageDeletionRequest;

public class CompletedStorageDeletionRequest extends StorageDeletionRequest implements ICompletedStorageDeletionRequest{
    public final static String REQUEST_TYPE = "giles.request_type.storage_deletion.complete";

    @Override
    public String getType() {
        return REQUEST_TYPE; 
    }

}
