package com.program3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.program3.entity.Book;


public class BookList implements BookInterface {
    private final ArrayList<Book> booksList = new ArrayList<>();
    public BookList() {
        initiliseBookList();
    }

    /**
     * @param index
     */
    @Override
    public void displayBook(int index) {
        if (index >= 0 && index < booksList.size()) {
            System.out.println(booksList.get(index));
        } else {
            System.out.println("Book was not found");
        }
    }

    /**
     *
     */
    @Override
    public void displayBooks() {
        if(booksList.isEmpty()){
            System.out.println("No books are available at this time");
            return;
        }
        for (Book book: booksList){
            System.out.println(book.toString());
        }
    }


    /**
     *
     */
    @Override
    public void sortBooksByTitle() {
        Collections.sort(booksList, Comparator.comparing(Book::getBookTitle));
        System.out.println("Books sorted by title \n");
        for(Book book: booksList) {
            System.out.println(book);
        }
    }

    /**
     *
     */
    @Override
    public void sortBooksByAuthor() {
        Collections.sort(booksList, Comparator.comparing(Book::getAuthor));
    }

    /**
     *
     */
    @Override
    public void sortBooksByISBN() {
        Collections.sort(booksList, Comparator.comparing(Book::getIsbn));
    }

    /**
     *
     */
    @Override
    public void sortBooksByPublisher() {
        Collections.sort(booksList, Comparator.comparing(Book::getIsbn));
    }

    /**
     *
     */
    @Override
    public void sortBooksByReleaseYear() {
        Collections.sort(booksList, Comparator.comparing(Book::getReleaseYear));
    }

    /**
     *
     */
    @Override
    public void initiliseBookList() {
        // Add 10 books to the list
        booksList.add(new Book("To Kill a Mockingbird", "Harper Lee", "9780446310789", "Grand Central Publishing", 1960));
        booksList.add(new Book("1984", "George Orwell", "9780451524935", "Signet Classic", 1949));
        booksList.add(new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769174", "Little, Brown and Company", 1951));
        booksList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", "Scribner", 1925));
        booksList.add(new Book("Pride and Prejudice", "Jane Austen", "9780141439518", "Penguin Classics", 1813));
        booksList.add(new Book("The Hobbit", "J.R.R. Tolkien", "9780261103344", "HarperCollins Publishers", 1937));
        booksList.add(new Book("Brave New World", "Aldous Huxley", "9780060850524", "Harper Perennial Modern Classics", 1932));
        booksList.add(new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", "9780060883287", "Harper Perennial Modern Classics", 1967));
        booksList.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", "9780618640157", "Houghton Mifflin Harcourt", 1954));
        booksList.add(new Book("The Color Purple", "Alice Walker", "9780156028356", "Mariner Books", 1982));
    }
}
