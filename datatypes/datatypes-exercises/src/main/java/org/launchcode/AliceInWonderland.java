package org.launchcode;
import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures " +
                "or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        System.out.println("Please enter a term to search for within the first sentence of Alice's Adventures in Wonderland:");
        String searchTerm = input.nextLine();

        if (firstLine.toLowerCase().contains(searchTerm.toLowerCase())) {
            Integer searchIndex = firstLine.toLowerCase().indexOf(searchTerm.toLowerCase());
            String firstHalf = firstLine.substring(0,searchIndex);
            String secondHalf = firstLine.substring(searchIndex + searchTerm.length(), firstLine.length());
            String finalString = firstHalf + secondHalf;

            System.out.println("The term you entered is " + searchTerm.length() + " characters long and begins at index " + searchIndex);
            System.out.println(finalString.replace("  ", " "));
        } else {
            System.out.println("The first sentence of Alice's Adventures in Wonderland does not contain the term you entered.");
        }
    }
}