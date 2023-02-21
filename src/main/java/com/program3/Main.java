package com.program3;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        // create a new BookList object
        var bookList = new BookList();

        while (true) {
            System.out.println();
            System.out.println("Welcome, Please select a choice below: ");
            System.out.println("1. Display all books ");
            System.out.println("2. View a book from the list ");
            System.out.println("3. Sort books ");
            System.out.println("4. Exit ");
            System.out.println("");
            System.out.print("Please select your choice.....: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookList.displayBooks();
                    break;
                case 2:
                    System.out.print("Please enter the book index: ");
                    int index = scanner.nextInt();
                    bookList.displayBook(index);
                    break;
                case 3:
                    System.out.println("Please select a sorting method:");
                    System.out.println("1. Sort books by book title ");
                    System.out.println("2. Sort books by the author  ");
                    System.out.println("3. Sort books by ISBN ");
                    System.out.println("4. Sort books by Publisher ");
                    System.out.println("5. Sort books by Release Year ");
                    System.out.println("");

                    int sortMethod = scanner.nextInt();

                    switch (sortMethod) {
                        case 1:
                            bookList.sortBooksByTitle();
                            break;
                        case 2:
                            bookList.sortBooksByAuthor();
                            break;
                        case 3:
                            bookList.sortBooksByISBN();
                            break;
                        case 4:
                            bookList.sortBooksByPublisher();
                            break;
                        case 5:
                            bookList.sortBooksByReleaseYear();
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                case 4:
                    System.exit(0);
                    break ;
                default:
                    main(null);
            }
        }
    }

}
