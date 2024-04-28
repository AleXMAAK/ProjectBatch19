package org.example.codingTasks;

public class Task9 {
    public static void nonRepeating(String str){
        for (int i = 0; i < str.length(); i++) {

            if(str.indexOf(str.charAt(i)+1)==-1){
                System.out.println("First Non-Repeating Character in a String "+str.charAt(i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        String str="abracadabra";
        nonRepeating(str);
    }
}


