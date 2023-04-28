package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> pieceComposer = new LinkedHashMap<>();
        LinkedHashMap<String, String> pieceKey = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String[] pieceData = scanner.nextLine().split("\\|");
            String pieceName = pieceData[0];
            String composer = pieceData[1];
            String key = pieceData[2];
            pieceComposer.put(pieceName, composer);
            pieceKey.put(pieceName, key);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] commandParts = input.split("\\|");
            String command = commandParts[0];
            String pieceName = commandParts[1];
            switch (command) {
                case "Add":
                    String composer = commandParts[2];
                    String key = commandParts[3];
                    if (pieceComposer.containsKey(pieceName)) {
                        System.out.printf("%s is already in the collection!%n", pieceName);
                    } else {
                        pieceComposer.put(pieceName, composer);
                        pieceKey.put(pieceName, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", pieceName, composer, key);
                        //"{piece} by {composer} in {key} added to the collection!"
                    }
                    break;
                case "Remove":
                    if (!pieceComposer.containsKey(pieceName)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                    }else{
                        pieceComposer.remove(pieceName);
                        pieceKey.remove(pieceName);
                        System.out.printf("Successfully removed %s!%n", pieceName);
                    }
                    break;
                case "ChangeKey":
                    String newKey = commandParts[2];
                    if (!pieceKey.containsKey(pieceName)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                    }else{
                        pieceKey.put(pieceName, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", pieceName, newKey);
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        //"{Piece} -> Composer: {composer}, Key: {key}"
        pieceComposer.entrySet().forEach(entry->{
            String name = entry.getKey();
            System.out.println(name + " -> Composer: " + entry.getValue() + ", Key: " + pieceKey.get(name));
        });
    }
}
