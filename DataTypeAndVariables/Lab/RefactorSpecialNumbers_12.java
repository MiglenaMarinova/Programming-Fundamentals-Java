package DataTypeAndVariables.Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum = 0;
        boolean specialNum;
        for (int i = 1; i <= n; i++) {
            currentNum = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            specialNum = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", currentNum, specialNum);
            sum = 0;
            i = currentNum;
        }


    }
}
