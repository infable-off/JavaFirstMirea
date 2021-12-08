package ru.mirea.task10;

import java.util.Scanner;

public class Num7 {
    private int n;
    private int start;
    private int divider;

    private Num7(int n){
        this.n = n;
        start = 2;
        divider = 1;
    }

    private void printSimple(){
        //System.out.println(start);
        if(start>=n){
            return;
        }
        if(divider==start){
            System.out.println("Result: " + start);
            start++;
            divider = 2;
            printSimple();
        }
        if(start%divider == 0){
            start++;
            divider = 2;
            printSimple();
        }
        divider++;
        printSimple();
    }

    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Num7 print = new Num7(n);
        print.printSimple();
    }
}