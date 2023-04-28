package RegularMidExam;

import java.util.Scanner;

public class TheHuntingGames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfAdventure = Integer.parseInt(scanner.nextLine());
        int countOfPlayers = Integer.parseInt(scanner.nextLine());
        double groupsEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerPersonPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerPersonPerDay = Double.parseDouble(scanner.nextLine());

        double totalWater = waterPerPersonPerDay * daysOfAdventure * countOfPlayers;
        double totalFood = foodPerPersonPerDay * daysOfAdventure * countOfPlayers;

        double currentEnergy = groupsEnergy;
        double currentWater = totalWater;
        double currentFood = totalFood;
        boolean outOfEnergy = false;

        for (int i = 1; i <= daysOfAdventure; i++) {
            if (totalFood > 0 && totalWater > 0){
                double lostEnergy = Double.parseDouble(scanner.nextLine());
                currentEnergy -= lostEnergy;
                double energyPlus = currentEnergy * 0.05;
                if (i % 2 == 0) {
                    currentWater = currentWater - currentWater * 0.3;
                    currentEnergy += energyPlus;
                }
                if (i % 3 == 0) {
                    double reduceFood = currentFood / countOfPlayers;
                    currentFood -= reduceFood;
                    currentEnergy = currentEnergy + currentEnergy * 0.10;
                }

                if (currentEnergy <= 0) {
                    outOfEnergy = true;
                    break;
                }

            }
        }
        if (outOfEnergy) {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", currentFood, currentWater);
        } else {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", currentEnergy);
        }
    }
}
