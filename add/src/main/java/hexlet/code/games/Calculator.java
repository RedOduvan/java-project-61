package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {
    static int getOperation() {
        int randomNum = (int) (Math.random() * 10);
        int result = 1;
        if ((randomNum % 3) == 0) {
            result = 3;
        } else if ((randomNum % 2) == 0) {
            result = 2;
        }

        return result;
    }
    public static void run(String nameUser) {
        int randomNumFirst;
        int randomNumSecond;
        int operation;
        Engine en = new Engine();
        en.setNameUser(nameUser);
        System.out.println("What is the result of the expression?");
        en.setExitLoop(true);

        while (en.isExitLoop()) {
            operation = getOperation();

            randomNumFirst = (int) (Math.random() * 100);
            randomNumSecond = (int) (Math.random() * 100);

            if (operation == 3) {
                en.setQuestion(randomNumFirst + "+" + randomNumSecond);
                en.setRightAnswer(Integer.toString(randomNumFirst + randomNumSecond));
            } else if (operation == 2) {
                en.setQuestion(randomNumFirst + "*" + randomNumSecond);
                en.setRightAnswer(Integer.toString(randomNumFirst * randomNumSecond));
            } else {
                en.setQuestion(randomNumFirst + "-" + randomNumSecond);
                en.setRightAnswer(Integer.toString(randomNumFirst - randomNumSecond));
            }

            Engine.askQuestion(en);
            Engine.getAnswer(en);
            Engine.check(en);
        }
    }
}
