package Maps.Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> wordsMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            wordsMap.putIfAbsent(word, new ArrayList<>());
            wordsMap.get(word).add(synonym);

        }
        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }


    }
}
