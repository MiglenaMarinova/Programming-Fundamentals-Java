package FinalExamRetake;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BakeryShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> food= new LinkedHashMap<>();
        LinkedHashMap<String, Integer> soldFood = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Complete")) {
            String[] commandParts = input.split("\\s+");
            String command = commandParts[0];
            int quantity = Integer.parseInt(commandParts[1]);
            String foodName = commandParts[2];
            switch (command) {
                case "Receive":
                    if (quantity > 0){
                        food.putIfAbsent(foodName, 0);
                        soldFood.putIfAbsent(foodName, 0);
                        food.put(foodName, food.get(foodName) + quantity);
                    }
                    break;
                case "Sell":
                    int soldQuantity = 0;
                    if (!food.containsKey(foodName)){
                        System.out.printf("You do not have any %s.%n", foodName);
                    }else{
                        if (quantity > food.get(foodName)){
                            soldQuantity = food.get(foodName);
                            soldFood.put(foodName, soldFood.get(foodName) + soldQuantity);
                            food.remove(foodName);
                            System.out.printf("There aren't enough %s. You sold the last %d of them.%n", foodName, soldQuantity);
                        }else{
                            soldQuantity = quantity;
                            food.put(foodName, food.get(foodName) - soldQuantity);
                            System.out.printf("You sold %d %s.%n", soldQuantity, foodName);
                            soldFood.put(foodName, soldFood.get(foodName) + soldQuantity);
                            if (food.get(foodName)==0){
                                food.remove(foodName);
                            }
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : food.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue() );

        }
        int allSold = 0;
        for (Map.Entry<String, Integer> sold : soldFood.entrySet()) {
            allSold += sold.getValue();
        }
        System.out.printf("All sold: %d goods", allSold);


    }
}
