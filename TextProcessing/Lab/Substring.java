package TextProcessing.Lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String toChange = scanner.nextLine();

        int index = toChange.indexOf(toRemove);

        while (index != -1){
            toChange = toChange.replace(toRemove, "");
            index = toChange.indexOf(toRemove);
        }
        System.out.println(toChange);

    }
}
