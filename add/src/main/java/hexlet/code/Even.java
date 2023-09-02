package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void run(String nameUser) {
        int score = 0;
        int randomNum;
        String inputAnswer;
        String rightAnswer;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (true) {
            randomNum = (int)(Math.random()*100);
            rightAnswer = "no";
            if ((randomNum%2) == 0) {
                rightAnswer = "yes";
            }
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            Scanner scan = new Scanner(System.in);
            inputAnswer = scan.nextLine();

            if (rightAnswer.equals(inputAnswer)){
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + inputAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + nameUser + "!");
                break;
            }
            if (score == 3) {
                System.out.println("Congratulations, " + nameUser + "!");
                break;
            }
        }
    }
}
