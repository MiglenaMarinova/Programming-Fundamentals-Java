package TextProcessing.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : inputArr){
            int n = word.length();
            result.append(word.repeat(n));
        }
        System.out.println(result);
    }
}
