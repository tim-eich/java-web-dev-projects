package org.launchcode;

import java.util.Objects;

public class TrueFalse extends Questions {
    String correctAnswer;
    String candidateAnswer;

    public TrueFalse(String question, int pointValue, String correctAnswer) {
        super(question, pointValue);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayAnswer() {

    }

    @Override
    public void getCandidateAnswer() {
        System.out.println("Please respond T for true, or F for false");
        candidateAnswer = input.nextLine();
        validateAnswer();
    }

    @Override
    public void validateAnswer() {
        gradeQuestion(Objects.equals(candidateAnswer.toLowerCase(), correctAnswer));
        if (this.isCorrect()) {
            System.out.println("You answered correctly!");
        } else {
            System.out.println("Sorry, the answer you chose is incorrect.");
        }
    }


}
