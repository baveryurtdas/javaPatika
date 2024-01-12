package collections;

import java.util.*;

public class Queueue {
    public static void main(String[] args) {
        //Polimorfizm çok biçimlilik
//        Queue<String> q = new LinkedList<>();
//        q.add("Bawer");
//        q.add("Yurtdas");
//        q.offer("Patika");
//        q.offer("Dev");
//        System.out.println(q.peek());
//
//        System.out.println("#####");
//        Iterator<String> itr = q.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//
//        }

        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        q.add("Bawer");
        q.add("Yurtdas");
        q.add("Patika");
        q.add("Dev");

        System.out.println(q.peek());

    }
}
