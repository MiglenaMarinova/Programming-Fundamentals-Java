package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int firstElement = numArr[0];
            for (int element = 0; element < numArr.length; element++) {
                numArr[element] = numArr[element + 1];
                if (numArr[element] == numArr[numArr.length - 1]) {
                    numArr[numArr.length - 1] = firstElement;
                    break;
                }
            }
        }
        for (int element : numArr){
            System.out.print(element + " ");
        }
    }
}
