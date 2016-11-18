package edu.asu.diging.gilesecosystem.requests;

public interface ITextExtractionRequest extends IRequest {

    public abstract void setFilename(String filename);

    public abstract String getFilename();

}