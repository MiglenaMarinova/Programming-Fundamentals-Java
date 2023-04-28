package ObjectsAndClasses.Exercises.articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();
        String[] articleInfo = articleData.split(", ");

        String title = articleInfo[0];
        String content = articleInfo[1];
        String author = articleInfo[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            String input = scanner.nextLine();
            if (input.contains("Edit")){
                String newContent = input.split(": ")[1];
                article.edit(newContent);
            }else if (input.contains("ChangeAuthor")){
                String newAuthor = input.split(": ")[1];
                article.changeAuthor(newAuthor);
            }else if (input.contains("Rename")){
                String newTitle = input.split(": ")[1];
                article.rename(newTitle);
            }

        }
        System.out.println(article);
    }
}
