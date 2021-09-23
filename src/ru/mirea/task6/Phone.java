package ru.mirea.task6;

public class Phone implements Priceable{
    int price = 160000;

    @Override
    public int getPrice() {
        return price;
    }
}
