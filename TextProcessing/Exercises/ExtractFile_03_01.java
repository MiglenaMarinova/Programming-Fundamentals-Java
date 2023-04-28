package TextProcessing.Exercises;

import java.util.Scanner;

public class ExtractFile_03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int lastIndex = input.lastIndexOf("\\");
        String fullName = input.substring(lastIndex + 1);

        int indexPoint = fullName.indexOf(".");
        String fileName = fullName.substring(0, indexPoint);
        String extension = fullName.substring(indexPoint + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
