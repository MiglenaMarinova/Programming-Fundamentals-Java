package RegularExpressions.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "@(?<planetName>[A-Z]+[a-z]+)[^@!:>-]*:(?<planetPopulation>[0-9]+)[^@!:>-]*!(?<attackType>A|D)![^@!:>-]*->(?<soldierCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String encrypt = scanner.nextLine();
            String decrypted = getDectiptedmassage(encrypt);
            Matcher matcher = pattern.matcher(decrypted);
            if (matcher.find()){
                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attackType");
                if (attackType.equals("A")){
                    attackedPlanets.add(planetName);
                }else if (attackType.equals("D")){
                    destroyedPlanets.add(planetName);
                }
            }
        }
        System.out.println("Attacked planets: " + attackedPlanets.size());
        Collections.sort(attackedPlanets);
        attackedPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets);
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }

    private static String getDectiptedmassage(String encrypt) {
        int countLetters = getCountSpecial(encrypt);
        StringBuilder decryptedMessage = new StringBuilder();
        for (char symbol : encrypt.toCharArray()){
            char currentSymbol = (char)(symbol - countLetters);
            decryptedMessage.append(currentSymbol);
        }
        return decryptedMessage.toString();
    }
    public  static int getCountSpecial(String encrypt){
        int count = 0;
        for (char symbol : encrypt.toCharArray()){
            switch (symbol){
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                case 's':
                case 't':
                case 'a':
                case 'r':
                    count++;
                    break;
            }
        }
        return count;
    }
}
