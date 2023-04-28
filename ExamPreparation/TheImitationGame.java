package ExamPreparation;

import java.util.Scanner;


public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        StringBuilder message = new StringBuilder(encryptedMessage);
        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String command = input.split("\\|")[0];
            switch (command) {
                case "Move":
                    int n = Integer.parseInt(input.split("\\|")[1]);
                    String newMessage = (message.substring(n)).concat(message.substring(0, n));
                    message = new StringBuilder(newMessage);
                    break;
                case "Insert":
                    int index = Integer.parseInt(input.split("\\|")[1]);
                    String value = input.split("\\|")[2];
                    String newString = message.substring(0, index).concat(value).concat(message.substring(index));
                    message = new StringBuilder(newString);
                    break;
                case "ChangeAll":
                    String substring = input.split("\\|")[1];
                    String replacement = input.split("\\|")[2];
                    String newChange = message.toString().replace(substring, replacement);
                    message = new StringBuilder(newChange);
                    break;
            }

//            if (command.equals("Move")) {
//            } else if (command.equals("Insert")) {
//            } else if (command.equals("ChangeAll")) {
//
//            }
            input = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);

    }
}

