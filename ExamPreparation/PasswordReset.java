package ExamPreparation;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String commandInput = scanner.nextLine();
        StringBuilder newPassword = new StringBuilder();

        while (!commandInput.equals("Done")){
            String command = commandInput.split(" ")[0];
            if (command.equals("TakeOdd")){
                for (int i = 1; i < password.length() ; i+=2) {
                    char currentSymbol = password.charAt(i);
                    newPassword.append(currentSymbol);
                }
                password = newPassword.toString();
                System.out.println(password);
            }else if (command.equals("Cut")){
                int startIndex = Integer.parseInt(commandInput.split(" ")[1]);
                int endIndex = Integer.parseInt(commandInput.split(" ")[2]) + startIndex;
                String substringToRemove = password.substring(startIndex, endIndex);
                password = password.replaceFirst(substringToRemove, "");
                System.out.println(password);
            }else if (command.contains("Substitute")){
                String substring = commandInput.split(" ")[1];
                String substitute = commandInput.split(" ")[2];
                if (password.contains(substring)){
                    password = password.replaceAll(substring, substitute);
                    System.out.println(password);
                }else{
                    System.out.println("Nothing to replace!");
                }
            }
            commandInput = scanner.nextLine();
        }
        System.out.printf("Your password is: %s",password);
    }
}
