package org.launchcode;

public class QuizRunner {
    public static void main(String[] args) {
        MultipleChoice multiChoice1 = new MultipleChoice("What is two plus two?", 1, 3, "Ten", "Five-hundred", "Four", "Thirty-seven");
        TrueFalse trueFalse1 = new TrueFalse("Dogs can't look up.", 1, "false");

        Quiz newQuiz = new Quiz();
        newQuiz.addQuestion(multiChoice1);
        newQuiz.addQuestion(trueFalse1);

        newQuiz.startQuiz();
        newQuiz.printScore();
    }
}
