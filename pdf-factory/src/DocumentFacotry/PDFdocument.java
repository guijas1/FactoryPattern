package DocumentFacotry;

public class PDFdocument implements  Document{


    @Override
    public void open() {
        System.out.println("Abrindo documento PDF");
    }

    @Override
    public void save() {
        System.out.println("Salvando o documento PDF");
    }

    @Override
    public void close() {
        System.out.println("Fechando o documento PDF");
    }
}
