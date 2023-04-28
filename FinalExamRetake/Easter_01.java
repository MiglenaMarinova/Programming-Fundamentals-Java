package FinalExamRetake;

import java.util.Scanner;

public class Easter_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Easter")) {
            String[] commandParts = input.split("\\s+");
            String command = commandParts[0];
            switch (command) {
                case "Replace":
                    char oldChar = commandParts[1].charAt(0);
                    char newChar = commandParts[2].charAt(0);
                    text = text.replace(oldChar, newChar);
                    System.out.println(text);
                    break;
                case "Remove":
                    String toRemove = commandParts[1];
                    text = text.replace(toRemove, "");
                    System.out.println(text);
                    break;
                case "Includes":
                    String includes = commandParts[1];
                    if (text.contains(includes)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "Change":
                    String lowerOrUpper = commandParts[1];
                    if (lowerOrUpper.equals("Lower")){
                        text = text.toLowerCase();
                    }else if (lowerOrUpper.equals("Upper")){
                        text = text.toUpperCase();
                    }
                    System.out.println(text);
                    break;
                case "Reverse":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    if (startIndex >= 0 && startIndex < text.length() && endIndex < text.length()){
                        String subToReverse = text.substring(startIndex, endIndex + 1);
                        StringBuilder reversed = new StringBuilder(subToReverse).reverse();
                        System.out.println(reversed);
                    }
                    break;
            }


            input = scanner.nextLine();
        }


    }
}
