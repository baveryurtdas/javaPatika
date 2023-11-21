package MyListGeneric;

import java.util.Arrays;
import java.util.Objects;

public class MyList<T> {
    int capacity;
    T[] list;
    T[] listTemp;
    int listSize = 0;

    public MyList() {
        this.capacity = 10;
    }

    public MyList(int capacity) {
        this.capacity = capacity;
    }



    public void pCapacity() {
        this.listTemp = (T[]) new Object[this.capacity];
        for (int i = 0; i < this.list.length; i++) {
            this.listTemp[i] = this.list[i];
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return this.listSize;
    }

    public void sizeC() {
        int a = 0;
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] != null) {
                a++;
            }
        }
        this.listSize = a;
    }

    public void add(T data) {
        if (this.size() < this.capacity) {
            list[this.listSize] = data;
            this.sizeC();
        } else {
            this.capacity = this.capacity * 2;
            this.list = Arrays.copyOf(list, this.capacity);
            list[this.listSize] = data;
            this.sizeC();

        }
    }

    @Override
    public String toString() {
        System.out.println("[");
        for (T x : list) {
            if (x != null) {
                System.out.println(x + ",");
            }
        }
        System.out.println("]");
        return "";
    }

    public T get(int index) {
        T x = this.list[index];
        return x;
    }

    public void remove(int index) {
        this.listSize--;
    }

    public void replaceForRemove(int index) {
        T[] listTemp2 = this.list;
        this.list[index] = null;
        for (int i = 0; i < listTemp2.length - 1; i++) {
            if (index == 0) {
                this.list[i] = listTemp2[i + 1];
            } else if (i < index) {
                this.list[i] = listTemp2[i];
            } else if (i > index) {
                this.list[i] = listTemp2[i + 1];
            }
        }
    }

    public void set(int index, T data) {
        this.list[index] = data;
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.list.length; i++) {
            if (data == this.list[i]) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (list[i] == data) {
                return i;
            }
        }

        return -1;
    }

    public boolean isEmpty() {
        if (this.size() == 0)
            return true;
        else return false;
    }

    public Object[] toArray() {
        Object[] tempObject = new Object[this.list.length];
        for (int i = 0; i < this.list.length; i++) {
            tempObject[i] = this.list[i];
        }
        return tempObject;
    }

    public MyList<T> subList(int s, int f) {
        MyList<T> sub = new MyList<>(f - s + 1);
        for (int i = s; i <= f; i++) {
            sub.add((T) this.list[i]);
        }
        return sub;
    }

    public boolean contains(T data) {
        for (int i = 0; i < this.list.length; i++) {
            if (data == this.list[i]) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < this.list.length; i++) {
            this.list[i] = null;
        }
    }
}
