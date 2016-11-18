package edu.asu.diging.gilesecosystem.requests;

public interface IOCRRequest extends IRequest {

    public abstract String getFilename();

    public abstract void setFilename(String filename);

    public abstract void setPagenr(int pagenr);

    public abstract int getPagenr();

    public abstract void setFileid(String fileid);

    public abstract String getFileid();

}