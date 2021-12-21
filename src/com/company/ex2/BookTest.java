package com.company.ex2;

public class BookTest {
    public static void main(String[] args){
        Book book = new Book("Harry Potter and the prisoner of Azkaban", "Joanne Rowling", 1999);
        System.out.println(book);
        System.out.println("\n");
        book.setAuthor("Stephen King");
        book.setName("Green Mile");
        book.setPages(1996);
        System.out.println(book);
    }
}
