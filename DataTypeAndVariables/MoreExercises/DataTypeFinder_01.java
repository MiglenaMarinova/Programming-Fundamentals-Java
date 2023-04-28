package DataTypeAndVariables.MoreExercises;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String type = "";
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                type = "boolean";
            } else if ((input.length() == 1) && !(input.charAt(0) >= 48 && input.charAt(0) <= 57)) {
                type = "character";
            } else if ((input.length() == 1) && (input.charAt(0) >= 48 && input.charAt(0) <= 57)) {
                type = "integer";
            } else if (input.length() > 1) {
                boolean isString = false;
                boolean isDouble = false;
                for (int i = 0; i < input.length(); i++) {
                    char currentSymbol = input.charAt(i);
                    if (currentSymbol < 45 || currentSymbol > 57) {
                        isString = true;
                    }
                    if (currentSymbol == 46) {
                        isDouble = true;
                    }
                }
                if (isString) {
                    type = "string";
                }else{
                    if (isDouble){
                        type = "floating point";
                    }else{
                        type = "integer";
                    }
                }
            }
            System.out.printf("%s is %s type%n", input, type);
            input = scanner.nextLine();
        }
    }
}
