package org.launchcode;

import java.util.ArrayList;

public class Quiz {
    private final ArrayList<Questions> questions = new ArrayList<Questions>();
    private int candidateScore;
    private int totalPoints;

    public void startQuiz() {
        for (Questions question : questions) {
            question.displayQuestion();
            question.displayAnswer();
            question.getCandidateAnswer();
            if (question.isCorrect()) {
                candidateScore += question.getPointValue();
            }
            totalPoints += question.getPointValue();
        }
    }

    public void addQuestion(Questions newQuestion) {
        questions.add(newQuestion);
    }

    public void printScore() {
        System.out.println("Score: " + candidateScore + "/" + totalPoints);
    }
}
