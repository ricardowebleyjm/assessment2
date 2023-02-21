package com.program3;

import java.util.ArrayList;
import java.util.Comparator;

import com.program3.entity.Book;


/**
 * The BookList class implements the BookInterface and provides a list of Book objects.
 */
public class BookList implements BookInterface {
    // An ArrayList of type Book.
    private final ArrayList<Book> booksList = new ArrayList<>();
    public BookList() {
        // Adding initial books to the list
        initiliseBookList();
    }

    /**
     * Displays a book with of the index position that was passed in
     * @param index The index position of the book
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
      Display all available books
     */
    @Override
    public void displayBooks() {
        if(booksList.isEmpty()){
            System.out.println("No books are available at this time");
            return;
        }
        // Look through the booksList and print the details of each book.
        for (Book book: booksList){
            System.out.println(book.toString());
        }
    }


    /**
     * Sort books  by title
     */
    @Override
    public void sortBooksByTitle() {
        // Sorting the booksList based on the bookTitle
        booksList.sort(Comparator.comparing(Book::getBookTitle));
        // Loop through the sorted booksList and print the details of each book.
        System.out.println("Books sorted by title \n");
        for(Book book: booksList) {
            System.out.println(book);
        }
    }

    /**
     * Sort books by author
     */
    @Override
    public void sortBooksByAuthor() {
        // Sorting the booksList based on the Author
        booksList.sort(Comparator.comparing(Book::getAuthor));
        // Loop through the sorted booksList and print the details of each book.
        System.out.println("Books sorted by Author \n");
        for(Book book: booksList) {
            System.out.println(book);
        }
    }

    /**
     * Sort books by ISBN
     */
    @Override
    public void sortBooksByISBN() {
        // Sorting the booksList based on the ISBN
        booksList.sort(Comparator.comparing(Book::getIsbn));
        // Loop through the sorted booksList and print the details of each book.
        System.out.println("Books sorted by ISBN \n");
        for(Book book: booksList) {
            System.out.println(book);
        }
    }

    /**
     * Sort books by publisher
     */
    @Override
    public void sortBooksByPublisher() {
        // Sorting the booksList based on the bookTitle
        booksList.sort(Comparator.comparing(Book::getPublisher));
        // Loop through the sorted booksList and print the details of each book.
        System.out.println("Books sorted by Publisher \n");
        for(Book book: booksList) {
            System.out.println(book);
        }
    }

    /**
     * Sort books by release year
     */
    @Override
    public void sortBooksByReleaseYear() {
        // Sorting the booksList based on the releaseYear
        booksList.sort(Comparator.comparing(Book::getReleaseYear));
        // Loop through the sorted booksList and print the details of each book.
        System.out.println("Books sorted by Release Year \n");
        for(Book book: booksList) {
            System.out.println(book);
        }

    }

    /**
     * Add initial book to the book list
     */
    @Override
    public void initiliseBookList() {
        // Adding 10 books to the list
        booksList.add(new Book("To Kill a Mockingbird", "Harper Lee", "BK100", "Grand Central Publishing", 1960));
        booksList.add(new Book("1984", "George Orwell", "BK101", "Signet Classic", 1949));
        booksList.add(new Book("The Catcher in the Rye", "J.D. Salinger", "BK102", "Little, Brown and Company", 1951));
        booksList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "BK103", "Scribner", 1925));
        booksList.add(new Book("Pride and Prejudice", "Jane Austen", "BK104", "Penguin Classics", 1813));
        booksList.add(new Book("The Hobbit", "J.R.R. Tolkien", "BK105", "HarperCollins Publishers", 1937));
        booksList.add(new Book("Brave New World", "Aldous Huxley", "BK106", "Harper Perennial Modern Classics", 1932));
        booksList.add(new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", "BK107", "Harper Perennial Modern Classics", 1967));
        booksList.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", "BK108", "Houghton Mifflin Harcourt", 1954));
        booksList.add(new Book("The Color Purple", "Alice Walker", "BK109", "Mariner Books", 1982));
    }
}
