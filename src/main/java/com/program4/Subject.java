package com.program4;

import java.util.Scanner;
public class Subject implements IWords{
    // Create a Scanner to get user input
    Scanner scanner = new Scanner(System.in);

    // define subject options
    private String[] subjectOptions = {
            "The programmer",
            "The engineer",
            "The developer",
            "The designer",
            "The analyst",
            "The technician",
            "The project manager",
            "The database administrator",
            "The cyber security expert",
            "The systems administrator"
    };

    /**
     * Returns a randomly chosen word of the type defined by this implementation.
     *
     * @return a word of the type defined by this implementation
     */

    @Override
    public String getChoices() {
        try {
            // Prompt the user to choose a subject
            System.out.println("Choose a subject:");
            for (int i = 0; i < subjectOptions.length; i++) {
                System.out.println((i+1) + ". " + subjectOptions[i]);
            }
            int index = scanner.nextInt() - 1;

            // Return the chosen subject
            return subjectOptions[index];
        }catch (ArrayIndexOutOfBoundsException exe){
            System.err.println("Invalid choice, please try again.");

            // Rerun the getChoices in an exception occurred
            getChoices();
            return null;
        }
    }
}
