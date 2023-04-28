package FinalExamRetake;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageEncrypter_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());


        String regex = "([*|@])(?<tag>[A-Z][a-z]{2,})\\1[:][ ](?<letter1>\\[[A-Za-z]{1}\\][|]{1}\\[[A-Za-z]{1}\\][|]{1}\\[[A-Za-z]{1}\\][|]{1})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;
        String valid = "";

        for (int i = 1; i <= numberOfInputs ; i++) {
            String input = scanner.nextLine();
            matcher = pattern.matcher(input);
            if (!matcher.find()){
                System.out.println("Valid message not found!");
            }else{
                System.out.printf("%s: ", matcher.group("tag"));
                valid = matcher.group("letter1");
                for (int j = 0; j < valid.length(); j++) {
                    char current = valid.charAt(j);
                    if (Character.isLetter(current)){
                        int ascii = current;
                        System.out.print(ascii + " ");
                    }
                }
                System.out.println();

            }
        }

    }
}
