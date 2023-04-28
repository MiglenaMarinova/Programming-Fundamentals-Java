package TextProcessing.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split("\\\\");

        String fullName = inputArr[inputArr.length-1];
        String fileName = fullName.split("\\.")[0];
        String extension = fullName.split("\\.")[1];

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", extension);

    }
}
