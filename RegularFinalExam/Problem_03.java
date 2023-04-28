package RegularFinalExam;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap <String, Integer> usersLikes = new LinkedHashMap<>();
        LinkedHashMap <String, Integer> usersComments = new LinkedHashMap<>();

        while (!input.equals("Log out")){
            String command = input.split(":\\s+")[0];
            String username = input.split(":\\s+")[1];

            if (command.equals("New follower")){
                usersLikes.putIfAbsent(username, 0);
                usersComments.putIfAbsent(username, 0);
            }else if (command.equals("Like")){
                int countLikes = Integer.parseInt(input.split(":\\s+")[2]);
                if (usersLikes.containsKey(username)){
                    usersLikes.put(username, usersLikes.get(username) + countLikes);

                }else{
                    usersLikes.put(username, countLikes);

                }

            }else if (command.equals("Comment")){
                if (usersComments.containsKey(username)){
                    usersComments.put(username, usersComments.get(username) + 1);
                }else{
                    usersComments.put(username, 1);
                }

            }else if (command.equals("Blocked")){
                if (!usersLikes.containsKey(username) && !usersComments.containsKey(username)){
                    System.out.printf("%s doesn't exist.%n", username);
                }else{
                    usersLikes.remove(username);
                    usersComments.remove(username);
                }
            }

            input = scanner.nextLine();
        }
        //o	"{count} followers
        //{username}: {likes+comments}
        //{username}: {likes+comments}
        //…
        //{username}: {likes+comments}"
        //System.out.printf("%s: %d%n", entry.getKey(), entry.getValue() + usersComments.get(name));
        System.out.printf("%d followers%n", usersLikes.size());
        usersLikes.entrySet().forEach(entry->{
            String name = entry.getKey();
            int likes = entry.getValue();
            if (!usersComments.containsKey(name)){
                usersComments.put(name, 0);
            }
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue() + usersComments.get(name));
        });

    }
}
