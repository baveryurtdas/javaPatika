package generic;

public class Student<T> implements IDatabase<T>{
    @Override
    public boolean insert(T data) {
        System.out.println(data + " veri eklendi");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println(data +" veri silindi");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println(data + "veri güncellendi");
        return true;
    }

    @Override
    public T select() {
        System.out.println("Veri seçildi.");
        return null;
    }
}
