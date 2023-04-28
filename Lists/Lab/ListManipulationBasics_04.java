package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
//          Add {number}: add a number to the end of the list
//          Remove {number}: remove a number from the list
//          RemoveAt {index}: remove a number at a given index
//          Insert {number} {index}: insert a number at a given index

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String commandArr = command.split(" ")[0];
            if (commandArr.equals("Add")){
                int numToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numToAdd);
            }else if (commandArr.equals("Remove")){
                int numToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(numToRemove));
            }else if (commandArr.equals("RemoveAt")){
                int index = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(index);
            }else if (commandArr.equals("Insert")){
                int numToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbers.add(index,numToInsert);
            }

            command= scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
