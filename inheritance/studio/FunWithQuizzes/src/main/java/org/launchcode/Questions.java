package org.launchcode;
import java.util.Scanner;

public abstract class Questions {
    private String question;
    private boolean isCorrect;
    private int pointValue;

    public void displayQuestion() {
        System.out.println(question);
    }

    public void displayAnswers(String answer) {
        System.out.println(answer);
    }

    public String getCandidateAnswers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select an answer, or answers, from the options provided.");

        return input.nextLine();
    }
}
