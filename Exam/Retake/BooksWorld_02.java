package Exam.Retake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksWorld_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> genreList = Arrays.stream(scanner.nextLine().split(" \\| ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Stop!")) {
            String[] data = command.split("\\s+");

            switch (data[0]) {
                case "Join":
                    String genre = data[1];
                    if (!genreList.contains(genre)) {
                        genreList.add(genre);
                    }
                    break;
                case "Drop":
                    String currentGenre = data[1];
                    genreList.remove(currentGenre);
                    break;
                case "Replace":
                    String oldGenre = data[1];
                    String newGenre = data[2];
                    if (!genreList.contains(newGenre) && genreList.contains(oldGenre)) {
                        int indexOldGenre = genreList.indexOf(oldGenre);
                        genreList.set(indexOldGenre, newGenre);
                    }
                    break;
                case "Prefer":
                    int index1 = Integer.parseInt(data[1]);
                    int index2 = Integer.parseInt(data[2]);
                    if (index1 >= 0 && index1 <= genreList.size() - 1 && index2 >= 0 && index2 <= genreList.size() - 1){
                        String genre1 = genreList.get(index1);
                        String genre2 = genreList.get(index2);
                        genreList.set(index1, genre2);
                        genreList.set(index2, genre1);
                    }
                    break;

            }

            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", genreList));
    }
}
