package Maps.Exercises;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> employeeId = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] command = input.split(" -> ");
            String company = command[0];
            String id = command[1];
            if (!employeeId.containsKey(company)) {
                employeeId.put(company, new ArrayList<>());
            }
            if (!employeeId.get(company).contains(id)) {
                employeeId.get(company).add(id);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : employeeId.entrySet()) {
            System.out.println(entry.getKey());
            for (int id = 0; id <= entry.getValue().size() -1; id++) {
                String currentId = entry.getValue().get(id);
                System.out.println("-- " + currentId);
            }
        }
    }
}
