package edu.asu.diging.gilesecosystem.requests;

import java.util.List;

public interface ICompletedTextExtractionRequest extends ITextExtractionRequest {

    public abstract String getExtractionDate();

    public abstract void setExtractionDate(String extractionDate);

    public abstract String getDownloadUrl();

    public abstract void setDownloadUrl(String downloadUrl);

    public abstract List<String> getPagesDownloadUrls();

    public abstract void setPagesDownloadUrls(List<String> pagesDownloadUrls);

    public abstract String getType();

    public abstract void setPagesDownloadPaths(List<String> pagesDownloadPaths);

    public abstract List<String> getPagesDownloadPaths();

    public abstract void setDownloadPath(String downloadPath);

    public abstract String getDownloadPath();

}