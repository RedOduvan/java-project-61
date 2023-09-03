package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a >= b) {
            return gcd(a % b, b);
        }
        return gcd(a, b % a);
    }
    public static void run(String nameUser) {
        int randomNumFirst;
        int randomNumSecod;
        final int randomMult = 1000;
        Engine en = new Engine();
        en.setNameUser(nameUser);
        System.out.println("Find the greatest common divisor of given numbers.");

        en.setExitLoop(true);
        while (en.isExitLoop()) {
            randomNumFirst = (int) (Math.random() * randomMult);
            randomNumSecod = (int) (Math.random() * randomMult);
            en.setQuestion(randomNumFirst + " " + randomNumSecod);
            en.setRightAnswer(String.valueOf(gcd(randomNumFirst, randomNumSecod)));

            Engine.askQuestion(en);
            Engine.getAnswer(en);
            Engine.check(en);
        }
    }
}
