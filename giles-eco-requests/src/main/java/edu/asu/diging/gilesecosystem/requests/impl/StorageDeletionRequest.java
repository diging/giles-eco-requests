package edu.asu.diging.gilesecosystem.requests.impl;

import edu.asu.diging.gilesecosystem.requests.IStorageDeletionRequest;

public class StorageDeletionRequest extends Request implements IStorageDeletionRequest  {
    public final static String REQUEST_TYPE = "giles.request_type.storage_deletion";

    @Override
    public String getType() {
        return REQUEST_TYPE;
    }
}
