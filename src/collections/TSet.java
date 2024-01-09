package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>(new OrderNameComporate().reversed());
        students.add(new Student("Bawer",20));
        students.add(new Student("Ahmet",100));
        students.add(new Student("Mustafa",45));
        students.add(new Student("Cemre",60));
        students.add(new Student("Damla",80));
        students.add(new Student("Damla",80));

        for(Student stu : students){
            System.out.println(stu.getName());
        }

    }
}
