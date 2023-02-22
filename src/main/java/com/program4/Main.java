package com.program4;

public class Main {
    public static void main(String[] args) {
        // Use instances of IWords to construct the sentence in SVO format
        var subject = new Subject();
        var verb = new Verb();
        var object = new Object();

        String sentence = subject.getChoices()+ " " + verb.getChoices() + " " + object.getChoices() + ".";

        // Output
        System.out.println(sentence);
    }
}
