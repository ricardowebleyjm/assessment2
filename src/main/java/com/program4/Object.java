package com.program4;

import java.util.Scanner;

public class Object implements IWords{
    private String[] options = {"over the fence", "into the water", "through the trees", "around the corner"};

    /**
     * Returns a randomly chosen word of the type defined by this implementation.
     *
     * @return a word of the type defined by this implementation
     */
    @Override
    public String getChoices() {
        // Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to choose an object
        System.out.println("Choose an object:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1) + ". " + options[i]);
        }
        int index = scanner.nextInt() - 1;

        // Return the chosen object
        return options[index];
    }
}
