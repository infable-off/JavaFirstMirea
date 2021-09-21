package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        Book deadLake = new Book();
        deadLake.title = "Dead Lake";
        deadLake.author = "Raichel Kein";
        deadLake.yearsWriting = 2017;
        deadLake.pages = 491;
        System.out.println(
        deadLake.getTitle() +
        deadLake.getAuthor()+
        deadLake.getYearsWriting() +
        deadLake.getPages());
        deadLake.toString();
    }


}
