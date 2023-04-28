package DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String biggestKeg = "";

        for (int i = 1; i <=n ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double volume = Math.PI * radius * radius * height;
            if (volume > maxVolume){
                maxVolume = volume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
    }
}
