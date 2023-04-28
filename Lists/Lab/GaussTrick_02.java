package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer ::parseInt).collect(Collectors.toList());

        int countIteration = numbers.size() / 2;
        for (int i = 0; i < countIteration ; i++) {
            int firstElement = numbers.get(i);
            int secondElement= numbers.get(numbers.size() - 1);
            int sumElements = firstElement + secondElement;
            numbers.set(i,sumElements);
            numbers.remove(numbers.size() -1);
        }
        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
