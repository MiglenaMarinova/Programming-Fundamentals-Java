package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String product = matcher.group();
                StringBuilder barCode = new StringBuilder();

                for (char current : product.toCharArray()){
                    if (Character.isDigit(current)){
                        barCode.append(current);
                    }
                }
                if (barCode.length() ==0){
                    System.out.println("Product group: 00");
                }else{
                    System.out.printf("Product group: %s%n", barCode);
                }
            }else{
                System.out.println("Invalid barcode");
            }

        }

    }
}
