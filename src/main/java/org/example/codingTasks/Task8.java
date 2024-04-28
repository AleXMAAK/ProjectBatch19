package org.example.codingTasks;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<String>countries=new ArrayList<>();
        countries.add("Canada");
        countries.add("Ukraine");
        countries.add("USA");
        countries.add("Poland");
        countries.add("Austria");
        countries.removeIf(x-> (x.charAt(0)!='A'));
        String str=countries.toString();
        System.out.println(str.toLowerCase());
    }
}
