package ExamPreparation;

import java.util.Scanner;

public class ActivationKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rowActivationKey = scanner.nextLine();
        String input = scanner.nextLine();


        while (!input.equals("Generate")){
            String[] commandArr = input.split(">>>");
            String command = commandArr[0];
            int startIndex = 0;
            int endIndex = 0;
            if (command.equals("Contains")){
                String substring = commandArr[1];
                if (rowActivationKey.contains(substring)){
                    System.out.printf("%s contains %s%n", rowActivationKey, substring);
                }else {
                    System.out.println("Substring not found!");
                }
            }else if (command.equals("Flip")){
                String lowOrUp = commandArr[1];
                startIndex = Integer.parseInt(commandArr[2]);
                endIndex = Integer.parseInt(commandArr[3]);
                String substring = rowActivationKey.substring(startIndex, endIndex);
                if (lowOrUp.equals("Upper")){
                    rowActivationKey = rowActivationKey.replace(substring, substring.toUpperCase());
                    System.out.printf("%s%n", rowActivationKey);
                }else if (lowOrUp.equals("Lower")){
                    rowActivationKey = rowActivationKey.replace(substring, substring.toLowerCase());
                    System.out.printf("%s%n", rowActivationKey);
                }

            }else if (command.equals("Slice")){
                startIndex = Integer.parseInt(commandArr[1]);
                endIndex = Integer.parseInt(commandArr[2]);
                String substring = rowActivationKey.substring(startIndex, endIndex);
                rowActivationKey = rowActivationKey.replace(substring, "");
                System.out.println(rowActivationKey);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", rowActivationKey);


    }
}
