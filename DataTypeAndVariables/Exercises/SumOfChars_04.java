package DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countSymbol = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int symbol = 1; symbol <= countSymbol ; symbol++) {
            char value = scanner.nextLine().charAt(0);
            int code = (int) value;
            sum += code;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
