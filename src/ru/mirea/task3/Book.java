package ru.mirea.task3;

public class Book {
    String author;
    String title;
    int yearsWriting;
    int pages;
    Book (String title, String author, int yearsWriting, int pages){
        this.author=author;
        this.title = title;
        this.yearsWriting = yearsWriting;
        this.pages = pages;
    }
    Book (){}
    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearsWriting(int yearsWriting) {
        this.yearsWriting = yearsWriting;
    }

    public int getYearsWriting() {
        return yearsWriting;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }


    public String toString() {
        System.out.println("Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearsWriting=" + yearsWriting +
                ", pages=" + pages +
                '}');
        return ".";
    }
}
