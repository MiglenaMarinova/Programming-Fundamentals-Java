package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer ::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

         String input = scanner.nextLine();

        while (!input.equals("end")){
            if (input.contains("Add")){
                int wagonToAdd = Integer.parseInt(input.split("\\s+")[1]);
                wagons.add(wagonToAdd);
            }else if (!input.contains("Add")){
                int passengerToAdd = Integer.parseInt(input.split("\\s+")[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int countPassInside = wagons.get(i);
                    if ((countPassInside + passengerToAdd) <= maxCapacity){
                        wagons.set(i, countPassInside + passengerToAdd);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int element : wagons) {
            System.out.print(element + " ");
        }

    }
}

