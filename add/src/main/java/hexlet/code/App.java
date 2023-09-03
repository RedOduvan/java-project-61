package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;

import java.util.Scanner;

public class App {
    String nameUser;

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public static void main(String[] args) {
        chooseGame();
        //Cli.sayHello();

    }

    static void chooseGame() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
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
            case ("1") -> Cli.sayHello(userApp);
            case ("2") -> Even.run(userApp.getNameUser());
            case ("3") -> Calculator.run(userApp.getNameUser());
            case ("4") -> Gcd.run(userApp.getNameUser());
            case ("0") -> {
                break;
            }
            default -> System.out.println("It's wrong option!");
        }
    }
}
