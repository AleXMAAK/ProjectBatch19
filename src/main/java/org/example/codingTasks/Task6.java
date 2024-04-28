package org.example.codingTasks;

import java.util.Locale;

public class Task6 {

    public static int countVowels(String str){
        int count=0;
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str="documentation";
        int vowelCount=countVowels(str);
        System.out.println("Number of vowels in the string "+str+": "+vowelCount);
    }
}
