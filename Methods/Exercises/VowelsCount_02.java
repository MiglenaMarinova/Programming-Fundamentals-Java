package Methods.Exercises;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printCountOfVowels(text.toLowerCase());
    }

    public static void printCountOfVowels (String text){
        int vowelsCount = 0;
        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'o' ||symbol == 'i' ||symbol == 'e' ||symbol == 'u'){
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);
    }
}
