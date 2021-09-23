package ru.mirea.task5;

public class Mug extends Dish{
    public Mug(String color, String depth, String type){
        super.setTypeOfDishes(type);
        super.setDepth(depth);
        super.setColor(color);
    }
    public void eating(){
        System.out.println("The User is drinking ");
    }


    public String toString() {
        System.out.println("Types of dishes: " + getTypeOfDishes() + "\nColor: "+ getColor() + "\nDept: " + getDepth());
        return null;
    }
}
