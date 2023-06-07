package library;

public class AdministratorImpl extends User implements Administrator{
    AdministratorImpl(String name) {
        super(name);
    }

    @Override
    public boolean inStock(String book) {
        return false;
    }

    @Override
    public void lend(Reader reader, String book) {
        if (inStock(book)) {
            System.out.println("Администратор " + this.getName() + " выдал книгу читателю " + reader.getName());
        } else {
            System.out.println("Книга не найдена");
        }
    }

    @Override
    public void overdueNotification(ReaderImpl reader) {
    }
}
