package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i <= numArr.length - 1 ; i++) {
            int currentNUm = numArr[i];
            for (int num = i + 1; num <= numArr.length - 1; num++) {
                sum = currentNUm + numArr[num];
                if (sum == n){
                    System.out.println(currentNUm + " " + numArr[num]);
                }

            }
        }

    }
}
