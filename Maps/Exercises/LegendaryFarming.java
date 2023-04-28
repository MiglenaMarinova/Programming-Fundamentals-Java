package Maps.Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> legendaryItem = new LinkedHashMap<>();
        legendaryItem.put("shards", 0);
        legendaryItem.put("fragments", 0);
        legendaryItem.put("motes", 0);

        LinkedHashMap<String, Integer> junkItem = new LinkedHashMap<>();

        boolean isObtained = false;

        while (!isObtained){
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");
            for (int i = 0; i < inputData.length; i+= 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")){
                    int currentQuantity = legendaryItem.get(material);
                    legendaryItem.put(material, currentQuantity + quantity);
                }else{
                    if (!junkItem.containsKey(material)){
                        junkItem.put(material,quantity);
                    }else{
                        int current = junkItem.get(material);
                        junkItem.put(material, current + quantity);
                    }
                }
                if (legendaryItem.get("shards") >= 250){
                    System.out.println("Shadowmourne obtained!");
                    legendaryItem.put("shards", legendaryItem.get("shards") - 250);
                    isObtained = true;
                    break;
                }else if (legendaryItem.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    legendaryItem.put("fragments", legendaryItem.get("fragments") - 250);
                    isObtained = true;
                    break;
                }else if (legendaryItem.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    legendaryItem.put("motes", legendaryItem.get("motes") - 250);
                    isObtained = true;
                    break;
                }

            }
            if (isObtained){
                break;
            }
        }
        legendaryItem.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkItem.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
