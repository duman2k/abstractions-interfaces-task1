package library;

public class LibrarianImpl extends User implements Librarian{
    LibrarianImpl(String name) {
        super(name);
    }

    @Override
    public void order(Supplier supplier) {
        System.out.println("Библиотекарь " + this.getName() + " заказал книгу у поставщика " + supplier.getName());
    }
}
