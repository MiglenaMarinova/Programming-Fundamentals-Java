package DataTypeAndVariables.Lab;

import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meter = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", 1.0 * meter / 1000);
    }
}
