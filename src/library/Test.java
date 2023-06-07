package library;

public class Test {
    public static void main(String[] args) {
        AdministratorImpl admin = new AdministratorImpl("Виктор");
        LibrarianImpl librarian = new LibrarianImpl("Максат");
        ReaderImpl reader = new ReaderImpl("Айдын");
        SupplierImpl supplier = new SupplierImpl("Игорь");

        admin.lend(reader, "Алгебра");
        reader.borrow(admin, "Над пропастью во ржи");
        librarian.order(supplier);

        System.out.println();
        Person supplierNReader = new Person("Вася");
        supplierNReader.bring("Физика");

        supplierNReader.borrow(admin, "Музыка");
        supplierNReader.returnABook("Музыка");

        librarian.order(supplierNReader);


    }
}
