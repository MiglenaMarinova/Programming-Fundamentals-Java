package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class NeedForSpeed_III {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> carMileage = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> carFuel = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] carData = scanner.nextLine().split("\\|");
            String carName = carData[0];
            int mileage = Integer.parseInt(carData[1]);
            int fuel = Integer.parseInt(carData[2]);
            carMileage.put(carName, mileage);
            carFuel.put(carName, fuel);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String command = input.split(" : ")[0];
            String carName = input.split(" : ")[1];
            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(input.split(" : ")[2]);
                    int neededFuel = Integer.parseInt(input.split(" : ")[3]);
                    if (carFuel.get(carName) < neededFuel){
                        System.out.println("Not enough fuel to make that ride");
                    }else{
                        carMileage.put(carName, carMileage.get(carName) + distance);
                        carFuel.put(carName, carFuel.get(carName) - neededFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carName, distance, neededFuel);
                    }
                    if (carMileage.get(carName) >= 100000){
                        carMileage.remove(carName);
                        System.out.printf("Time to sell the %s!%n", carName);
                    }
                    break;
                case "Refuel":
                    int fuelToRefuel = Integer.parseInt(input.split(" : ")[2]);
                    int emptySpace = 75 - carFuel.get(carName);
                    if (fuelToRefuel <= emptySpace){
                        carFuel.put(carName, carFuel.get(carName) + fuelToRefuel);
                        System.out.printf("%s refueled with %d liters%n", carName, fuelToRefuel);
                    }else{
                        carFuel.put(carName, carFuel.get(carName) + emptySpace);
                        System.out.printf("%s refueled with %d liters%n", carName, emptySpace);
                    }
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(input.split(" : ")[2]);
                    int mileageAfterDecrease = carMileage.get(carName) - kilometers;
                    carMileage.put(carName, mileageAfterDecrease);

                    if (carMileage.get(carName) < 10000){
                        carMileage.put(carName, 10000);
                    }else{
                        System.out.printf("%s mileage decreased by %d kilometers%n", carName, kilometers);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        //""{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt.""
        carMileage.entrySet().forEach(entry ->{
            String name = entry.getKey();
            System.out.print(String.format("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue(), carFuel.get(name)));
        });
    }
}
