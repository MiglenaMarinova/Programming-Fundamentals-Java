package Methods.Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printSignNum(num);

    }
    public static void printSignNum(int numSign){
        if (numSign > 0){
            System.out.printf("The number %d is positive.", numSign);
        }else if (numSign < 0){
            System.out.printf("The number %d is negative.", numSign);
        }else{
            System.out.printf("The number %d is zero.", numSign);
        }
    }
}
