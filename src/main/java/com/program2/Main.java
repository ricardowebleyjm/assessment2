package com.program2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Get the input from the user
    System.out.print("Enter items to be sorted, separated by a comma: ");
    String items = input.nextLine();
    // Removing whitespaces and commas
    String[] array = items.split(",");
    System.out.print("Enter 1 to sort in alphanumeric order, or 2 to sort in reverse alphanumeric order: ");
    boolean order = input.nextBoolean();
    var sorter = new Sorter();
    sorter.sort(array, order);

    // Print the sorted items
    System.out.print("Sorted items: ");
    for (String item : array) {
        System.out.print(item + ",");
    }
}
}
