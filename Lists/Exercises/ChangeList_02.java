package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            if (input.contains("Delete")){//Delete {element} - delete all elements in the array which are equal to the given element
                int numberToRemove = Integer.parseInt(input.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numberToRemove));
            }else if (input.contains("Insert")){//Insert {element} {position} - insert element at the given position
                int element = Integer.parseInt(input.split(" ")[1]);
                int index = Integer.parseInt(input.split(" ")[2]);
                numbers.add(index, element);
            }

            input = scanner.nextLine();
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }

    }
}
