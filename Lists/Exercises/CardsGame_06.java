package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPersonCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPersonCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String winner = "";
        String firstPlayer = "First player";
        String secondPlayer = "Second player";
        int sum = 0;
        int currentCard1 = 0;
        int currentCard2 = 0;
        int biggerCard = 0;
        int currentIndex1 = 0;
        int currentIndex2 = 0;

        for (int i = 0; i < firstPersonCards.size(); i++) {
            currentCard1 = firstPersonCards.get(i);
            currentIndex1 = i;
            i--;
            for (int j = 0; j < secondPersonCards.size(); j++) {
                currentCard2 = secondPersonCards.get(j);
                currentIndex2 = j;
                if (currentCard1 > currentCard2) {
                    biggerCard = currentCard1;
                    firstPersonCards.remove(currentIndex1);
                    firstPersonCards.add(biggerCard);
                    firstPersonCards.add(currentCard2);
                    secondPersonCards.remove(currentIndex2);
                } else if (currentCard2 > currentCard1) {
                    biggerCard = currentCard2;
                    secondPersonCards.remove(currentIndex2);
                    secondPersonCards.add(biggerCard);
                    secondPersonCards.add(currentCard1);
                    firstPersonCards.remove(currentIndex1);
                } else if(currentCard1 == currentCard2){
                    firstPersonCards.remove(currentIndex1);
                    secondPersonCards.remove(currentIndex2);
                }
                break;
            }
            if (firstPersonCards.size() == 0) {
                winner = secondPlayer;
                for (int card2 = 0; card2 < secondPersonCards.size(); card2++) {
                    sum += secondPersonCards.get(card2);
                }
                break;
            } else if (secondPersonCards.size() == 0) {
                winner = firstPlayer;
                for (int card1 = 0; card1 < firstPersonCards.size(); card1++) {
                    sum += firstPersonCards.get(card1);
                }
                break;
            }
        }
        System.out.printf("%s wins! Sum: %d", winner, sum);
    }
}
