package collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();

        liste.add("Ankara");
        liste.add("Diyarbakır");
        liste.add("istanbul");
        liste.add("Siirt");
        liste.add("Bolu");
        liste.clear();

        Object[] objectArr = liste.toArray();
        String[] str = liste.toArray(new String[0]);
        System.out.println(str[0]);

    }
}
