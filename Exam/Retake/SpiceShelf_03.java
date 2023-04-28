package Exam.Retake;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpiceShelf_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> spicesList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("done")) {
            String[] data = command.split("\\s+");

            switch (data[0]) {
                case "AddSpice":
                    String spice = data[1];
                    if (!spicesList.contains(spice)) {
                        spicesList.add(spice);
                    }
                    break;
                case "AddManySpices":
                    int index = Integer.parseInt(data[1]);
                    String spices = data[2];
                    String[] spicesToAdd = spices.split("\\|");
                    for (int j = spicesToAdd.length - 1; j >= 0; j--) {
                        String spiceToAdd = spicesToAdd[j];
                        spicesList.add(index, spiceToAdd);
                    }

                    break;
                case "SwapSpices":
                    String spice1 = data[1];
                    String spice2 = data[2];
                    if (spicesList.contains(spice1) && spicesList.contains(spice2)) {
                        int index1 = spicesList.indexOf(spice1);
                        int index2 = spicesList.indexOf(spice2);
                        spicesList.set(index1, spice2);
                        spicesList.set(index2, spice1);
                    }
                    break;
                case "ThrowAwaySpices":
                    String spiceToRemove = data[1];
                    int indexToRemove = Integer.parseInt(data[2]);
                    int indexSpiceToRemove = spicesList.indexOf(spiceToRemove);
                    int count = 0;
                    for (int i = indexSpiceToRemove; i < spicesList.size(); i++) {
                        spicesList.remove(i);
                        i--;
                        count++;
                        if (count == indexToRemove) {
                            break;
                        }
                    }
                    break;
                case "Arrange":
                    Collections.sort(spicesList);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", spicesList));
    }
}
