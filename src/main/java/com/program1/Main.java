package com.program1;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Use a MemoizedFibonacci object to perform the calculations.
        Fibonacci fibonacci = new MemoizedFibonacci();
        // Print the first 30 numbers of the Fibonacci sequence.
        System.out.println("The first 30 numbers of the Fibonacci sequence:");
        for (int i = 0; i < 300; i++) {
            System.out.println(fibonacci.calculate(i) + " ");
        }
        System.out.println();

        // Prompt the user to enter an index number to print and print the result.
        System.out.print("Enter an index number to print: ");
        int index = scanner.nextInt();
        System.out.println("Fibonacci number at index " + index + " is " + fibonacci.calculate(index));
        // Prompt the user to enter a range to print and print the result.
        System.out.print("Enter a range to print (start-end): ");
        String rangeString = scanner.next();

        // Parse the user input into start and end integers.
        String[] rangeParts = rangeString.split("-");
        int start = Integer.parseInt(rangeParts[0]);
        int end = Integer.parseInt(rangeParts[1]);

        try {
            // Calculate the Fibonacci numbers in the specified range.
            int[] range = fibonacci.calculateRange(start, end);

            // Print the results.
            System.out.println("Fibonacci numbers in range " + rangeString + ":");
            for (int i : range) {
                System.out.print(i + " ");
            }
            System.out.println();
        } catch (IllegalArgumentException exe) {
            // Handle illegal arguments by showing an error message.
            JOptionPane.showMessageDialog(null, exe.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            main(null);
        }

        scanner.close();
    }

}
