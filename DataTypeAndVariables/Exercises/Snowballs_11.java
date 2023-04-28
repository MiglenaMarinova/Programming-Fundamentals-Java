package DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballCount = Integer.parseInt(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;

        double snowballSnowHi = 0;
        double snowballTimeHi = 0;
        double snowballQualityHi = 0;
        double snowballValue = 0;

        boolean isHighest = false;

        for (int i = 1; i <= snowballCount ; i++) {
            double snowballSnow = Double.parseDouble(scanner.nextLine());
            double snowballTime = Double.parseDouble(scanner.nextLine());
            double snowballQuality = Double.parseDouble(scanner.nextLine());

            snowballValue = Math.pow(( snowballSnow / snowballTime ), snowballQuality);
            if (snowballValue > maxValue){
                maxValue = snowballValue;
                snowballSnowHi = snowballSnow;
                snowballTimeHi = snowballTime;
                snowballQualityHi = snowballQuality;

                isHighest = true;
            }
        }
        if (isHighest){
            System.out.printf("%.0f : %.0f = %.0f (%.0f)", snowballSnowHi, snowballTimeHi, maxValue, snowballQualityHi);
        }

    }
}
