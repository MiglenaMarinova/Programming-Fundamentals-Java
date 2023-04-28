package RegularMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phoneList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] command = input.split(" ");
            String action = command[0];
            String typeOfPhone = command[2];
            if (!phoneList.contains(typeOfPhone) && action.contains("Add")){
                phoneList.add(typeOfPhone);
            }
            if (phoneList.contains(typeOfPhone) && action.contains("Remove")){
                phoneList.remove(typeOfPhone);
            }
            if (action.contains("Bonus")){
                String add = command[3];
                String old = add.split(":")[0];
                String newPhone = add.split(":")[1];
                if (phoneList.contains(old)){
                    int index = phoneList.indexOf(old);
                    phoneList.add(index+1, newPhone);
                }

            }
            if (phoneList.contains(typeOfPhone) && action.contains("Last")){
                phoneList.remove(typeOfPhone);
                phoneList.add(typeOfPhone);

            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", phoneList));
        }
    }

