package ExamPreparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalPriceWithoutTax = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");

            } else {
                totalPriceWithoutTax += price;
            }

            input = scanner.nextLine();
        }
        if (totalPriceWithoutTax == 0) {
            System.out.println("Invalid order!");

        }else if (totalPriceWithoutTax>0){
            double taxes = totalPriceWithoutTax * 0.2;
            double totalPrice = totalPriceWithoutTax + taxes;
            if (input.equals("special")) {
                totalPrice = totalPrice - totalPrice * 0.10;
            }
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",totalPriceWithoutTax);
            System.out.printf("Taxes: %.2f$%n",taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);

        }



    }
}
