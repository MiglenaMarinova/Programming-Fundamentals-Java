package Lists.Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(numbers);

        System.out.println(numbers.toString().replace("[", "")
                .replace("]", "")
                        .trim()
                        .replaceAll(",", "")
                .replaceAll("\\s+", " "));


    }
}
