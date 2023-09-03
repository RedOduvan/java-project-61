package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static boolean isSimple(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void run(String nameUser) {
        int randomNum;
        final int randomMult = 1000;
        Engine en = new Engine();
        en.setNameUser(nameUser);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        en.setExitLoop(true);
        while (en.isExitLoop()) {
            randomNum = (int) (Math.random() * randomMult);
            en.setQuestion(String.valueOf(randomNum));
            en.setRightAnswer("no");
            if (isSimple(randomNum)) {
                en.setRightAnswer("yes");
            }

            Engine.askQuestion(en);
            Engine.getAnswer(en);
            Engine.check(en);
        }
    }
}
