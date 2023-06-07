package library;

public interface Reader{
    void borrow(Administrator admin, String book);
    void returnABook(String book);
    String getName();
}
