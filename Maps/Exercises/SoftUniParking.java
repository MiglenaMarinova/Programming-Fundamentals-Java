package Maps.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> userCar = new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String input = scanner.nextLine();

            String[] command = input.split("\\s+");
            String action = command[0];
            String user = command[1];

            if (action.equals("register")){
                String plateNumber = command[2];
                if (userCar.containsKey(user)){
                    System.out.printf("ERROR: already registered with plate number %s%n", userCar.get(user));
                }else{
                    userCar.put(user, plateNumber);
                    System.out.printf("%s registered %s successfully%n", user, plateNumber);
                }
            }else if (action.equals("unregister")){
                if (!userCar.containsKey(user)){
                    System.out.printf("ERROR: user %s not found%n", user);
                }else{
                    System.out.printf("%s unregistered successfully%n", user);
                    userCar.remove(user, userCar.get(user));
                }
            }
        }
        for (Map.Entry<String, String> entry : userCar.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
