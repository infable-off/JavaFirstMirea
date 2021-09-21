package ru.mirea.task4;

public class Author {
    private String name;
    private String email;
    private char gender;

    public String getName (){
        return name;
    }

    public String getEmail (){
        return email;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public char getGender (){
        return gender;
    }

    public String toString() {
        System.out.println("автор: " + getName() + "   пол  : " + getGender() + "   на адрес элекстронной почты  " + getEmail());

        return  ("автор:" + getName() + "  пол: " + getGender() + "  на адрес элекстронной почты " + getEmail());
    }

    Author (String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

}

