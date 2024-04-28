package org.example.codingTasks;

public class Task7 {

    public static int countWords(String str){
        String[] words=str.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        String str="Hello, World!";
        System.out.println("Number of words in the string: "+countWords(str));
    }
}
