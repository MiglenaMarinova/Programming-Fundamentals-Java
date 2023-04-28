package Methods.Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repadText(text, n));

    }
    public static String repadText (String text, int n){
        String result = "";
        for (int i = 1; i <=n ; i++) {
            result = result + text;
        }
        return result;
    }
}
