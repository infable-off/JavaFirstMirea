package ru.mirea.task2;

public class Shape {
    int a;
    int b;
    int c;
    int triangle;
    int square;
    public void setAB(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA(){
        return (a);
    }
    public int getB(){
        return b;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    Shape(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Shape(int a, int b){
        this.a = a;
        this.b = b;
    }

    Shape(){}


}
