package Lists.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            String command = scanner.nextLine();
            String name = command.split(" ")[0];
            if (!command.contains("not")){
                if (!names.contains(name)){
                    names.add(name);
                }else{
                    System.out.println(name + " is already in the list!");
                }
            }else{
                if (names.contains(name)){
                    names.remove(name);
                }else{
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    }
}
