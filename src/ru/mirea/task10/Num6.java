package ru.mirea.task10;

import java.util.Scanner;

public class Num6 {
    private int n;
    private int divider;

    private Num6(int n){
        this.n = n;
        divider = 2;
    }

    private String isSimple(){
        if(divider == n){
            return "YES";
        }
        if(n%divider == 0){
            System.out.println("Divides by: " +divider);
            return "NO";
        }

        divider++;
        return isSimple();
    }
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Num6 simple = new Num6(n);
        System.out.println(simple.isSimple());
    }
}