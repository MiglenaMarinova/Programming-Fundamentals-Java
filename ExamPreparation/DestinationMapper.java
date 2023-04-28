package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(\\=|\\/)(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destination = new ArrayList<>();
        int sum = 0;

        while (matcher.find()){
           String destinat = matcher.group("destination");
           destination.add(destinat);
           sum += destinat.length();
        }
        System.out.println("Destinations: " + String.join(", ", destination) );
        System.out.printf("Travel Points: %d", sum);
    }
}
