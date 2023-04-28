package Lists.Exercises;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer :: parseInt).collect(Collectors.toList());

        int sumRemovedElements = 0;

        while (numbers.size() > 0){
            int index = Integer.parseInt(scanner.nextLine());
            if (index>=0 && index<= numbers.size()-1){
                int valueRemovedIndex = numbers.get(index);
                sumRemovedElements += valueRemovedIndex;
                numbers.remove(index);
                for (int i = 0; i <= numbers.size()-1; i++) {
                    int currentElemnent = numbers.get(i);
                    if (currentElemnent <= valueRemovedIndex){
                        currentElemnent += valueRemovedIndex;
                    }else {
                        currentElemnent -= valueRemovedIndex;
                    }
                    numbers.set(i,currentElemnent);
                }
            }else if (index < 0){
                int valueFirsElement = numbers.get(0);
                numbers.remove(0);
                numbers.add(0, numbers.get(numbers.size()-1));
                sumRemovedElements += valueFirsElement;
                for (int i = 0; i <= numbers.size()-1; i++) {
                    int currentElemnent = numbers.get(i);
                    if (currentElemnent <= valueFirsElement){
                        currentElemnent += valueFirsElement;
                    }else {
                        currentElemnent -= valueFirsElement;
                    }
                    numbers.set(i,currentElemnent);
                }
            }else if(index > numbers.size() -1){
                int valueLastElement = numbers.get(numbers.size()-1);
                numbers.remove(numbers.size()-1);
                numbers.add(numbers.get(0));
                sumRemovedElements += valueLastElement;

                for (int i = 0; i <= numbers.size()-1; i++) {
                    int currentElemnent = numbers.get(i);
                    if (currentElemnent <= valueLastElement){
                        currentElemnent += valueLastElement;
                    }else {
                        currentElemnent -= valueLastElement;
                    }
                    numbers.set(i,currentElemnent);
                }

            }

        }
        System.out.println(sumRemovedElements);
    }
}
