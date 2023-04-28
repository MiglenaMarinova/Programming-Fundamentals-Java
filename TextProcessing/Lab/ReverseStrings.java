package TextProcessing.Lab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String word = input;
            StringBuilder reversed = new StringBuilder();
            for (int i = word.length()-1 ; i >= 0 ; i--) {
                char currentSymbol = word.charAt(i);
                reversed.append(currentSymbol);
            }
            System.out.printf("%s = %s%n", word, reversed);
            input = scanner.nextLine();
        }

    }
}
