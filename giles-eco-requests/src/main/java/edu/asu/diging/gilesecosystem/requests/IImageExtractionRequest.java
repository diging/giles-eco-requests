package edu.asu.diging.gilesecosystem.requests;

public interface IImageExtractionRequest extends IRequest {

    public abstract String getFilename();

    public abstract void setFilename(String filename);

}