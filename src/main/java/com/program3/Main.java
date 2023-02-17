package com.program3;



public class Main {
    public static void main(String args[]){
    Book b = new Book();
       //b.initialBooks();
        Book book1 = new Book("Hello Java", "Ricardo Webley", 2233453, "Mike", 2023);
        Book book2 = new Book("Java Swing ", "Ricardo Webley", 2233453, "Mike", 2023);
        b.addBook(book2);
        b.addBook(book1);
        b.printBooks();

    }



}
