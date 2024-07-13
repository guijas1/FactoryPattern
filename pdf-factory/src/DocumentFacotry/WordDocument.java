package DocumentFacotry;

public class WordDocument implements Document{
    @Override
    public void open() {
        System.out.println("Abrindo documento Word.");
    }

    @Override
    public void save() {
        System.out.println("Salvando documento Word.");
    }

    @Override
    public void close() {
        System.out.println("Fechando documento Word.");
    }
}
