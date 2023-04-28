package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedMessage = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String command = input.split(":\\|:")[0];
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(input.split(":\\|:")[1]);
                    StringBuilder message = new StringBuilder(concealedMessage);
                    message.insert(index, " ");
                    concealedMessage = message.toString();
                    System.out.println(concealedMessage);
                    break;
                case "Reverse":
                    String subToReverse = input.split(":\\|:")[1];
                    if (!concealedMessage.contains(subToReverse)) {
                        System.out.println("error");
                    } else {
                        StringBuilder toReverse = new StringBuilder(subToReverse);
                        String replacingWord = toReverse.reverse().toString();
                        concealedMessage = concealedMessage.replaceFirst(Pattern.quote(subToReverse), "") + replacingWord;
                        System.out.println(concealedMessage);
                    }

                    break;
                case "ChangeAll":
                    String subToReplace = input.split(":\\|:")[1];
                    String replacement = input.split(":\\|:")[2];
                    concealedMessage = concealedMessage.replaceAll(subToReplace, replacement);
                    System.out.println(concealedMessage);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", concealedMessage);
    }
}
