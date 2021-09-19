package ru.mirea.task1;
import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        int i = 0;
        int sum1 = 0, n = 10,sum2 = 0,sum3 = 0;

        Scanner s = new Scanner(System.in);
        int[] a = new int[n];

        System.out.println("Введите массив");

        while ( i < n) {
            a[i]=s.nextInt();
            sum1=sum1+a[i];
            i++;
        }
        System.out.println(sum1);


        for (i = 0; i< n; i++){
            a[i] = s.nextInt();
            sum2+=a[i];
        }
        System.out.println(sum2);
        do {
            a[i]=s.nextInt();
            sum3+=+a[i];
            i++;

        }while (i<n);

        System.out.println(sum3);



        /*for (int k = 0; k <= 10; k++){
            a[i] = s.nextInt();
            sum += a[i];
        }*/
    }


}
