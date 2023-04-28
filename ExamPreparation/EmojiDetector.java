package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regexDigits = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigits);
        Matcher matcherDigits = patternDigits.matcher(input);
        int coolThreshold = 1;
        while (matcherDigits.find()) {
            int digit = Integer.parseInt(matcherDigits.group());
            coolThreshold = coolThreshold * digit;
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);

        String regex = "(:{2}|\\*{2})([A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        List<String> emojiList = new ArrayList<>();
        while (matcher.find()) {
            count++;
            String emoji = matcher.group();
            int sum = 0;
            for (int i = 0; i < emoji.length(); i++) {
                char currentChar = emoji.charAt(i);
                if (Character.isLetter(currentChar)) {
                    sum += currentChar;
                }
            }
            if (sum > coolThreshold) {
                emojiList.add(emoji);
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", count);
        for (String s : emojiList) {
            System.out.println(s);
        }


    }
}
