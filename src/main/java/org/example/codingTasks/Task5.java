package org.example.codingTasks;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        char[]arr1=str1.toCharArray();
        char[]arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String strSort1=Arrays.toString(arr1);
        String strSort2=Arrays.toString(arr2);

        if (strSort1.equals(strSort2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not anagram");
        }




    }
}
