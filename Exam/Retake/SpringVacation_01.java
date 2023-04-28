package Exam.Retake;

import java.util.Scanner;

public class SpringVacation_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double fuelPricePerKilometer = Double.parseDouble(scanner.nextLine());
        double foodExpenses = Double.parseDouble(scanner.nextLine());
        double hotelPricePerNight = Double.parseDouble(scanner.nextLine());
        if (people > 10){
            hotelPricePerNight -= hotelPricePerNight * 0.25;
        }

        double currentBudget = foodExpenses * people * days + hotelPricePerNight * people * days;

        boolean isNotEnough = false;
        for (int i = 1; i <= days; i++) {
            int kilometers = Integer.parseInt(scanner.nextLine());

            currentBudget += kilometers * fuelPricePerKilometer;
            if (i % 3 == 0 || i % 5 == 0) {
                currentBudget += currentBudget * 0.4;
            } else if (i % 7 == 0) {
                currentBudget -= currentBudget / people;
            }
            if (currentBudget > budget) {
                isNotEnough = true;
                break;
            }
        }
        if(isNotEnough){
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.%n", (currentBudget - budget));
        }else {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.%n", (budget - currentBudget));
        }
    }
}
