package DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstCode = Integer.parseInt(scanner.nextLine());
        int lastCode = Integer.parseInt(scanner.nextLine());

        for (int symbol = firstCode; symbol <= lastCode ; symbol++) {
            System.out.print((char) symbol + " ");

        }

    }
}
