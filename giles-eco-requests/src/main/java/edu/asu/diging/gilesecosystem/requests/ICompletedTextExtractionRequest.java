package edu.asu.diging.gilesecosystem.requests;

import java.util.List;

import edu.asu.diging.gilesecosystem.requests.impl.Page;


public interface ICompletedTextExtractionRequest extends ITextExtractionRequest {

    public abstract String getExtractionDate();

    public abstract void setExtractionDate(String extractionDate);

    public abstract String getDownloadUrl();

    public abstract void setDownloadUrl(String downloadUrl);

    public abstract String getType();

    public abstract void setDownloadPath(String downloadPath);

    public abstract String getDownloadPath();

    public abstract void setPages(List<Page> pages);

    public abstract List<Page> getPages();

    public String getTextFilename();
    
    public void setTextFilename(String textFilename);

}