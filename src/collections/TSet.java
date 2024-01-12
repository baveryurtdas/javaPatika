package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>(new OrderNameComporate().reversed());


        for(Student stu : students){
            System.out.println(stu.getName());
        }

    }
}
