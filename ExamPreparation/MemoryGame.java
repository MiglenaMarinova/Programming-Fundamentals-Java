package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();

        int moves = 0;
        boolean gameIsOver = false;


        while (!input.equals("end") ){

            moves++;
            int index1 = Integer.parseInt(input.split("\\s+")[0]);
            int index2 = Integer.parseInt(input.split("\\s+")[1]);
            boolean isValidIndex = (index1 >= 0 && index1 <= elementList.size()-1) && (index2 >= 0 && index2 <= elementList.size()-1);
            if (index1 == index2 || !isValidIndex ){
                int middleOfList = elementList.size() / 2;
                for (int i = 1; i <= 2 ; i++) {
                    String toAdd = "-" + moves + "a";
                    elementList.add(middleOfList, toAdd);
                }
                System.out.println("Invalid input! Adding additional elements to the board");
            }else{
                String value1 = elementList.get(index1);
                String value2 = elementList.get(index2);
                if (value1.equals(value2)){
                    elementList.remove(value1);
                    elementList.remove(value2);
                    System.out.printf("Congrats! You have found matching elements - %s!%n", value1);
                    if (elementList.size() ==0){
                        System.out.printf("You have won in %d turns!", moves);
                        break;
                    }
                }else {
                    System.out.println("Try again!");
                }
            }

            input = scanner.nextLine();
            if (input.equals("end")){
                gameIsOver = true;
                break;
            }
        }
        if (gameIsOver){
            System.out.println("Sorry you lose :(");
            for (String item : elementList){
                System.out.print(item + " ");
            }
        }//else{
          //  System.out.printf("You have won in %d turns!", moves);
        //}
    }
}
