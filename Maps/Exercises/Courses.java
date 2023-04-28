package Maps.Exercises;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, ArrayList<String>> coursesMap = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String curseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];
            if (!coursesMap.containsKey(curseName)) {
                coursesMap.put(curseName, new ArrayList<>());
            }
            coursesMap.get(curseName).add(studentName);
            input = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : coursesMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            for (String name : entry.getValue()){
                System.out.printf("-- %s%n", name);

            }
        }
    }
}
