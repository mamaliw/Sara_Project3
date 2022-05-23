package Utils;

import Models.User;

import java.util.ArrayList;
import java.util.Scanner;

public class IO {
    public static void print(String text) {
        System.out.println("\n" + text);
    }

    public static String getInputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getInputString(String text) {
        IO.print(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Integer getInputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static Integer getInputInt(String text) {
        IO.print(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static Integer printFirstDialog() {
        String dialog = "";

        dialog += "Welcome, please enter an option [number]:";
        dialog += "\n [1] Sign Up";
        dialog += "\n [2] Sign In";

        return IO.getInputInt(dialog);
    }

    public static User printSignUpDialog() {

        String name = IO.getInputString("Your name:");
        String username = IO.getInputString("Your username:");
        String email = IO.getInputString("Your email:");
        String password = IO.getInputString("Your password:");
        String nationalCode = IO.getInputString("Your nationalCode:");
        String phoneNumber = IO.getInputString("Your phoneNumber:");

        return new User(name, username, email, password, nationalCode, phoneNumber);
    }


}
