package library;

public class ReaderImpl extends User implements Reader{
    ReaderImpl(String name) {
        super(name);
    }

    @Override
    public void borrow(Administrator admin, String book) {
        System.out.println("Читатель " + this.getName() + " получил книгу '" + book + "' у администратора " + admin.getName());
    }

    @Override
    public void returnABook(String book) {
        System.out.println("Читатель вернул книгу '" + book + "'");
    }
}
