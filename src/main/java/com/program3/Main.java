package com.program3;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();

        System.out.println();
        System.out.println("Welcome, Please select a choice below: ");
        System.out.println("1. Display all books ");
        System.out.println("2. View a book from the list ");
        System.out.println("3. Sort books ");
        System.out.println("");
        System.out.print("Please select your choice.....: ");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                bookList.displayBooks();
                break;
            case 2:
                System.out.print("Please enter the book index: ");
                int index = scanner.nextInt();
                bookList.displayBook(index);
                break;
            case 3:
                System.out.println("");
                System.out.println("Please select a sorting method:");
                System.out.println("1. Sort books by book title ");
                System.out.println("2. Sort books by the author  ");
                System.out.println("3. Sort books by ISBN");
                System.out.println("");
                int sortMethod = scanner.nextInt();
                switch (sortMethod){
                    case 1:
                        bookList.sortBooksByTitle();
                        break;
                }


        }

    }



}
