package ru.mirea.task1;
import java.util.*;
public class Task1_6 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i<10;i++){
            arr[i] = (int) (Math.random()*1000);
            System.out.print(arr[i] + "   ");
        }
        System.out.println("    ");
        Arrays.sort(arr);
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
