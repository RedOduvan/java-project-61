package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private String question;
    private String rightAnswer;
    private String inputAnswer;
    private String nameUser;
    private int score;
    private final int maxRepeat = 3;

    private boolean exitLoop;

    public String getInputAnswer() {
        return inputAnswer;
    }

    public void setInputAnswer(String val) {
        this.inputAnswer = val;
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

    public void setQuestion(String val) {
        this.question = val;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String val) {
        this.rightAnswer = val;
    }

    public boolean isExitLoop() {
        return exitLoop;
    }

    public void setExitLoop(boolean val) {
        this.exitLoop = val;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String val) {
        this.nameUser = val;
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
