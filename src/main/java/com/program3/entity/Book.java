package com.program3.entity;

import java.util.ArrayList;
import java.util.List;

public class Book{
    private String bookTitle;
    private String author;
    private String isbn;
    private String publisher;
    private int releaseYear;
    private List<Book> bookList = new ArrayList<>();

    public Book(){}

    public Book(String bookTitle, String author, String isbn, String publisher, int releaseYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


    @Override
    public String toString() {
        return "Book Title: " + getBookTitle() + ", Author: " + getAuthor() + ", ISBN: " + getIsbn() + ", Publisher: " +
                getPublisher() + ", Release Year: " + getReleaseYear();
    }

}
