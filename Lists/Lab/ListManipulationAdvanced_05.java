package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split(" ")[0];
            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(input.split(" ")[1]);
                    boolean contain = false;
                    for (int i = 0; i < numers.size(); i++) {
                        int currentNum = numers.get(i);
                        if (currentNum == number) {
                            contain = true;
                        }
                    }
                    if (contain) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String command1 = input.split(" ")[1];
                    if (command1.equals("even")) {
                        for (int i = 0; i < numers.size(); i++) {
                            int currentNum = numers.get(i);
                            if (currentNum % 2 == 0) {
                                System.out.print(currentNum + " ");
                            }
                        }
                        System.out.println();
                    } else if (command1.equals("odd")) {
                        for (int i = 0; i < numers.size(); i++) {
                            int currentNum = numers.get(i);
                            if (currentNum % 2 != 0) {
                                System.out.print(currentNum + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sumAll = 0;
                    for (int i = 0; i < numers.size(); i++) {
                        int currentNum = numers.get(i);
                        sumAll += currentNum;
                    }
                    System.out.println(sumAll);
                    break;
                case "Filter":
                    String condition = input.split(" ")[1];
                    int number1 = Integer.parseInt(input.split(" ")[2]);
                    switch (condition) {
                        case "<":
                            for (int element : numers) {
                                if (element < number1) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int element : numers) {
                                if (element > number1) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int element : numers) {
                                if (element >= number1) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int element : numers) {
                                if (element <= number1) {
                                    System.out.print(element + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
