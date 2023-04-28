package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
//•	merge {startIndex} {endIndex}
//•	divide {index} {partitions}


        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            String action = command.split("\\s+")[0];
            switch (action) {
                case "merge":
                    int startIndex = Integer.parseInt(command.split("\\s+")[1]);
                    int endIndex = Integer.parseInt(command.split("\\s+")[2]);
                    if (startIndex < 0){
                        startIndex = 0;
                    }
                    if (endIndex >input.size() - 1) {
                    endIndex = input.size() - 1;
                    }
                    boolean isValidIndex = startIndex <= input.size() - 1 && endIndex >= 0 && startIndex < endIndex;
                    if (isValidIndex){
                        String mergedResult = "";
                        for (int i = startIndex; i <= endIndex ; i++) {
                            String currentText = input.get(i);
                            mergedResult += currentText;
                        }
                        for (int index = startIndex; index <= endIndex; index++) {
                            input.remove(startIndex);
                        }
                        input.add(startIndex, mergedResult);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    int partition = Integer.parseInt(command.split("\\s+")[2]);

                    String textToDivide= input.get(index);
                    input.remove(index);
                    int partsAfterDivide = textToDivide.length() / partition;
                    int startIndexOfText = 0;

                    for (int part = 1; part < partition; part++) {
                        input.add(index, textToDivide.substring(startIndexOfText, startIndexOfText + partsAfterDivide));
                        index++;
                        startIndexOfText += partsAfterDivide;
                    }
                    input.add(index, textToDivide.substring(startIndexOfText));

                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", input));
    }
}
