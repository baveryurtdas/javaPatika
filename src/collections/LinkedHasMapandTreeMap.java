package collections;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHasMapandTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,Student> students = new TreeMap<>(new OrderByNoComparator().reversed());

        students.put(102,new Student(102,"Baver",100));
        students.put(110,new Student(110,"Damla",25));
        students.put(108,new Student(108,"Ahmet",77));
        students.put(118,new Student(118,"Cemre",40));

        for(Student stu : students.values()){
            System.out.println(stu.getName());
        }


    }
}
