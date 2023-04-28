package Methods.Exercises;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int currentNum = 1; currentNum <= n; currentNum++) {
            if (isDivisibleBy8(currentNum)&&holdsAtleastOneOdd(currentNum)){
                System.out.println(currentNum);
            }
        }
    }
    //    •	Its sum of digits is divisible by 8, e.g. 8, 16, 88.
//•	Holds at least one odd digit, e.g. 232, 707, 87578.
    public static boolean isDivisibleBy8(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean holdsAtleastOneOdd(int num) {
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                num = num / 10;
            }
        }
        return false;
    }
}