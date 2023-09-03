package hexlet.code;

import java.util.Scanner;

public class Engine {
    String question;
    String rightAnswer;
    String inputAnswer;
    String nameUser;
    int score;
    final int maxRepeat;

    {
        maxRepeat = 3;
    }

    boolean exitLoop;

    public String getInputAnswer() {
        return inputAnswer;
    }

    public void setInputAnswer(String inputAnswer) {
        this.inputAnswer = inputAnswer;
    }

    public int getScore() {
        return score;
    }

    public void setScore() {
        this.score++;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public boolean isExitLoop() {
        return exitLoop;
    }

    public void setExitLoop(boolean exitLoop) {
        this.exitLoop = exitLoop;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public static void askQuestion(Engine en) {
        System.out.println("Question: " + en.getQuestion());
    }

    public static void getAnswer(Engine en) {
        System.out.print("Your answer: ");
        Scanner scan = new Scanner(System.in);
        en.setInputAnswer(scan.nextLine());
    }

    public static void check(Engine en) {

        if (en.getRightAnswer().equals(en.getInputAnswer())) {
            en.setScore();
            System.out.println("Correct!");
            en.setExitLoop(true);
        } else {
            System.out.println("'" + en.getInputAnswer() + "' is wrong answer ;(. Correct answer was '"
                    + en.getRightAnswer() + "'.");
            System.out.println("Let's try again, " + en.getNameUser() + "!");
            en.setExitLoop(false);
        }

        if (en.getScore() == en.maxRepeat) {
            System.out.println("Congratulations, " + en.getNameUser() + "!");
            en.setExitLoop(false);
        }
    }

}
