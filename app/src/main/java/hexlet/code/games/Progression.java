package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void run(String nameUser) {
        int randomPosition;
        int randomNumPlus;
        int randomNumStart;
        final int lengthProgress = 10;
        final int randomMult = 10;
        Engine en = new Engine();
        en.setNameUser(nameUser);
        System.out.println("What number is missing in the progression?");

        en.setExitLoop(true);
        while (en.isExitLoop()) {
            randomPosition = (int) (Math.random() * randomMult);
            randomNumPlus = (int) (Math.random() * randomMult);
            randomNumStart = (int) (Math.random() * randomMult);

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
