package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){
        System.out.println("Tell me your favorite season of the year.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Now your lucky number please.");
        int number = scanner.nextInt();

        System.out.println("And some nice adjective.");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
