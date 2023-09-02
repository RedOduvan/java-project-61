package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void sayHello(App userApp) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        //App userApp = new App();
        userApp.setNameUser(scan.nextLine());

        System.out.println("Hello, " + userApp.getNameUser());
    }
}
