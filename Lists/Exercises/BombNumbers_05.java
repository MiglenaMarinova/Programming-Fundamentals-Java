package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        int specialNum = Integer.parseInt(command.split("\\s+")[0]);
        int power = Integer.parseInt(command.split("\\s+")[1]);

        for (int i = 0; i < numbers.size() - 1; i++) {
            int currentNum = numbers.get(i);
            int currentIndex = i;
            if (currentNum == specialNum){
                if (power <= i ){
                    for (int j = 1; j <= power ; j++) {
                        numbers.remove(currentIndex -1);
                        currentIndex = currentIndex - 1;
                    }
                }else{
                    for (int element = currentIndex - 1; element < currentIndex ; element++) {
                        numbers.remove(currentIndex - 1);
                    }
                }
                if (power <= numbers.size() - currentIndex){
                    for (int element = 1; element <=  power ; element++) {
                        numbers.remove(currentIndex + 1);
                    }
                }else{
                    for (int element = currentIndex +1; element <= numbers.size() - 1 ; element++) {
                        numbers.remove(currentIndex + 1);
                    }
                }
            }
        }
        int sumElement = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sumElement += numbers.get(i);

        }
        System.out.println(sumElement - specialNum);


    }
}
