package com.program3;

import java.util.ArrayList;
import java.util.List;

public class Book implements BookImpl {
    private String bookTitle;
    private String author;
    private int isbn;
    private String publisher;
    private int releaseYear;
    private List<Book> bookList = new ArrayList<>();

    public Book (){
    }

    public Book(String bookTitle, String author, int isbn, String publisher, int releaseYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
       // this.initialBooks();
    }

    public void addBook(Book book){
        bookList.add(book);
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
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

    /**
     *
     */
    @Override
    public void displayBook() {

    }

    /**
     *
     */
    @Override
    public void searchBook() {

    }

    /**
     *
     */
    @Override
    public void initialBooks() {
        Book book1 = new Book("Hello Java", "Ricardo Webley", 2233453, "Mike", 2023);
        Book book2 = new Book("Hello ", "Ricardo Webley", 2233453, "Mike", 2023);

        Book b = new Book();
        b.addBook(book1);
        b.addBook(book2);
    }

    @Override
    public String toString() {
       return "Book Title: " + bookTitle + "\n Author: "+ author + "\n publisher: " +
               publisher + "\n Release Year: " + releaseYear + "\n";
    }

    public void printBooks(){
        if (bookList.isEmpty()) {
            System.out.println("No books available");
            return;
        }

        for(Book book: bookList){
            System.out.println(book.toString());
        }
    }


}
