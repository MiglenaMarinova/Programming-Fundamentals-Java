package ExamPreparation;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int allStudent = Integer.parseInt(scanner.nextLine());

        int studentPerHour = firstEmployee + secondEmployee + thirdEmployee;
        double timeNeeded = 0;
        if (allStudent > 0){
            timeNeeded = Math.ceil(allStudent * 1.0/ studentPerHour);
        }
        double countBreak = 0;
        if (timeNeeded > 3){
            countBreak = Math.floor(timeNeeded / 3);

        }
        double totalTimeNeeded = timeNeeded + countBreak;
        System.out.printf("Time needed: %.0fh.", totalTimeNeeded);
    }

}
