package RegularExpressions.Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> namesList = Arrays.stream(input.split(", ")).collect(Collectors.toList());
        Map<String, Integer> distance = new LinkedHashMap<>();
        namesList.forEach(name -> distance.put(name, 0));

        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String regexDigits = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigits);

        String text = scanner.nextLine();
        while (!text.equals("end of race")){
            StringBuilder nameOfPerson = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(text);
            while (matcherLetters.find()){
                nameOfPerson.append(matcherLetters.group());
            }
            int distanceOfPerson = 0;
            Matcher matcherDigits = patternDigits.matcher(text);
            while (matcherDigits.find()){
                distanceOfPerson += Integer.parseInt(matcherDigits.group());
            }
            if (namesList.contains(nameOfPerson.toString())){
                int currentDistance = distance.get(nameOfPerson.toString());
                distance.put(nameOfPerson.toString(), distanceOfPerson + currentDistance);
            }

            text = scanner.nextLine();
        }
        List<String> top3 = distance.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry-> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + top3.get(0));
        System.out.println("2nd place: " + top3.get(1));
        System.out.println("3rd place: " + top3.get(2));
    }
}
