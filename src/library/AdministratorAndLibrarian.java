package library;

public class AdministratorAndLibrarian extends User implements Administrator, Librarian{
    AdministratorAndLibrarian(String name) {
        super(name);
        System.out.println("Пользователь(администратор-библиотекарь) создан");

    }

    @Override
    public boolean inStock(String book) {
        return false;
    }

    @Override
    public void lend(Reader reader, String book) {
        System.out.println("Администратор " + getName() + " выдал книгу, читателю " + reader.getName());
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println(reader.getName() + ", вы просрочили дату возврата книги. \nС уважением, администратор " + getName());
    }

    @Override
    public void order(Supplier supplier) {
        System.out.println("Библиотекарь " + this.getName() + " заказал книгу у поставщика " + supplier.getName());
    }
}
