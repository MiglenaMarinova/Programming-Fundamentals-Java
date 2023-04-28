package Maps.Lab;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Double> fruitMap = new LinkedHashMap<>();
        fruitMap.put("Banana", 1.60);
        fruitMap.put("Apple", 3.60);

        for (Map.Entry<String, Double> entry : fruitMap.entrySet()) {
            String currentFruit = entry.getKey();
            double currentPrice = entry.getValue();

            System.out.printf("%s -> %.2f%n", currentFruit, currentPrice);
        }


    }
}
