package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double sumMoney = 0;
        double priceProduct = 0;

        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f%n", coins);
            } else {
                sumMoney += coins;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Start")) {
            String product = scanner.nextLine();
            while (!product.equals("End")) {
                if (product.equals("Nuts")) {
                    priceProduct = 2.0;
                    if (priceProduct > sumMoney) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        sumMoney -= priceProduct;
                    }
                } else if (product.equals("Water")) {
                    priceProduct = 0.7;
                    if (priceProduct > sumMoney) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        sumMoney -= priceProduct;
                    }
                } else if (product.equals("Crisps")) {
                    priceProduct = 1.5;
                    if (priceProduct > sumMoney) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        sumMoney -= priceProduct;
                    }
                } else if (product.equals("Soda")) {
                    priceProduct = 0.8;
                    if (priceProduct > sumMoney) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        sumMoney -= priceProduct;
                    }
                } else if (product.equals("Coke")) {
                    priceProduct = 1.0;
                    if (priceProduct > sumMoney) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        sumMoney -= priceProduct;
                    }
                } else {
                    System.out.println("Invalid product");
                }

                product = scanner.nextLine();
            }
            if (product.equals("End")) {
                System.out.printf("Change: %.2f", sumMoney);
            }


        }

    }
}
