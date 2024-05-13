package org.launchcode;

public class QuizRunner {
    public static void main(String[] args) {
        // Create questions from classes extending Questions
        MultipleChoice multiChoice1 = new MultipleChoice("What is two plus two?", 1, 3, "Ten", "Five-hundred", "Four", "Thirty-seven");
        TrueFalse trueFalse1 = new TrueFalse("Dogs can't look up.", 1, "false");

        // Create new, empty quiz
        Quiz newQuiz = new Quiz();

        // Add questions to quiz
        newQuiz.addQuestion(multiChoice1);
        newQuiz.addQuestion(trueFalse1);

        // Start and score quiz
        newQuiz.startQuiz();
        newQuiz.printScore();
    }
}
