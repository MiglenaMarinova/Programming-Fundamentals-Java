package DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());
        int countTarget = 0;

        int beginPower = power;
        while (power >= distance) {
            power -= distance;
            countTarget++;
            if (power == beginPower / 2 && factor != 0) {
                power = power / factor;
            }
        }
        System.out.println(power);
        System.out.println(countTarget);

    }
}
