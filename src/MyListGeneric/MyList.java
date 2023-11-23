package MyListGeneric;

import java.util.Arrays;
import java.util.Objects;

public class MyList<T> implements IMyList<T> {
    private int size = 0;
    private int capacity;
    T[] arr;


    // Varsayılan constructor, kapasiteyi 10 olarak ayarlar ve diziyi oluşturur.
    public MyList() {
        this.capacity = 10;
        this.arr = (T[]) new Object[capacity];
    }

    // Belirtilen kapasiteye sahip constructor

    public MyList(int capacity) {
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
    }

    // Listenin mevcut boyutunu döndürür
    @Override
    public int size() {
        return size;
    }

    // Listenin kapasitesini döndürür
    @Override
    public int getCapacity() {
        return capacity;
    }

    // Eleman ekler, kapasite yetersizse iki katına çıkarır
    @Override
    public void add(T data) {
        if (size == capacity) {
            int newCapacity = capacity * 2;
            arr = Arrays.copyOf(arr, newCapacity);
            capacity = newCapacity;
        }
        arr[size++] = data;
    }

    // Belirtilen indeksteki elemanı döndürür
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) return null;
        return arr[index];
    }

    // Belirtilen indeksteki elemanı kaldırır
    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) return null;
        T removedItem = arr[index];
        arr[index] = null;
        for (int i = index + 1; i < size; i++) {
            if (arr[i] != null) {
                arr[i - 1] = arr[i];
                arr[i] = null;
            }
        }
        size--;
        return removedItem;
    }

    // Belirtilen indeksteki elemanı değiştirir
    @Override
    public T set(int index, T data) {
        if (index < 0 || index >= size) return null;
        arr[index] = data;
        return data;
    }

    // Listeyi string olarak temsil eden metot
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]);
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Belirtilen elemanın ilk indeksini döndürür

    @Override
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (data.equals(arr[i])) return i;
        }
        return -1;
    }

    // Belirtilen elemanın son indeksini döndürür

    @Override
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (data.equals(arr[i])) return i;
        }
        return -1;
    }

    // Liste boş mu kontrolü
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Listeyi bir dizi olarak döndürür

    @Override
    public T[] toArray() {
        return (T[]) Arrays.copyOf(arr, size);
    }

    // Listeyi temizler (elemanları null yapar ve boyutu sıfırlar)
    @Override
    public void clear() {
        Arrays.fill(arr, null);
        size = 0;
    }

    // Belirtilen aralıktaki alt liste
    @Override
    public MyList<T> subList(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) {
            throw new IndexOutOfBoundsException();
        }
        MyList<T> subList = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            subList.add(get(i));
        }
        return subList;
    }

    // Belirtilen elemanın listede olup olmadığını kontrol eder
    @Override
    public boolean contains(T data) {
        for (int i = 0; i < size; i++) {
            if (data.equals(arr[i])) return true;
        }
        return false;
    }

}
