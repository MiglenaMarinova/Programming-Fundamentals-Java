package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

//      •	Add {number} - add number at the end
//      •	Insert {number} {index} - insert number at given index
//      •	Remove {index} - remove that index
//      •	Shift left {count} - first number becomes last 'count' times
//      •	Shift right {count} - last number becomes first 'count' times

        String input = scanner.nextLine();

        while (!input.equals("End")){
            if (input.contains("Add")){
                int numToAdd = Integer.parseInt(input.split("\\s+")[1]);
                numbers.add(numToAdd);
            }else if (input.contains("Insert")){
                int numToInsert = Integer.parseInt(input.split("\\s+")[1]);
                int index = Integer.parseInt(input.split("\\s+")[2]);
                if (isValidIndex(index,numbers)){
                    numbers.add(index, numToInsert);
                }else{
                    System.out.println("Invalid index");
                }
            }else if (input.contains("Remove")){
                int index = Integer.parseInt(input.split("\\s+")[1]);
                if (isValidIndex(index,numbers)){
                    numbers.remove(index);
                }else{
                    System.out.println("Invalid index");
                }
            }else if (input.contains("Shift left")){
                int countLeft = Integer.parseInt(input.split("\\s+")[2]);
                for (int i = 1; i <= countLeft; i++) {
                    int firstNum = numbers.get(0);
                    numbers.add(firstNum);
                    numbers.remove(0);
                }
            }else if (input.contains("Shift right")){
                int countRight = Integer.parseInt(input.split("\\s+")[2]);
                for (int i = 1; i <= countRight; i++) {
                    int lastNum = numbers.get(numbers.size() -1);
                    numbers.add(0, lastNum);
                    numbers.remove(numbers.size()-1);
                }
            }
            input = scanner.nextLine();
        }
        for (int element : numbers){
            System.out.print(element + " ");
        }

    }
    public static boolean isValidIndex (int index, List<Integer> num){
        return index >= 0 && index <= num.size() - 1;
    }
}
