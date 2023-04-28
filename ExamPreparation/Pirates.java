package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> cityPopulation = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> cityGold = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Sail")) {
            String cityName = input.split("\\|\\|")[0];
            int population = Integer.parseInt(input.split("\\|\\|")[1]);
            int gold = Integer.parseInt(input.split("\\|\\|")[2]);
            if (!cityPopulation.containsKey(cityName) && !cityGold.containsKey(cityName)) {
                cityPopulation.put(cityName, population);
                cityGold.put(cityName, gold);
            }else{
                cityPopulation.put(cityName, cityPopulation.get(cityName) + population);
                cityGold.put(cityName, cityGold.get(cityName) + gold);
            }
            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("End")){
//•	"Plunder=>{town}=>{people}=>{gold}"
            String event = command.split("=>")[0];
            String town = command.split("=>")[1];
            if (event.equals("Plunder")){
                int people = Integer.parseInt(command.split("=>")[2]);
                int gold = Integer.parseInt(command.split("=>")[3]);
                if (gold > cityGold.get(town)){
                    gold = cityGold.get(town);
                }else if(people > cityPopulation.get(town)){
                    people = cityPopulation.get(town);
                }
                cityGold.put(town, cityGold.get(town) - gold);
                cityPopulation.put(town, cityPopulation.get(town) - people);
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                if (cityGold.get(town) == 0 || cityPopulation.get(town) == 0){
                    cityGold.remove(town);
                    cityPopulation.remove(town);
                    System.out.printf("%s has been wiped off the map!%n", town);
                }
            }else if (event.equals("Prosper")){
                int gold = Integer.parseInt(command.split("=>")[2]);
                if (gold < 0){
                    System.out.println("Gold added cannot be a negative number!");
                }else{
                    cityGold.put(town, cityGold.get(town) + gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, cityGold.get(town));
                }
            }
            command = scanner.nextLine();
        }
        if (cityGold.size() == 0){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }else{
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cityGold.size());
//            {town1} -> Population: {people} citizens, Gold: {gold} kg
            cityPopulation.entrySet().forEach(entry->{
                String name = entry.getKey();
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue(), cityGold.get(name));
            });
        }
    }
}
