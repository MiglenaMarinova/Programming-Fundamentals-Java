package Maps.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> resourceQuantity = new LinkedHashMap<>();
        String input = scanner.nextLine();


        while(!input.equals("stop")){

            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            resourceQuantity.putIfAbsent(resource,0);
            resourceQuantity.put(resource, resourceQuantity.get(resource) + quantity);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourceQuantity.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
