package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void sayHello() {
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String nameUser = scan.nextLine();
        System.out.println("Hello, " + nameUser);
    }
}
