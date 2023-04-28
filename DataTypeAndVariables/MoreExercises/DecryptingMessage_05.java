package DataTypeAndVariables.MoreExercises;

import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            char symbol = input.charAt(0);
            char decrypt = (char) ((int)symbol + key);

            System.out.printf("%c", decrypt);

        }

    }
}
