package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());

        double price = 0;
        double totalSpend = 0;

        String command = scanner.nextLine();

        while (!command.equals("Game Time")) {
            String nameOfTheGame = command;
            if(!nameOfTheGame.equals("OutFall 4") && !nameOfTheGame.equals("CS: OG") && !nameOfTheGame.equals("Zplinter Zell")
                    && !nameOfTheGame.equals("Honored 2")
                    && !nameOfTheGame.equals("RoverWatch")&&!nameOfTheGame.equals("RoverWatch Origins Edition")){
                System.out.println("Not Found");
            }
            if (nameOfTheGame.equals("OutFall 4")) {
                price = 39.99;
            } else if (nameOfTheGame.equals("CS: OG")) {
                price = 15.99;
            } else if (nameOfTheGame.equals("Zplinter Zell")) {
                price = 19.99;
            } else if (nameOfTheGame.equals("Honored 2")) {
                price = 59.99;
            } else if (nameOfTheGame.equals("RoverWatch")) {
                price = 29.99;
            } else if (nameOfTheGame.equals("RoverWatch Origins Edition")) {
                price = 39.99;
            }
            if (price > currentBalance) {
                System.out.println("Too Expensive");
            } else if (price <= currentBalance && price != 0) {
                currentBalance -= price;
                System.out.printf("Bought %s%n", nameOfTheGame);
                totalSpend += price;
                if (currentBalance == 0) {
                    System.out.println("Out of mo-ney!");
                    break;
                }
            }
            command = scanner.nextLine();
        }
        if (currentBalance > 0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, currentBalance);
        }


    }
}
