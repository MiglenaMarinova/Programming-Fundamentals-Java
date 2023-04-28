package RegularExpressions.Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.length() == 0) return;
        String[] demonsNames = input.split("[,\\s]+");


        for (String demon : demonsNames) {
            double totalHealth = getTotalHealth(demon);
            double sumAll = 0;
            Pattern patternNum = Pattern.compile("[-+.0-9]+");
            Matcher matcherNum = patternNum.matcher(demon);
            while (matcherNum.find()) {
                sumAll += Double.parseDouble(matcherNum.group());
            }

            for (char symbol : demon.toCharArray()) {
                if (symbol == '*') {
                    sumAll = sumAll * 2;
                } else if (symbol == '/') {
                    sumAll = sumAll / 2;
                }
            }
            System.out.printf("%s - %.0f health, %.2f damage%n", demon, totalHealth, sumAll);
        }
    }


    private static double getTotalHealth(String name) {
        double sum = 0;
        Pattern pattern = Pattern.compile("[^0-9+*/.-]");
        Matcher matcher = pattern.matcher(name);
        while (matcher.find()) {
            sum += matcher.group().charAt(0);

        }
        return sum;
    }
}
