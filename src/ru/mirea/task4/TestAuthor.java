package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Poul", "poul1299@mail.ru", 'm');
        author.getGender();
        author.toString();
        author.getEmail();
        author.getName();
        author.setEmail("sfs@mail.ru");
        author.getEmail();
    }

}
