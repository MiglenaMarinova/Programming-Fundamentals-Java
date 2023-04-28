package Maps.Exercises;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<Double>> studentsGradesMap = new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String name = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());
            studentsGradesMap.putIfAbsent(name, new ArrayList<>());
            studentsGradesMap.get(name).add(grade);
        }
        for (Map.Entry<String, ArrayList<Double>> entry : studentsGradesMap.entrySet()) {
            double avr = studentsGradesMap.get(entry.getKey()).stream()
                    .mapToDouble(Double::doubleValue).average().getAsDouble();
            if (avr >= 4.50){
                System.out.printf("%s -> %.2f%n", entry.getKey(), avr);
            }
        }
    }
}
