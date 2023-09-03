package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void run(String nameUser) {
        int randomPosition;
        int randomNumPlus;
        int randomNumStart;
        int lengthProgress = 10;
        Engine en = new Engine();
        en.setNameUser(nameUser);
        System.out.println("What number is missing in the progression?");

        en.setExitLoop(true);
        while (en.isExitLoop()) {
            randomPosition = (int) (Math.random() * 10);
            randomNumPlus = (int) (Math.random() * 10);
            randomNumStart = (int) (Math.random() * 10);

            en.setQuestion(String.valueOf(randomNumStart));
            for (int i = 0; i < lengthProgress; i++) {

                if (i == randomPosition) {
                    en.setRightAnswer(String.valueOf(randomNumStart + (randomNumPlus * (i + 1))));
                    en.setQuestion(en.getQuestion() + " ..");
                } else {
                    en.setQuestion(en.getQuestion() + " " + (randomNumStart + (randomNumPlus * (i + 1))));
                }
            }

            Engine.askQuestion(en);
            Engine.getAnswer(en);
            Engine.check(en);
        }
    }
}
