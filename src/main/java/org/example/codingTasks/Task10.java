package org.example.codingTasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {

        List<String>list=new ArrayList<>();
        list.add("Mazda");
        list.add("Toyota");
        list.add("Porsche");
        list.add("Mazda");
        list.add("Mazda");
        list.add("Tesla");
        System.out.println(new HashSet<>(list));
    }
}
