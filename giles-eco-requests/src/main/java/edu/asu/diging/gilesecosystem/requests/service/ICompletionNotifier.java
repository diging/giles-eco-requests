package edu.asu.diging.gilesecosystem.requests.service;

import edu.asu.diging.gilesecosystem.requests.ICompletedStorageRequest;
import edu.asu.diging.gilesecosystem.requests.RequestStatus;

public interface ICompletionNotifier {

    void sendNotification(ICompletedStorageRequest request, RequestStatus status);

}