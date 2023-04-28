package Maps.Exercises;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Double> productPrice = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String name = input.split(" ")[0];
            Double price = Double.parseDouble(input.split(" ")[1]);
            Integer quantity = Integer.parseInt(input.split(" ")[2]);

            productPrice.put(name, price);

            if (!productQuantity.containsKey(name)){
                productQuantity.put(name, quantity);
            }else{
                productQuantity.put(name, productQuantity.get(name) + quantity);
            }
            input= scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productPrice.entrySet()) {
            String nameOfProduct = entry.getKey();
            double totalPrice = entry.getValue() * productQuantity.get(nameOfProduct);
            System.out.printf("%s -> %.2f%n", nameOfProduct, totalPrice);

        }

    }
}
