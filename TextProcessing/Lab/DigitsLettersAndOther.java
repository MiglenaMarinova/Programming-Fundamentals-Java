package TextProcessing.Lab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i <= input.length() - 1 ; i++) {
            char current = input.charAt(i);
            if (Character.isDigit(current)){
                digits.append(current);
            }else if (Character.isLetter(current)){
                letters.append(current);
            }else{
                other.append(current);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
    }

}
