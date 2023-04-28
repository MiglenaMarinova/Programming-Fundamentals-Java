package Maps.Lab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();

        for (String word : wordsArr){
            word = word.toLowerCase();
            wordMap.putIfAbsent(word, 0);
            wordMap.put(word, wordMap.get(word) + 1);
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() % 2 != 0){
                result.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", result));
    }
}
