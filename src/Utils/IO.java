package Utils;

import Models.User;
//import Users;

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

    public static ArrayList<String> printSignUpDialog() {
        ArrayList<String> result = new ArrayList<>();

        result.add(IO.getInputString("Your name:"));
        result.add(IO.getInputString("Your username:"));
        result.add(IO.getInputString("Your email:"));
        result.add(IO.getInputString("Your password:"));
        result.add(IO.getInputString("Your nationalCode:"));
        result.add(IO.getInputString("Your phoneNumber:"));

        return result;
    }

    public static ArrayList<String> printSignInDialog() {
        ArrayList<String> result = new ArrayList<>();

        result.add(IO.getInputString("Enter Your username:"));
        result.add(IO.getInputString("Enter Your password:"));

        return result;
    }


}
