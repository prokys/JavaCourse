package chapter6;

import java.util.Scanner;

public class PhoneBillCalculator {
    Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        PhoneBillCalculator calculator = new PhoneBillCalculator();
        PhoneBill phoneBill = calculator.getPhoneBill();
        phoneBill.printItemizedBill();
    }
    public PhoneBill getPhoneBill(){
        System.out.println("Enter id");
        int id = scanner.nextInt();

        System.out.println("Enter your base cost");
        double cost = scanner.nextDouble();

        System.out.println("Enter your allotted minutes");
        double allottedMinutes = scanner.nextDouble();

        System.out.println("Enter your minutes used");
        double minutesUsed = scanner.nextDouble();

        return new PhoneBill(id, cost, allottedMinutes, minutesUsed);
    }
}
