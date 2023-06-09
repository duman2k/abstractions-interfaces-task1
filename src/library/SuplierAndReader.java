package library;

public class SuplierAndReader extends User implements Supplier, Reader{
    SuplierAndReader(String name) {
        super(name);
        System.out.println("Пользователь(поставщик-читатель) создан");
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
        System.out.println("Поставщик " + this.getName() + " доставил книгу '" + book + "'");
    }
}
