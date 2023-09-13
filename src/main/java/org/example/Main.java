package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Student st1 = new Student("Vasil",10,10);
        Student st2 = new Student("Vasil",2,20);
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        System.out.println(list);

    }
}