package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index < numArr.length; index++) {
            int currentNum = numArr[index];
            if (index == numArr.length - 1){
                System.out.print(currentNum + " ");
                break;
            }
            boolean isTop = false;
            for (int i = index + 1; i < numArr.length; i++) {
                int nextNum = numArr[i];
                if (currentNum > nextNum){
                    isTop = true;
                }else{
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(currentNum + " ");
            }
        }


    }
}
