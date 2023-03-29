package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[]){

        boolean again = false;
        Scanner scanner = new Scanner(System.in);

        do{

            System.out.println("Enter first number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number");
            double num2 = scanner.nextDouble();

            double sum = num1+num2;
            System.out.println("The sum is " + sum);

            System.out.println("Do you wana go again?" );
            again = scanner.hasNextBoolean();

        }while (again);
            scanner.close();

    }
}
