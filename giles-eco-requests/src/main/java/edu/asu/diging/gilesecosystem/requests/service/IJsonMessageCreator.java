package edu.asu.diging.gilesecosystem.requests.service;

import edu.asu.diging.gilesecosystem.requests.IRequest;
import edu.asu.diging.gilesecosystem.requests.exceptions.MessageCreationException;

public interface IJsonMessageCreator {

    public String createMessage(IRequest request) throws MessageCreationException;
}
