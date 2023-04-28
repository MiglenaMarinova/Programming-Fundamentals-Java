package ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] stateOfLift = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int maxCapacity = stateOfLift.length * 4;
        int sumPeople = 0;
        boolean isFull = false;
        boolean noMorePeople = false;
        int peopleGetOn = 0;

        for (int i = 0; i < stateOfLift.length; i++) {
            int currentPeopleInside = stateOfLift[i];
            maxCapacity -= currentPeopleInside;
        }
        if (maxCapacity > 0) {
            for (int i = 0; i < stateOfLift.length; i++) {
                int emptySpace = 4 - stateOfLift[i];
                if (emptySpace == 0){
                    i = stateOfLift[i] + 1;
                }else if (emptySpace < waitingPeople) {
                    peopleGetOn = emptySpace;
                    waitingPeople -= peopleGetOn;
                    maxCapacity -= peopleGetOn;

                }else {

                    peopleGetOn = waitingPeople;
                    waitingPeople -= peopleGetOn;
                }
                stateOfLift[i] += peopleGetOn;
                if (waitingPeople <= 0) {
                    noMorePeople = true;
                }else if (maxCapacity <= 0){
                    isFull = true;
                }
            }
        } else {
            isFull = true;
        }

        if (noMorePeople) {
            System.out.println("The lift has empty spots!");
            for (int wagon : stateOfLift) {
                System.out.print(wagon + " ");
            }
        }else if(isFull){
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
           for (int wagon : stateOfLift){
              System.out.print(wagon + " ");
         }
        }
    }
}

//System.out.printf("There isn't enough space! %d people in a queue!", waitingPeople);
//            for (int wagon : stateOfLift){
//                System.out.print(wagon + " ");
//            }