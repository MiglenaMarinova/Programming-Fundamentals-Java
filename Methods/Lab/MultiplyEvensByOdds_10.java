package Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput = Integer.parseInt(scanner.nextLine());
        int result = getMultipleOfEvensAndOdds(numInput);
        System.out.println(result);
    }
    public static int getMultipleOfEvensAndOdds(int num){
        int evenSumOfNum = getSumOfEvenNum(num);
        int oddSumOfNum = getSumOfOddNum (num);
        return evenSumOfNum * oddSumOfNum;
    }
    public static int getSumOfEvenNum(int num){
        int sumEven = 0;
        while (Math.abs(num) > 0){
            int lastDigit = num % 10;
            if (lastDigit % 2 == 0){
                sumEven +=lastDigit;
            }
            num = num / 10;
        }
        return sumEven;
    }
    public static int getSumOfOddNum(int num){
        int sumOdd = 0;
        while (Math.abs(num) >0){
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0){
                sumOdd +=lastDigit;
            }
            num = num / 10;
        }
        return sumOdd;
    }
}
