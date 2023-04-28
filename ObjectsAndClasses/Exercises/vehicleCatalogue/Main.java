package ObjectsAndClasses.Exercises.vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] vehicleData = input.split("\\s+");
            vehicleList.add(new Vehicle(vehicleData[0], vehicleData[1], vehicleData[2], Integer.parseInt(vehicleData[3])));
            input= scanner.nextLine();
        }
        String modelOfVehicle = scanner.nextLine();
        double sumPhCars = 0;
        double sumPhTrucks = 0;
        int counCar = 0;
        int countTruck = 0;

        while (!modelOfVehicle.contains("Close")){
            for (Vehicle vehicle : vehicleList){
                if (vehicle.getModel().equals(modelOfVehicle)){
                    System.out.println(vehicle);
                }
            }
            modelOfVehicle = scanner.nextLine();
        }
        for (Vehicle vehicle : vehicleList){
            if (vehicle.getType().equals("car")){
                sumPhCars += vehicle.getHp();
                counCar++;
            }else if (vehicle.getType().equals("truck")){
                sumPhTrucks += vehicle.getHp();
                countTruck++;
            }
        }
        double averageHpCars = sumPhCars / counCar;
        if (counCar == 0){
            averageHpCars = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHpCars);

        double averageHpTrucks = sumPhTrucks / countTruck;
        if (countTruck == 0){
            averageHpTrucks = 0;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageHpTrucks);


    }
}
