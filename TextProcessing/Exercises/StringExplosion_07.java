package TextProcessing.Exercises;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        int totalStrength = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '>') {
                int currentStrength = Integer.parseInt(input.charAt(i + 1) + "");
                totalStrength+=currentStrength;
            }else if (totalStrength > 0 && currentChar != '>'){
                input.deleteCharAt(i);
                totalStrength--;
                i--;
            }

        }
        System.out.println(input);
    }
}
