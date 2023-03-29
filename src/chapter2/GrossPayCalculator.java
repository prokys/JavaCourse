package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        System.out.println("Enter the nuber of hour the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Enther the employee's pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        double grossPay = hours * rate;

        System.out.println("Employees gross income is : " + grossPay);

    }
}
