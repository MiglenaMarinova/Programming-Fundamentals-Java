package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfPeople = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double totalPrice = 0;

        if (type.equals("Students")){
            if (day.equals("Friday")){
                price = 8.45;
            }else if (day.equals("Saturday")){
                price = 9.80;
            }else if (day.equals("Sunday")){
                price = 10.46;
            }
            totalPrice = amountOfPeople * price;
            if (amountOfPeople >= 30){
                totalPrice = totalPrice * 0.85;
            }
        }else if (type.equals("Business")){
            if (day.equals("Friday")){
                price = 10.90;
            }else if (day.equals("Saturday")){
                price = 15.60;
            }else if (day.equals("Sunday")){
                price = 16.00;
            }
            totalPrice = amountOfPeople * price;
            if (amountOfPeople >= 100){
                totalPrice = totalPrice - price * 10;
            }
        }else if (type.equals("Regular")){
            if (day.equals("Friday")){
                price = 15.00;
            }else if (day.equals("Saturday")){
                price = 20.00;
            }else if (day.equals("Sunday")){
                price = 22.50;
            }
            totalPrice = amountOfPeople * price;
            if (amountOfPeople >= 10 && amountOfPeople <= 20){
                totalPrice = totalPrice * 0.95;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
