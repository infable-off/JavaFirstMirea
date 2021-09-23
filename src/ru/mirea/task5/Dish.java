package ru.mirea.task5;

public abstract class Dish {
    private String TypeOfDishes;
    private String color;
    private String depth;//глубина посуды

    public abstract void eating();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getDepth() {
        return depth;
    }

    public String getTypeOfDishes() {
        return TypeOfDishes;
    }

    public void setTypeOfDishes(String typeOfDishes) {
        TypeOfDishes = typeOfDishes;
    }
}
