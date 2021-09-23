package ru.mirea.task6;

public class TestPriceable {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Headphones headphones = new Headphones();
        System.out.println(phone.getPrice());
        System.out.println(headphones.getPrice());
    }
}
