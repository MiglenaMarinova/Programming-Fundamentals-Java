package Arrays.Exercises;

import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialLoot = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandItem = command.split(" ");
            switch (commandItem[0]) {
                case "Loot":
                    for (int i = 1; i < commandItem.length; i++) {
                        boolean alreadyContained = false;
                        for (int j = 0; j < initialLoot.length; j++) {
                            if (commandItem[i].equals(initialLoot[j])){
                                alreadyContained = true;
                                break;
                            }
                        }
                        if(!alreadyContained){
                            String newLoot = commandItem[i] + " " + String.join(" ", initialLoot);
                            initialLoot = newLoot.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(commandItem[1]);
                    if (position <= initialLoot.length - 1 && position >= 0){
                        String dropItem = initialLoot[position];
                        for (int i = position; i < initialLoot.length -1 ; i++) {
                            initialLoot[i] = initialLoot[i+1];
                        }
                        initialLoot[initialLoot.length-1]=dropItem;
                    }
                    else{
                        break;
                    }
                    break;
                case "Steal":
                    int countStealItems = Integer.parseInt(commandItem[1]);
                    if (countStealItems >= 0 && countStealItems < initialLoot.length){
                        for (int i = 0; i < countStealItems ; i++) {
                            System.out.print(initialLoot[initialLoot.length - countStealItems + i]);
                            if (i != countStealItems - 1){
                                System.out.print(", ");
                            }
                        }
                        String[] tempLoot = new String[initialLoot.length -countStealItems];
                        for (int i = 0; i < tempLoot.length; i++) {
                            tempLoot[i] = initialLoot[i];
                        }
                        initialLoot = tempLoot;
                    }else if (countStealItems >= 0){
                        for (int i = 0; i < initialLoot.length; i++) {
                            System.out.print(initialLoot[i]);
                            if (i != initialLoot.length-1){
                                System.out.print(", ");
                            }
                        }initialLoot = new String[0];
                    }
                    System.out.println();
                    break;
            }


            command = scanner.nextLine();
        }
        String treasureCount = String.join("", initialLoot);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }
        double averagetreasure = (1.0 * charCounter) / initialLoot.length;
        if (charCounter > 0){
            System.out.printf("Average treasure gain: %.2f pirate credits.", averagetreasure);
        }else{
            System.out.println("Failed treasure hunt.");
        }


    }
}
