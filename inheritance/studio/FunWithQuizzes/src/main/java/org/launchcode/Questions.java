package org.launchcode;
import java.util.Scanner;

public abstract class Questions {
    private final String question;
    private boolean isCorrect;
    private final int pointValue;

    Scanner input = new Scanner(System.in);

    public Questions(String question, int pointValue) {
        this.question = question;
        this.pointValue = pointValue;
    }

    public void displayQuestion() {
        System.out.println(question);
    }

    abstract void displayAnswer();
    abstract void getCandidateAnswer();
    abstract void validateAnswer();

    public int getPointValue() {
        return pointValue;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void gradeQuestion(boolean correct) {
        isCorrect = correct;
    }
}
