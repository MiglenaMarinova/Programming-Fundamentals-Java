package DataTypeAndVariables.MoreExercises;

import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int line = 1; line <= n; line++) {
            String input = scanner.nextLine();
            String text1 = "";
            String text2 = "";
            String reversedText2 = "";
            for (int i = 0; i <= input.length() - 1; i++) {
                char currentSymbol = input.charAt(i);
                if (currentSymbol == 32) {
                    break;
                } else {
                    text1 = text1 + currentSymbol;
                }
            }
            for (int i = input.length() - 1; i >= 0; i--) {
                char currentSymbol = input.charAt(i);
                if (currentSymbol == 32) {
                    break;
                } else {
                    text2 = text2 + currentSymbol;
                }
            }
            for (int j = text2.length() - 1; j >= 0; j--) {
                char reversed = text2.charAt(j);
                reversedText2 = reversedText2 + reversed;
            }

            long num1 = Long.parseLong(text1);
            long num2 = Long.parseLong(reversedText2);

            if (num1 > num2) {
                long sum1 = 0;
                while (num1 != 0) {
                    long lastDigit = Math.abs(num1 % 10);
                    sum1 += lastDigit;
                    num1 = num1 / 10;
                }
                System.out.println(sum1);
            } else {
                long sum2 = 0;
                while (num2 != 0) {
                    long lastDigit = Math.abs(num2 % 10);
                    sum2 += lastDigit;
                    num2 = num2 / 10;
                }
                System.out.println(sum2);
            }


        }
    }
}