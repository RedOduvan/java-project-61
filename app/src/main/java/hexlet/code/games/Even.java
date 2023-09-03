package hexlet.code.games;

import hexlet.code.Engine;

//import java.util.Scanner;

public class Even {
    public static void run(String nameUser) {
        int randomNum;
        Engine en = new Engine();
        en.setNameUser(nameUser);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        en.setExitLoop(true);
        while (en.isExitLoop()) {
            randomNum = (int) (Math.random() * 100);
            en.setQuestion(String.valueOf(randomNum));
            en.setRightAnswer("no");
            if ((randomNum % 2) == 0) {
                en.setRightAnswer("yes");
            }

            Engine.askQuestion(en);
            Engine.getAnswer(en);
            Engine.check(en);
        }
    }
}
