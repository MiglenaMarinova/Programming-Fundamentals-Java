package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = countLostGames / 2;
        int countMouse = countLostGames / 3;
        int countKeyboard = countLostGames / 6;
        int countDisplay = countLostGames / 12;

        System.out.printf("Rage expenses: %.2f lv.",(countDisplay * displayPrice + countHeadset * headsetPrice + countMouse * mousePrice + countKeyboard * keyboardPrice));


    }
}
