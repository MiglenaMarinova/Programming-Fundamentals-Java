package DataTypeAndVariables.Exercises;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int fullCourses = 0;
        int countCourses = 0;

        if (people % capacity == 0){
            fullCourses = people / capacity;
        }else{
            fullCourses = people / capacity + 1;
        }
        countCourses += fullCourses;
        System.out.printf("%d", countCourses);
    }
}
