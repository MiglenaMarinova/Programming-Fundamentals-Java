package TextProcessing.Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String text = scanner.nextLine();

        String[] banList = input.split(", ");

        for (String word : banList){
            StringBuilder newWord = new StringBuilder();
            int count = word.length();
            newWord.append("*".repeat(count));
            text = text.replace(word, newWord);
        }
        System.out.println(text);
    }
}
