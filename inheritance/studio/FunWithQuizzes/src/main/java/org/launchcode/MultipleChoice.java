package org.launchcode;

import java.util.ArrayList;

public class MultipleChoice extends Questions{
    // HashMap of potential answers associated with boolean value. The correct answer will be true.
    ArrayList<String> choices = new ArrayList<>();
    private final int correctAnswer;
    private int candidateAnswer;

    public MultipleChoice(String question, int pointValue, int correctAnswer, String choiceOne, String choiceTwo, String choiceThree, String choiceFour) {
        super(question, pointValue);
        this.correctAnswer = correctAnswer;
        this.choices.add(choiceOne);
        this.choices.add(choiceTwo);
        this.choices.add(choiceThree);
        this.choices.add(choiceFour);
    }

    @Override
    public void displayAnswer() {
        int counter = 1;
        for (String choice : choices) {
            System.out.println(counter + ": " + choice);
            counter++;
        }
    }

    @Override
    public void getCandidateAnswer() {
        System.out.println("Please enter the number of the correct answer:");
        candidateAnswer = input.nextInt();
        validateAnswer();
    }

    @Override
    public void validateAnswer() {
        gradeQuestion(candidateAnswer == correctAnswer);
        if (this.isCorrect()) {
            System.out.println("You answered correctly!");
        } else {
            System.out.println("Sorry, the answer you chose is incorrect.");
        }
    }
}
