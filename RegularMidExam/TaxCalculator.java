package RegularMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(">>")).collect(Collectors.toList());

        int totalTax = 0;
        int sumTax = 0;

        for (int i = 0; i <= input.size() - 1; i++) {
            String currentCommand = input.get(i);
            String[] command = currentCommand.split("\\s+");
            String type = command[0];
            int years = Integer.parseInt(command[1]);
            int km = Integer.parseInt(command[2]);
            switch (type) {
                case "family":
                    totalTax = km  / 3000 * 12 + (50 - years * 5);
                    sumTax+=totalTax;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", type, (double) totalTax);
                    break;
                case "heavyDuty":
                    totalTax = km  / 9000 * 14 + (80 - years * 8);
                    sumTax+=totalTax;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", type,(double) totalTax);
                    break;
                case "sports":
                    totalTax = km  / 2000 * 18 + (100 - years * 9);
                    sumTax+=totalTax;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", type,(double) totalTax);

                    break;
                default:
                    System.out.println("Invalid car type.");
            }


        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.",(double) sumTax);


    }
}
