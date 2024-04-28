package org.example.codingTasks;

public class Task1 {
    public static void main(String[] args) {

        String str1="Hello Java";
        String str2="Java is easy";

        System.out.println("Str1 before swap: "+str1+" Str2 before swap: "+str2);

        str1=str1+str2;
        str2=str1.substring(0, str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("Str1 after swap: "+str1+" Str2 after swap: "+str2);




    }
}
