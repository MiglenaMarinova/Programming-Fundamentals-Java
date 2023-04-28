package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;

        if (num1 >= num2 && num1 >= num3) {
            firstNum = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            firstNum = num2;
        } else {
            firstNum = num3;
        }
        if (num1 <= num2 && num1 <= num3) {
            thirdNum = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            thirdNum = num2;
        } else {
            thirdNum = num3;
        }
        if (num1 != firstNum && num1 != thirdNum) {
            secondNum = num1;
        } else if (num2 != firstNum && num2 != thirdNum) {
            secondNum = num2;
        } else if (num3 != firstNum && num3 != thirdNum) {
            secondNum = num3;
        }


        System.out.println(firstNum);
        System.out.println(secondNum);
        System.out.println(thirdNum);

    }





}
