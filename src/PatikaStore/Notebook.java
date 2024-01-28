package PatikaStore;

public class Notebook extends Product{
    int ram;
    String storage;
    String screenSize;

    public Notebook(int id, double unitPrice, double discountRate, int stockQuantity, String name, Brand brand, int ram, String storage, String screenSize) {
        super(id, unitPrice, discountRate, stockQuantity, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
