package Methods.Lab;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    printReceipt();

    }
    public static void printReceipt(){
       printHeader();
       printBody();
       printFooter();
    }
    public static void printHeader(){
        System.out.println("------------");
    }
    public static void printBody(){
        System.out.println("Java is very fun!");
    }
    public static void printFooter(){
        System.out.println("***************");
    }


}
