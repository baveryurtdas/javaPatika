package PatikaStore;

public class Notebook extends Product {
    int ram;
    String storage;
    String screenSize;
    String memory;

    public Notebook(int id, double unitPrice, double discountRate, int stockQuantity, String name, Brand brand, int ram, String screenSize, String memory) {
        super(id, unitPrice, discountRate, stockQuantity, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
        this.memory = memory;
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

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
