package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> hPointsMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> mPointsMap = new LinkedHashMap<>();


        for (int i = 1; i <= n; i++) {
            String[] heroData = scanner.nextLine().split("\\s+");
            String heroName = heroData[0];
            int hp = Integer.parseInt(heroData[1]);
            int mp = Integer.parseInt(heroData[2]);
            hPointsMap.put(heroName, hp);
            mPointsMap.put(heroName, mp);
        }
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String command = input.split("\\s+-\\s+")[0];
            String heroName = input.split("\\s+-\\s+")[1];
            switch (command) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(input.split("\\s+-\\s+")[2]);
                    String spellName = input.split("\\s+-\\s+")[3];
                    if (mPointsMap.get(heroName) >= mpNeeded){
                        mPointsMap.put(heroName, mPointsMap.get(heroName) - mpNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mPointsMap.get(heroName));
                    }else{
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(input.split("\\s+-\\s+")[2]);
                    String attacker = input.split("\\s+-\\s+")[3];
                    hPointsMap.put(heroName, hPointsMap.get(heroName) - damage);
                    if (hPointsMap.get(heroName) > 0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, hPointsMap.get(heroName));
                    }else{
                        hPointsMap.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n",heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(input.split("\\s+-\\s+")[2]);
                    int currentMP = mPointsMap.get(heroName);
                    mPointsMap.put(heroName, mPointsMap.get(heroName) + amount);
                    if (mPointsMap.get(heroName) > 200){
                        mPointsMap.put(heroName, 200);
                        System.out.printf("%s recharged for %d MP!%n", heroName, 200 - currentMP);
                    }else{
                        System.out.printf("%s recharged for %d MP!%n", heroName, amount);
                    }
                    break;
                case "Heal":
                    int healAmount = Integer.parseInt(input.split("\\s+-\\s+")[2]);
                    int currentHp = hPointsMap.get(heroName);
                    hPointsMap.put(heroName, hPointsMap.get(heroName) + healAmount);
                    if (hPointsMap.get(heroName) > 100){
                        hPointsMap.put(heroName, 100);
                        System.out.printf("%s healed for %d HP!%n", heroName, 100 - currentHp);
                    }else{
                        System.out.printf("%s healed for %d HP!%n", heroName, healAmount);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        //2 spaces):
        //"{hero name}
        //  HP: {current HP}
        //  MP: {current MP}"
        for (Map.Entry<String, Integer> entry : hPointsMap.entrySet()) {
            String heroName = entry.getKey();
            if (mPointsMap.containsKey(heroName)){
                int mPoint = mPointsMap.get(heroName);
                System.out.printf("%s\n" +"  HP: %d\n" +"  MP: %d\n", heroName, entry.getValue(), mPoint);
            }
        }

    }
}
