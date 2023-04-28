package Methods.Exercises;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int resultSum = getResultSum(firstNum, secondNum);
        int resultSubstraction = getResultSubstraction(resultSum , thirdNum);

        System.out.println(resultSubstraction);

    }
    public static int getResultSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public  static int getResultSubstraction(int sum, int num3){
        return sum-num3;
    }
}
