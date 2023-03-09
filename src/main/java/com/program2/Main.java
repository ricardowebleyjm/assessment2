package com.program2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice  = 0;
        boolean order = false;

        // Get the input from the user
        System.out.print("Enter items to be sorted, separated by a comma: ");
        String items = input.nextLine();
        // Removing commas
        String[] array = items.split(",");
        System.out.print("Enter 1 to sort in alphanumeric order, or 2 to sort in reverse alphanumeric order: ");
        choice = input.nextInt();

        if(choice == 1){
            order = true;
        }
        if(choice == 2){
            order = false;
        }

        if (choice == 1 || choice == 2){
            var sorter = new Sorter();
            sorter.sort(array, order);

            // Print the sorted items
            System.out.print("Sorted items: ");
            for (String item : array) {
                System.out.print(item + ", ");
            }
        }else {
            System.err.println("Invalid selection");
        }
    }
}