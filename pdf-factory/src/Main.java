import DocumentFacotry.DocumentFactory;
import DocumentFacotry.PDFDocumentFactory;
import DocumentFacotry.WordDocumentFactory;

public class Main {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        DocumentFactory wordFactory = new WordDocumentFactory();

        pdfFactory.openDocument();
        pdfFactory.saveDocument();
        pdfFactory.closeDocument();

        wordFactory.openDocument();
        wordFactory.saveDocument();
        wordFactory.closeDocument();
    }
}
