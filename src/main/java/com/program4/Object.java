package com.program4;

import java.util.Scanner;

public class Object implements IWords{

    // Create a Scanner to get user input
    Scanner scanner = new Scanner(System.in);

    private String[] objectOptions = {"software applications",
            "IT infrastructure",
            "computer networks",
            "database systems",
            "web applications",
            "cloud computing solutions",
            "security protocols",
            "firewalls",
            "virtualization technology",
            "machine learning algorithms"
    };

    /**
     * Returns a randomly chosen word of the type defined by this implementation.
     * @return a word of the type defined by this implementation
     */
    @Override
    public String getChoices() {

        try{
            // Ask the user to choose an object
            System.out.println("Choose an object: ");
            for (int i = 0; i < objectOptions.length; i++) {
                System.out.println((i+1) + ". " + objectOptions[i]);
            }
            int index = scanner.nextInt() - 1;

            // Return the chosen object
            return objectOptions[index];
        }catch (ArrayIndexOutOfBoundsException exe){
            System.err.println("Invalid choice, please try again.");

            // Rerun the getChoices in an exception occurred
            getChoices();
            return null;
        }
   }
}
