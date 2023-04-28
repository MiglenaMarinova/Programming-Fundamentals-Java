package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();


        while (!input.equals("course start")) {
            String command = input.split(":")[0];
            String lessonTitle = input.split(":")[1];

            switch (command) {
                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(input.split(":")[2]);
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    if (schedule.contains(lessonTitle)){
                        schedule.remove(lessonTitle);
                    }
                    int indexLesson = schedule.indexOf(lessonTitle);
                    if (schedule.get(indexLesson + 1).equals(lessonTitle + "-" + "Exercise")) {
                        schedule.remove(indexLesson + 1);
                    }
                    break;
                case "Swap":
                    String lesonTitle1 = input.split(":")[2];
                    if (schedule.contains(lessonTitle) && schedule.contains(lesonTitle1)) {
                        int index1 = schedule.indexOf(lessonTitle);
                        int index2 = schedule.indexOf(lesonTitle1);
                        schedule.set(index1, lesonTitle1);
                        schedule.set(index2, lessonTitle);

                        String lessonExe1 = lessonTitle + "-" + "Exercise";
                        String lessonExe2 = lesonTitle1 + "-" + "Exercise";
                        if (schedule.contains(lessonExe1)){
                            schedule.remove(schedule.indexOf(lessonExe1));
                            schedule.add(schedule.indexOf(lessonTitle) + 1, lessonExe1);
                        }
                        if (schedule.contains(lessonExe2)){
                            schedule.remove(schedule.indexOf(lessonExe2));

                            schedule.add(schedule.indexOf(lesonTitle1) + 1, lessonExe2);
                        }
                        System.out.println();
                    }
                    break;
                case "Exercise":
                    int indexOfLesson = schedule.indexOf(lessonTitle);
                    String lessonExe = lessonTitle + "-" + "Exercise";
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                        schedule.add(lessonExe);
                    }else {
                        if (indexOfLesson == schedule.size() -1){
                            schedule.add(indexOfLesson + 1, lessonExe);
                        }else if (!schedule.get(indexOfLesson + 1).equals(lessonExe)){
                            schedule.add(indexOfLesson + 1, lessonExe);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        int number = 1;
        for (String element : schedule){
            System.out.println(number + "." + element);
            number++;
        }
    }
}
