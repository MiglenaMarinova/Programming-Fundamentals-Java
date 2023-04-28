package ObjectsAndClasses.Exercises.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n ; row++) {
            String input = scanner.nextLine();
            String firstName = input.split(" ")[0];
            String secondName = input.split(" ")[1];
            double grade = Double.parseDouble(input.split(" ")[2]);

            Student student = new Student(firstName, secondName, grade);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : studentList){
            System.out.println(student);
        }
    }
}
