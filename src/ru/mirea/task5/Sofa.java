package ru.mirea.task5;

public class Sofa extends Furniture{
    public Sofa(String name, String dayPr, int price){
        super.setDayPr(dayPr);
        super.setName(name);
        super.setPrice(price);
    }
    public void Sale(){
        System.out.println("Sale on"+ getName() + "\nPrice:" + getPrice()+ "\nDay pr" + getDayPr() + "\nSale 1%" );
    }
}
