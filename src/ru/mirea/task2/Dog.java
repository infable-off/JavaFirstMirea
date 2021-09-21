package ru.mirea.task2;

public class Dog {
    String name;
    int age;
    Dog(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public int toHumans(int age){
        return (age*7);
    }


    public static void toString(Dog dog) {
        System.out.println("Name is " + dog.name + "\nAge is " + dog.age);
    }
}
