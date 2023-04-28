package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int countUncorrect = 0;

        for (int position = username.length() - 1; position >= 0 ; position--) {
            char symbol = username.charAt(position);
            password = password + symbol;
        }
        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)){
            countUncorrect ++;
            if (countUncorrect > 3){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        if (enteredPassword.equals(password)){
            System.out.printf("User %s logged in.", username);
        }
    }
}
