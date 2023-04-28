package ExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(@|#)(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        List<String> mirrorWords = new ArrayList<>();

        while (matcher.find()){
            count++;
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            StringBuilder reversedWordTwo = new StringBuilder(wordTwo);
            String wordTwoReversed = reversedWordTwo.reverse().toString();
            if (wordOne.equals(wordTwoReversed)){
            mirrorWords.add(wordOne + " <=> " + wordTwo);
            }
        }
        if (count == 0){
            System.out.println("No word pairs found!");
        }else{
            System.out.printf("%d word pairs found!%n", count);
        }
        if (mirrorWords.size() == 0){
            System.out.println("No mirror words!");
        }else{
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorWords));

        }

    }
}
