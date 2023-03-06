package com.program4;

public interface IWords {

    /**
     * Returns a randomly chosen word of the type defined by this implementation.
     * @return a word of the type defined by this implementation
     */
    String getChoices() throws ArrayIndexOutOfBoundsException;
}
