package Methods.Lab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int numInput1 = Integer.parseInt(scanner.nextLine());
        int numInput2 = Integer.parseInt(scanner.nextLine());
//        ("add", "multiply", "subtract", "divide")
        switch (command) {
            case "add":
                addNum(numInput1, numInput2);
                break;
            case "multiply":
                multiplyNum(numInput1, numInput2);
                break;
            case "subtract":
                subtractNum(numInput1, numInput2);
                break;
            case "divide":
                divideNum(numInput1, numInput2);
                break;
        }
    }

    public static void addNum(int num1, int num2) {
        int result = 0;
        result = num1 + num2;
        System.out.println(result);
    }

    public static void multiplyNum(int num1, int num2) {
        int result = 0;
        result = num1 * num2;
        System.out.println(result);
    }

    public static void subtractNum(int num1, int num2) {
        int result = 0;
        result = num1 - num2;
        System.out.println(result);
    }

    public static void divideNum(int num1, int num2) {
        int result = 0;
        result = num1 / num2;
        System.out.println(result);
    }

}
