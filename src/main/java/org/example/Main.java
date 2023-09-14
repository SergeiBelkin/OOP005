package org.example;

import task2.StudentService;
import task2.TeacherService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
//        Student st1 = new Student("Vasil",10,10);
//        Student st2 = new Student("Semen",2,20);
//        Teacher tc1 = new Teacher("Kris","al",50);
//        Teacher tc2 = new Teacher("Var","bio",39);
//        List<User> list = new ArrayList<>();
//        list.add(st1);
//        list.add(st2);
//        list.add(tc1);
//        list.add(tc2);
//        System.out.println(list);
//        list.sort(new UserComparator<User>());
//        System.out.println(list);
        StudentService studentService = new StudentService();
        studentService.create("All", 12, 31);
        studentService.create("Laa", 31, 21);
        studentService.create("Baa", 22, 19);
        System.out.println(studentService.getAll());
        TeacherService ts = new TeacherService();
        ts.create("olo", "bio", 33);
        ts.create("ruy",2, 47);
        System.out.println(ts.getAll());


    }
}