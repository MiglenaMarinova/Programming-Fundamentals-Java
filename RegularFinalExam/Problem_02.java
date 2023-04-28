package RegularFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([@]*[#]*)(?<color>[a-z]{3,})([@]*[#]*)(\\W*[_]*)?([\\/]+)(?<amount>[0-9]+)\\5";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){

            System.out.printf("You found %s %s eggs!%n", matcher.group("amount"), matcher.group("color"));
        }
    }
}
