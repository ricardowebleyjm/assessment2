package com.program4;

import java.util.Scanner;
public class Subject implements IWords{
    // Create a Scanner to get input from the console
    Scanner scanner = new Scanner(System.in);
    // define subject options
    private String[] subjectOptions = {"The cat", "My dog", "The bird", "The elephant"};

    /**
     * Returns a randomly chosen word of the type defined by this implementation.
     *
     * @return a word of the type defined by this implementation
     */

    @Override
    public String getChoices() {
        // Prompt the user to choose a subject
        System.out.println("Choose a subject:");
        for (int i = 0; i < subjectOptions.length; i++) {
            System.out.println((i+1) + ". " + subjectOptions[i]);
        }
        int index = scanner.nextInt() - 1;

        // Return the chosen subject
        return subjectOptions[index];
    }
}
