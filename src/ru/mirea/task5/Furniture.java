package ru.mirea.task5;

public abstract class Furniture {
    private String name;
    private String dayPr;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setDayPr(String dayPr) {
        this.dayPr = dayPr;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDayPr() {
        return dayPr;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", dayPr='" + dayPr + '\'' +
                ", price=" + price +
                '}';
    }
}
