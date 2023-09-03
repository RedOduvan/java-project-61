package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {
    static String getOperation() {
        final int randomMult = 10;
        final int randomPlus = 3;
        final int randomMulti = 2;
        int randomNum = (int) (Math.random() * randomMult);
        String result = "-";
        if ((randomNum % randomPlus) == 0) {
            result = "+";
        } else if ((randomNum % randomMulti) == 0) {
            result = "*";
        }

        return result;
    }
    public static void run(String nameUser) {
        int randomNumFirst;
        int randomNumSecond;
        String operation;
        final int randomMult = 100;
        Engine en = new Engine();
        en.setNameUser(nameUser);
        System.out.println("What is the result of the expression?");
        en.setExitLoop(true);

        while (en.isExitLoop()) {
            operation = getOperation();

            randomNumFirst = (int) (Math.random() * randomMult);
            randomNumSecond = (int) (Math.random() * randomMult);

            if (operation.equals("+")) {
                en.setQuestion(randomNumFirst + " + " + randomNumSecond);
                en.setRightAnswer(Integer.toString(randomNumFirst + randomNumSecond));
            } else if (operation.equals("*")) {
                en.setQuestion(randomNumFirst + " * " + randomNumSecond);
                en.setRightAnswer(Integer.toString(randomNumFirst * randomNumSecond));
            } else {
                en.setQuestion(randomNumFirst + " - " + randomNumSecond);
                en.setRightAnswer(Integer.toString(randomNumFirst - randomNumSecond));
            }

            Engine.askQuestion(en);
            Engine.getAnswer(en);
            Engine.check(en);
        }
    }
}
