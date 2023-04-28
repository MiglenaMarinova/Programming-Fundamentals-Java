package Methods.Exercises;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
            if (!isPalindrome(input)){
                System.out.println("false");
            }else{
                System.out.println("true");
            }
            input = scanner.nextLine();
        }

    }
    public static boolean isPalindrome (String text){
        String textBackward = "";
        for (int i = text.length() - 1; i >= 0 ; i--) {
            textBackward = textBackward + text.charAt(i);
        }
        return text.equals(textBackward);
    }
}
