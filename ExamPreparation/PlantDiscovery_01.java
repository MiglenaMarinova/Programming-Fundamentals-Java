package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
//        "{plant}<->{rarity}".

        LinkedHashMap<String, Integer> nameRarity = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String[] plantInfo = scanner.nextLine().split("<->");
            String name = plantInfo[0];
            int rarity = Integer.parseInt(plantInfo[1]);
            nameRarity.put(name, rarity);
        }
        LinkedHashMap<String, Double> nameRating = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> nameCount = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] commandParts = input.split(":\\s+");
            String command = commandParts[0];
            String[] plantInfo = commandParts[1].split(" - ");
            String name = plantInfo[0];

            switch (command) {
                case "Rate":
                    double rating = Double.parseDouble(plantInfo[1]);
                    nameRating.putIfAbsent(name, 0.0);
                    nameRating.put(name, nameRating.get(name) + rating);
                    nameCount.putIfAbsent(name, 0);
                    nameCount.put(name, nameCount.get(name) +1);

                    if (!nameRating.containsKey(name)) {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    if (!nameRarity.containsKey(name)) {
                        System.out.println("error");
                    } else {
                        int newRarity = Integer.parseInt(plantInfo[1]);
                        nameRarity.put(name, newRarity);
                    }
                    break;
                case "Reset":
                    if (!nameRating.containsKey(name)) {
                        System.out.println("error");
                    } else {
                        nameRating.put(name, 0.0);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
//        {plant_name1}; Rarity: {rarity}; Rating: {average_rating}
        for (Map.Entry<String, Integer> entry : nameRarity.entrySet()) {
            String plantName = entry.getKey();
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plantName, entry.getValue(), nameRating.get(plantName) * 1.00 / nameCount.get(plantName));

        }


    }
}
