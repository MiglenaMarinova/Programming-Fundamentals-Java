package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isEqual = false;

        for (int i = 0; i <= numArr.length - 1; i++) {
            int currentNum = numArr[i];
            int sumRight = 0;
            int sumLeft = 0;
            for (int numLeft = 0; numLeft < i; numLeft++) {
                sumLeft += numArr[numLeft];
            }
            for (int numRight = i + 1; numRight <= numArr.length - 1; numRight++) {
                sumRight += numArr[numRight];
            }
            if (sumLeft == sumRight){
                System.out.println(i);
                isEqual = true;
                break;
            }
        }
        if (!isEqual){
            System.out.println("no");
        }

    }
}
