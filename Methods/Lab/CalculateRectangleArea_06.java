package Methods.Lab;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widthInput = Double.parseDouble(scanner.nextLine());
        double lengthInput = Double.parseDouble(scanner.nextLine());
        double area = getRectangleArea(widthInput, lengthInput);
        System.out.printf("%.0f", area);
    }
    public  static double getRectangleArea (double width, double length){
        return width * length;
    }
}
