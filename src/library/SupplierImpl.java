package library;

public class SupplierImpl extends User implements Supplier{
    SupplierImpl(String name) {
        super(name);
    }

    @Override
    public void bring(String book) {
        System.out.println("Поставщик " + this.getName() + "принес книгу '" + book + "'");
    }
}
