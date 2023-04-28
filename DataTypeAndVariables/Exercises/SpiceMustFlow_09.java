package DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYield = Integer.parseInt(scanner.nextLine());

        int countDays = 0;
        int workersConsume = 26;
        int totalAmount = 0;

        while (startYield >= 100) {
            countDays++;
            int leftYield = startYield - workersConsume;
            totalAmount += leftYield;

            startYield -= 10;
        }
        System.out.println(countDays);
        if (totalAmount >= workersConsume) {
            totalAmount -= workersConsume;
        }
        System.out.println(totalAmount);


    }
}
