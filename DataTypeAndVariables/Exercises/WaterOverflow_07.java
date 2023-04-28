package DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int waterInTank =0;

        for (int i = 1; i <= n ; i++) {
            int pouredLitter = Integer.parseInt(scanner.nextLine());
            waterInTank += pouredLitter;
            if (waterInTank > capacity){
                System.out.println("Insufficient capacity!");
                waterInTank -= pouredLitter;
            }
        }
        System.out.println(waterInTank);
    }
}
