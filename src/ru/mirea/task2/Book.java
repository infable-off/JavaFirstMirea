package ru.mirea.task2;

public class Book {
    private int numOfPage;
    private String name;

    public void setNumOfPage (int numOfPage){this.numOfPage = numOfPage;}
    public void setName (String name){this.name = name;}

    Book (){}
    Book (int numOfPage, String name){setName(name);setNumOfPage(numOfPage);}
    public  String toString(){
        return this.name + ", name " + this.numOfPage + "pages";
    }

}