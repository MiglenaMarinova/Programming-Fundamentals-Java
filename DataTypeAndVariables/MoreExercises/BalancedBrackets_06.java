package DataTypeAndVariables.MoreExercises;

import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean isBalanced = true;

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                count++;
            }
            if (input.equals(")")) {
                count--;
            }
            if (count < 0) {
                isBalanced = false;
                break;
            }
        }
        if (count == 0){
            isBalanced = true;
            System.out.println("BALANCED");
        }else{
            System.out.println("UNBALANCED");
        }


    }


}



