package com.company.ex4;

public class AuthorTest {
    public static void main(String[] args) {
        Author author = new Author("Jhon", "JhonWork@gmail.en", 'M');
        System.out.println(author);
        author.setEmail("JhonEntertainment@gmail.en");
        System.out.println(author.getName());
        System.out.println(author.getGender());
        System.out.println(author.getEmail());
    }
}
