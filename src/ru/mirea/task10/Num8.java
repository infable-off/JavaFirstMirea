package ru.mirea.task10;

import java.util.Scanner;

public class Num8 {
    private String word;
    private int length;

    private Num8(String word){
        this.word = word;
    }

    private String isPalindrom(){
        length = word.length();
        if(length == 1){
            return "YES";
        }
        if(length == 2){
            if(word.charAt(0) == word.charAt(1)){
                return "YES";
            }
            else {
                return "NO";
            }
        }
        if(word.charAt(0) == word.charAt(length-1)){
            word = word.substring(1,length-1);
            return isPalindrom();
        }
        else {
            return "NO";
        }
    }


    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        Num8 result = new Num8(word);
        System.out.println(result.isPalindrom());
    }
}