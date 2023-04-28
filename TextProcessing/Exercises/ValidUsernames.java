package TextProcessing.Exercises;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] namesArr = input.split(", ");

        for (String name : namesArr){
            if (isValidName(name)){
                System.out.printf("%s%n", name);
            }
        }
    }
    public static boolean isValidName (String name){
        if (!(name.length() >= 3 && name.length()<= 16)){
            return false;
        }
        for (int i = 0; i <= name.length()-1 ; i++) {
            char currentSymbol = name.charAt(i);
            if (!(Character.isLetter(currentSymbol) || (currentSymbol == '-') || (currentSymbol == '_') || (Character.isDigit(currentSymbol)))){
                return false;
            }
        }
        return true;
    }
}
