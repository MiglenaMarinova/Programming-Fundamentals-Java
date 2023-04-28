package RegularFinalExam;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Abracadabra")) {
            String action = command.split("\\s+")[0];

            switch (action) {
                case "Abjuration":
                    text = text.toUpperCase();
                    System.out.println(text);
                    break;
                case "Necromancy":
                    text = text.toLowerCase();
                    System.out.println(text);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    String letter = command.split("\\s+")[2];
                    if (text.length() > 0 && index >= 0 && index <= text.length() - 1) {

                        StringBuilder newText = new StringBuilder(text);
                        newText.setCharAt(index, letter.charAt(0));
                        text = newText.toString();
                        System.out.println("Done!");
                    }else{
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String firstSubstring = command.split("\\s+")[1];
                    String secondSubstring = command.split("\\s+")[2];
                    if (!text.contains(firstSubstring)){
                        break;
                    }else{
                        text = text.replaceAll(firstSubstring, secondSubstring);
                        System.out.println(text);

                    }
                    break;
                case "Alteration":
                    String subToRemove = command.split("\\s+")[1];
                    if (!text.contains(subToRemove)){
                        break;
                    }else{
                        text = text.replace(subToRemove, "");
                        System.out.println(text);

                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
