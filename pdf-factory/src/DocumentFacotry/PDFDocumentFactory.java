package DocumentFacotry;

public class PDFDocumentFactory extends DocumentFactory{

    @Override
    public Document createDocument() {
        return new PDFdocument();
    }
}
