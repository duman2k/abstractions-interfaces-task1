package library;

public class Person extends User implements Supplier, Reader{
    Person(String name) {
        super(name);
    }

    @Override
    public void borrow(Administrator admin, String book) {
        System.out.println("Читатель " + this.getName() + " получил книгу '" + book + "' у библиотекаря " + admin.getName());
    }

    @Override
    public void returnABook(String book) {
        System.out.println("Читатель вернул книгу '" + book + "'");
    }

    @Override
    public void bring(String book) {
        System.out.println("Поставщик " + this.getName() + " принес книгу '" + book + "'");
    }
}
