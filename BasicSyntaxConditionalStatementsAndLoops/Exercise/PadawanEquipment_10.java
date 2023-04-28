package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double pricePerSaber = Double.parseDouble(scanner.nextLine());
        double pricePerRobe = Double.parseDouble(scanner.nextLine());
        double pricePerBelt = Double.parseDouble(scanner.nextLine());

        double priceSaber = Math.ceil(countStudents * 1.1)  * pricePerSaber;
        double priceRobes = pricePerRobe * countStudents;
        double priceBelt = pricePerBelt * (countStudents - countStudents /6);

        double totalPrice = priceSaber + priceRobes + priceBelt;
        if (budget >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - budget);
        }

    }
}
