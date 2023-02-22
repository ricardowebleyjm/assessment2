package com.program4;
import java.util.Scanner;

public class Verb implements IWords{
    // Define a set of possible verbs
    private String[] options = {"ran", "jumped", "flew", "swam"};

    /**
     * Returns a randomly chosen word of the type defined by this implementation.
     *
     * @return a word of the type defined by this implementation
     */
    @Override
    public String getChoices() {
        // Create a Scanner to get input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose a verb
        System.out.println("Choose a verb:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1) + ". " + options[i]);
        }
        int index = scanner.nextInt() - 1;

        // Return the chosen verb
        return options[index];
    }
}
