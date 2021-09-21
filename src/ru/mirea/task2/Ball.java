package ru.mirea.task2;

public class Ball {
    private int size;
    private String color;

    public void setSize(int size){
        this.size = size;
    }
    public void setColor(String color){
        this.color = color;
    }
    Ball (){

    }
    Ball (int size,String color){
        setSize(size);
        setColor(color);
    }
    public  String toString(){
        return this.size + ", size " + this.color;
    }
    public void intoSizeColor(){
        System.out.println(size+" - Size;" + color + "- Color");
    }
}