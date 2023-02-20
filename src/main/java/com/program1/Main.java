package com.program1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Use a FibonacciCalculator object to perform the calculations.
        Fibonacci fibonacci = new FibonacciCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println();System.out.println("Welcome, Please select a choice below: ");
        System.out.println("1. The first 30 numbers of the Fibonacci sequence ");
        System.out.println("2. Find a number of the index in the Fibonacci sequence ");
        System.out.println("3. Find the range of number in the Fibonacci sequence ");
        System.out.println("4. Exit ");
        System.out.println("");
        System.out.print("Please select your choice.....: ");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("");
                // Print the first 30 numbers of the Fibonacci sequence.
                System.out.println("The first 30 numbers of the Fibonacci sequence are listed below");
                for (int i = 0; i < 30; i++) {
                    System.out.println(fibonacci.calculate(i) + " ");
                }
                System.out.println();
                break;
            case 2:
                // Prompt the user to enter an index number to print and print the result.
                System.out.print("Enter an index number to print: ");
                int index = scanner.nextInt();
                System.out.println("Fibonacci number at index " + index + " is " + fibonacci.calculate(index));
                break;
            case 3:
                // Prompt the user to enter a range to print and print the result.
                System.out.print("Enter a range to print (start-end): ");
                String choiceStartEnd = scanner.next();

                // Parse the user input into start and end respectively.
                String[] rangeArr = choiceStartEnd.split("-");
                int start = Integer.parseInt(rangeArr[0]);
                int end = Integer.parseInt(rangeArr[1]);

                try {
                    // Calculate the Fibonacci numbers in the specified range.
                    int[] range = fibonacci.calculateRange(start, end);

                    // Print the results.
                    System.out.println("Fibonacci numbers in range " + choiceStartEnd + ":");
                    for (int i : range) {
                        System.out.println(i + " ");
                    }
                    System.out.println();
                } catch (IllegalArgumentException exe) {
                    // Handle illegal arguments by showing an error message.
                    System.err.println( exe.getMessage());
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.exit(0);
        }

        scanner.close();
    }

}
