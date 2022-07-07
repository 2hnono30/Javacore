package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien",25,"Ht");
        Student student1 = new Student("Nam",21,"Ht");
        Student student2= new Student("Phu",40,"Ht");
        Student student3 = new Student("Anh",30,"Ht");
        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st: lists
             ) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("so sanh tho tuoi:");
        for (Student st: lists
             ) {
            System.out.println(st.toString());
        }
    }
}
