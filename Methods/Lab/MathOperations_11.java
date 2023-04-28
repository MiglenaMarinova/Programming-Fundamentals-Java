package Methods.Lab;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String operatorInput = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        double result = calculate(a, operatorInput, b);
        System.out.printf("%.0f", result);

    }

    public static double calculate(int a, String operator, int b) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = a * 1.0 / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }
}
