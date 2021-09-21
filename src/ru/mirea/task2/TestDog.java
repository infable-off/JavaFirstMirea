package ru.mirea.task2;

import java.util.Scanner;

public class TestDog {
    int size = 0;
    Dog[] dog = new Dog[10];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TestDog testDog = new TestDog();
        while (true) {
            String name = input.next();
            if (name.equals("0")) {
                break;
            } else {
                int age = input.nextInt();
                testDog.newDog(name, age);
            }
        }
        for (int i = 0; i < testDog.getSize(); i++){
            testDog.toString(i);
        }
    }

    private void newDog(String name, int age){
        dog[size] = new Dog(name, age);
        size++;
        if (size == dog.length){
            Dog[] dog1 = new Dog[dog.length*2];
            for(int i = 0; i < dog.length; i++){
                dog1[i] = dog[i];
            }
            dog = dog1;
        }
    }

    private int getSize(){
        return size;
    }

    void toString(int i){
        Dog.toString(dog[i]);
    }
}
