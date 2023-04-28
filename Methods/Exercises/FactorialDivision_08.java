package Methods.Exercises;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long factFirstNum = getFactorial(firstNum);
        long factSecondNum = getFactorial(secondNum);

        double resultDev = 1.0 * factFirstNum / factSecondNum;

        System.out.printf("%.2f", resultDev);

    }
    public static long getFactorial (int num){
        long fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
