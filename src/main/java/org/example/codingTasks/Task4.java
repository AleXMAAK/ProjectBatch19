package org.example.codingTasks;

public class Task4 {
    public static void main(String[] args) {
        String originalStr="madam";
        StringBuilder strB=new StringBuilder(originalStr);
        strB.reverse();
        String reversedStr=strB.toString();
        if (originalStr.equals(reversedStr)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }


    }
}
