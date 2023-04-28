package TextProcessing.Exercises;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] text = input.toCharArray();

        StringBuilder newText = new StringBuilder();

        for (char symbol : text){
            char currentSymbol = (char) (symbol + 3);
            newText.append(currentSymbol);
        }
        System.out.println(newText);
    }
}
