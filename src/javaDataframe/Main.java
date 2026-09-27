package javaDataframe;

import java.util.*;

public class Main {
    static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student(23,"Luffy",38));
        student.add(new Student(12,"Zoro",36));
        student.add(new Student(10,"Sanjii",35));
        student.add(new Student(25,"Nami",33));
        student.add(new Student(12,"Robin",32));
        student.add(new Student(24,"Copper",31));

        System.out.println(student);

        Collections.sort(student);
        System.out.println(student);
        Collections.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.weight - o2.weight;
            }
        });
        System.out.println(student);
        Collections.sort(student,new weightCompartor());
        System.out.println(student);

        int[] arr = {5,9,1,3,6,4,8,};
        Arrays.sort(arr);
        for(int a:arr){
            System.out.println(a);
        }


        int[] arr1 = {1,4,5,8,4,7};












//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(50);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
    }
}
