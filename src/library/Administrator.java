package library;

public interface Administrator {
    boolean inStock(String book);
    void lend(Reader reader, String book);
    void overdueNotification(ReaderImpl reader);
    String getName();
}
