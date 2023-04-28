package Arrays.Exercises;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int [] peopleIn = new int[n];
        for (int i = 0; i < n ; i++) {
            peopleIn[i] = Integer.parseInt(scanner.nextLine());
            sum += peopleIn[i];
            System.out.print(peopleIn[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
