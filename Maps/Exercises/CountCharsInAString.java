package Maps.Exercises;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//"{char} -> {occurrences}"
        String symbols = scanner.nextLine().replaceAll("\\s+", "");

        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

        for (char letter : symbols.toCharArray()){
            charCount.putIfAbsent(letter, 0);
            charCount.put(letter, charCount.get(letter) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
