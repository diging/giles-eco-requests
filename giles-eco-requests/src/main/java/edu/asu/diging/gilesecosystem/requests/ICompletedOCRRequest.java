package edu.asu.diging.gilesecosystem.requests;


public interface ICompletedOCRRequest extends IOCRRequest {

    public abstract String getOcrDate();

    public abstract void setOcrDate(String ocrDate);

    public abstract String getTextFilename();

    public abstract void setTextFilename(String textFilename);

    public abstract void setSize(long size);

    public abstract long getSize();

}