package ObjectsAndClasses.Lab;

import java.util.Scanner;

public class DemoDice {
    public static class Dice{
        private int sides;
        public int getSides(){
            return this.sides;
        }
        public void setSides (int sides){
            this.sides = sides;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dice dice = new Dice();
        dice.setSides(4);

        System.out.println(dice.getSides());

    }
}
