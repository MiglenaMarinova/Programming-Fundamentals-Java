package Methods.Exercises;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passwordInput = scanner.nextLine();

        boolean lengthIsValid = lengthIsValid(passwordInput);
        if (!lengthIsValid){
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean containValidSymbol = containedValidSymbol(passwordInput);
        if (!containValidSymbol){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean containAtLeastTwoDigit = containedAtLeastTwoDigits(passwordInput) ;
        if (!containAtLeastTwoDigit){
            System.out.println("Password must have at least 2 digits");
        }

        if (lengthIsValid && containValidSymbol && containAtLeastTwoDigit){
            System.out.println("Password is valid");
        }


    }

    public static boolean lengthIsValid(String text) {
        if (text.length() >= 6 && text.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean containedValidSymbol(String text) {
        for (char symbol : text.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }
    public static boolean containedAtLeastTwoDigits(String text){
        int symbolCount = 0;
        for (char symbol : text.toCharArray()){
            if (Character.isDigit(symbol)){
                symbolCount++;
            }
        }
        if (symbolCount < 2){
            return false;
        }
        return true;
    }


}
