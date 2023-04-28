package ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] stateOfLift = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int maxPeople = 4;
        int peopleIn = 0;
        int peopleLeft = waitingPeople;
        int maxCapacity = stateOfLift.length * maxPeople;
        boolean noSpice = false;
        int currentCapacity = 0;
        int sumPeople = 0;


        for (int i = 0; i <= stateOfLift.length - 1; i++) {
            int currentCountOfPeople = stateOfLift[i];
            sumPeople += currentCountOfPeople;
        }
        if (maxCapacity>sumPeople || waitingPeople >0){

            currentCapacity = maxCapacity - sumPeople;
            if (currentCapacity > 0 && peopleLeft > 0){
                for (int i = 0; i <= stateOfLift.length - 1 ; i++) {
                    int currentCountOfPeople = stateOfLift[i];

                    if (currentCountOfPeople <maxPeople){
                        int availableSpice = maxPeople - currentCountOfPeople;
                        if (peopleLeft < availableSpice){
                            stateOfLift[i] = peopleLeft;
                            peopleLeft-=peopleLeft;

                        }else{
                            peopleIn = availableSpice;
                            peopleLeft -= peopleIn;
                            stateOfLift[i]=peopleIn + currentCountOfPeople;
                        }
                        int value = stateOfLift[i];
                        currentCapacity-=value;
                    }
                    if (currentCapacity<=0){
                        noSpice=true;
                        break;
                    }
                    if (peopleLeft ==0){
                        break;
                    }

                }
            }
        }


        if (peopleLeft > 0 && currentCapacity <= 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleLeft);
            printWagon(stateOfLift);
        } else if (currentCapacity == 0 && peopleLeft == 0) {
            printWagon(stateOfLift);
        } else if (peopleLeft == 0 && currentCapacity > 0){
            System.out.println("The lift has empty spots!");
            printWagon(stateOfLift);

        }

    }

    public static void printWagon(int[] wagon) {
        for (int element : wagon) {
            System.out.print(element + " ");
        }
    }
}
