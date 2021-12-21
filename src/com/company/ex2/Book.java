package com.company.ex2;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book (String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String title) {
        this.title = title;
    }

    public void setPages(int year) {
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    @Override
    public String toString() {
        return "Title of the book: " + title + "\nAuthor: " + author + "\nYear: " + year;
    }
}
