package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class BackIn30Minutes04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourIn = Integer.parseInt(scanner.nextLine());
        int minutesIn = Integer.parseInt(scanner.nextLine());

        int totalTimeAfter30Min = hourIn * 60 + minutesIn +30;

        int hours = totalTimeAfter30Min / 60;
        int minutes = totalTimeAfter30Min % 60;

        if (hours > 23){
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, minutes);


    }
}
