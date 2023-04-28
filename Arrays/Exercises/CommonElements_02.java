package Arrays.Exercises;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        
        String[] firstArr = firstInput.split(" ");
        String[] secondArr = secondInput.split(" ");

        for (int element2 = 0; element2 < secondArr.length; element2++) {
            for (int element1 = 0; element1 < firstArr.length ; element1++) {
                if (firstArr[element1].equals(secondArr[element2])){
                    System.out.print(secondArr[element2] + " ");
                }

            }
            
        }
        
    }
}
