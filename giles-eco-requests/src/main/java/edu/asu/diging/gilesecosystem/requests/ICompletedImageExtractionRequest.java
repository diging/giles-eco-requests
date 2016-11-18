package edu.asu.diging.gilesecosystem.requests;

import java.util.List;

import edu.asu.diging.gilesecosystem.requests.impl.Page;

public interface ICompletedImageExtractionRequest extends IRequest {

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#getExtractionDate()
     */
    public abstract String getExtractionDate();

    /* (non-Javadoc)
     * @see edu.asu.diging.gilesecosystem.requests.impl.ICompletedTextExtractionRequest#setExtractionDate(java.lang.String)
     */
    public abstract void setExtractionDate(String extractionDate);

    public abstract List<Page> getPages();

    public abstract void setPages(List<Page> pages);

    public abstract String getImageFilename();

    public abstract void setImageFilename(String imgFilename);

}