package RegularExpressions.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> furnitureNames = new ArrayList<>();
        double totalSum = 0;

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        String text = scanner.nextLine();
        while (!text.equals("Purchase")){
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()){
               String furnitureName = matcher.group(1);
               double price = Double.parseDouble(matcher.group(2));
               int quantity = Integer.parseInt(matcher.group(3));

               furnitureNames.add(furnitureName);
               double furniturePrice = price * quantity;
               totalSum += furniturePrice;
            }

            text = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureNames.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);

    }
}
