package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        double priceCoffee = 0;

        for (int orders = 1; orders <= n ; orders++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());
            priceCoffee = price * days * countCapsules;
            System.out.printf("The price for the coffee is: $%.2f%n", priceCoffee);
            totalPrice += priceCoffee;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
