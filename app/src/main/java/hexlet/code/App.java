package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public final class App {
    String nameUser;

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String val) {
        this.nameUser = val;
    }

    public static void main(String[] args) {
        chooseGame();
    }

    static void chooseGame() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scan = new Scanner(System.in);
        String miniGame = scan.nextLine();
        runGame(miniGame);
    }
    static void runGame(String miniGame) {
        App userApp = new App();
        Cli.sayHello(userApp);

        switch (miniGame) {
            case ("0"), ("1") -> {
                break;
            }
            case ("2") -> Even.run(userApp.getNameUser());
            case ("3") -> Calculator.run(userApp.getNameUser());
            case ("4") -> Gcd.run(userApp.getNameUser());
            case ("5") -> Progression.run(userApp.getNameUser());
            case ("6") -> Prime.run(userApp.getNameUser());
            default -> System.out.println("It's wrong option!");
        }
    }
}
