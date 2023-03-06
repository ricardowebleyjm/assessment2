package com.program4;
import java.util.Scanner;

public class Verb implements IWords{

    // Create a Scanner to get user input
    Scanner scanner = new Scanner(System.in);
    // Define a set of possible verbs
    private String[] verbOptions = {
            "develops",
            "implements",
            "optimizes",
            "integrates",
            "maintains",
            "tests",
            "debugs",
            "configures",
            "deploys",
            "monitors"
    };

    /**
     * Returns a randomly chosen word of the type defined by this implementation.
     *
     * @return a word of the type defined by this implementation
     */
    @Override
    public String getChoices() {

        try {

            // Prompt the user to choose a verb
            System.out.println("Choose a verb:");
            for (int i = 0; i < verbOptions.length; i++) {
                System.out.println((i+1) + ". " + verbOptions[i]);
            }
            int index = scanner.nextInt() - 1;

            // Return the chosen verb
            return verbOptions[index];
        }catch (ArrayIndexOutOfBoundsException exe){
            System.err.println("Invalid choice, please try again.");

            // Rerun the getChoices in an exception occurred
            getChoices();
            return null;
        }
    }
}
