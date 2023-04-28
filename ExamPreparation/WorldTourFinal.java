package ExamPreparation;

import java.util.Scanner;

public class WorldTourFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder stops = new StringBuilder(input);

        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String[] commandParts = command.split(":");
            String action = commandParts[0];
            switch (action) {
                case "Add Stop":
                    int index = Integer.parseInt(commandParts[1]);
                    if (indexIsValid(input, index)) {
                        String newStop = commandParts[2];
                        input = input.substring(0, index).concat(newStop).concat(input.substring(index));
                    }else{
                        input = input;
                    }
                    System.out.println(input);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    if (indexIsValid(input, startIndex) && indexIsValid(input, endIndex)){
                        input = input.replace(input.substring(startIndex, endIndex +1), "");
                    }else{
                        input = input;
                    }
                    System.out.println(input);
                    break;
                case "Switch":
                    String oldString = commandParts[1];
                    String newString = commandParts[2];
                    if (input.contains(oldString)){
                        input = input.replace(oldString, newString);
                    }else{
                        input = input;
                    }
                    System.out.println(input);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", input);
    }

    public static boolean indexIsValid(String input, int index) {
        if (input.toCharArray().length > 0 && index >= 0 && index < input.toCharArray().length) {
            return true;
        } else {
            return false;
        }
    }
}
