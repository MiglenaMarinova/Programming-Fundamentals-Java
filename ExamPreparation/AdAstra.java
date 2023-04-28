package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(#|\\|)(?<name>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<cal>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int totalCal = 0;
        StringBuilder items = new StringBuilder();

        while (matcher.find()){
            String name = matcher.group("name");
            String date = matcher.group("date");
            int cal = Integer.parseInt(matcher.group("cal"));
            totalCal += cal;
            items.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", name, date, cal));

        }
        int days = totalCal / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        System.out.println(items);

    }
}
