package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class TheatrePromotion07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 0 && age <= 18 && day.equals("Weekday")) {
            System.out.println("12$");
        } else if (age >= 0 && age <= 18 && day.equals("Weekend")) {
            System.out.println("15$");
        } else if (age >= 0 && age <= 18 && day.equals("Holiday")) {
            System.out.println("5$");
        } else if (age > 18 && age <= 64 && day.equals("Weekday")) {
            System.out.println("18$");
        } else if (age > 18 && age <= 64 && day.equals("Weekend")) {
            System.out.println("20$");
        } else if (age > 18 && age <= 64 && day.equals("Holiday")) {
            System.out.println("12$");
        } else if (age > 64 && age <= 122 && day.equals("Weekday")) {
            System.out.println("12$");
        } else if (age > 64 && age <= 122 && day.equals("Weekend")) {
            System.out.println("15$");
        } else if (age > 64 && age <= 122 && day.equals("Holiday")) {
            System.out.println("10$");
        }else{
            System.out.println("Error!");
        }


    }
}
