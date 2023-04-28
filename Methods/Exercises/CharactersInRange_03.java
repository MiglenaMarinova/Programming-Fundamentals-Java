package Methods.Exercises;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printCharInRange(symbol1, symbol2);


    }
    public static void printCharInRange (char symbol1, char symbol2){
        if(symbol1 < symbol2){
            for (char symbol = (char)(symbol1 + 1); symbol <= symbol2 - 1; symbol++) {
                System.out.print(symbol + " ");
            }
        }else{
            for (char symbol = (char)(symbol2 + 1); symbol <= symbol1 - 1 ; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }

}
