package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListt {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Baver");
        list.add("Baver");
        list.add("Yurtdas");
        list.add("Java");
        list.add("102");

        list.remove(1);

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("");

        for(String str : list){
            System.out.println(str);
        }
    }
}
