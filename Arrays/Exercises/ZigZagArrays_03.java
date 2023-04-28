package Arrays.Exercises;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] num = scanner.nextLine().split(" ");
            if (i % 2 != 0) {
                firstArr[i - 1] = num[0];
                secondArr[i - 1] = num[1];
            } else {
                secondArr[i - 1] = num[0];
                firstArr[i - 1] = num[1];
            }
        }
        System.out.println(String.join(" ",firstArr));
        System.out.println(String.join(" ",secondArr));


    }
}
