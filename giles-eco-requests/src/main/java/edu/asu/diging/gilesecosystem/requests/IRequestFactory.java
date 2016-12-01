package edu.asu.diging.gilesecosystem.requests;

import edu.asu.diging.gilesecosystem.requests.impl.Request;

/**
 * Factory to create requests to be submitted to Kafka.
 * 
 * @author jdamerow
 *
 * @param <T> The type of {@link Request} this class handles.
 */
public interface IRequestFactory<T, V extends T> {

    public abstract T createRequest(String id, String uploadId) throws InstantiationException,
            IllegalAccessException;

    public abstract void config(Class<V> classToInstantiate);

}