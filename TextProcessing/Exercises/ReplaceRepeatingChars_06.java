package TextProcessing.Exercises;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String singleLetter = "";

        char firstSymbol = input.charAt(0);
        singleLetter += firstSymbol;
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol != firstSymbol) {
                singleLetter += currentSymbol;
                firstSymbol = currentSymbol;
            }
        }
        System.out.println(singleLetter);

    }
}
