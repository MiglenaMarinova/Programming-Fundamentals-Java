package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] numbers = Arrays.stream(input.split(" ")).mapToInt(Integer ::parseInt).toArray();

        int sumEvenNum = 0;
        int sumOddNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] % 2 == 0){
                sumEvenNum += numbers[i];
            }else{
                sumOddNum += numbers[i];
            }
        }
        System.out.println(sumEvenNum - sumOddNum);
    }
}
