package ExamPreparation;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> plantsRarityMap = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] plantsInfoArr = input.split("<->");
            String plantName = plantsInfoArr[0];
            int plantRarity = Integer.parseInt(plantsInfoArr[1]);
            plantsRarityMap.put(plantName, plantRarity);
        }
        LinkedHashMap<String, ArrayList<Integer>> plantsRatingMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String command = input.split(":\\s+")[0];
            String plantInfo = input.split(":\\s+")[1];
            String name = plantInfo.split("\\s+-\\s+")[0];
            if (!plantsRarityMap.containsKey(name)) {
                System.out.println("error");
            } else {
                if (command.equals("Rate")) {
                    int rating = Integer.parseInt(plantInfo.split("\\s+-\\s+")[1]);
                    plantsRatingMap.putIfAbsent(name, new ArrayList<>());
                    plantsRatingMap.get(name).add(rating);
                } else if (command.equals("Update")) {
                    int newRarity = Integer.parseInt(plantInfo.split("\\s+-\\s+")[1]);
                    plantsRarityMap.put(name, newRarity);
                } else if (command.equals("Reset")) {
                    plantsRatingMap.get(name).clear();
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        double averRate = 0;
        for (Map.Entry<String, Integer> entry : plantsRarityMap.entrySet()) {
            String name = entry.getKey();
            int rarity = entry.getValue();
            if (plantsRatingMap.get(name).size() > 0) {
                averRate = plantsRatingMap.get(name).stream().mapToInt(Integer::intValue).average().getAsDouble();
            } else {
                averRate = 0;
            }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", name, rarity, averRate);
        }

    }
}
