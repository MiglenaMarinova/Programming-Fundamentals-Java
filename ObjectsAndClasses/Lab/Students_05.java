package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    public static class Student{
        String firstName;
        String lastName;
        int age;
        String hometown;

        public Student(String firstName, String lastName, int age, String hometown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public String getHometown() {
            return this.hometown;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] studentInfo = command.split(" ");
            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            int age = Integer.parseInt(studentInfo[2]);
            String hometown = studentInfo[3];

            Student currentStudent = new Student(firstName, lastName, age, hometown);
            studentList.add(currentStudent);

            command = scanner.nextLine();
        }
        String homeTown = scanner.nextLine();
        for (Student item : studentList){
            if (item.getHometown().equals(homeTown)){
                System.out.printf("%s %s is %d years old%n", item.getFirstName(),item.getLastName(),item.getAge());
            }
        }

    }
}
