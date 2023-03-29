package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double taxRate = 0.15;
    static double overageFee = 0.25;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]){
        double plan = getPlan();
        int overage = getOverage();
        scanner.close();
        double overageFeeSum = overageFeeSum(overageFee, overage);
        double tax = taxCount(plan, overageFeeSum, taxRate);
        double total = countTotal(tax, plan, overageFeeSum);
        System.out.println("Plan: " + plan);
        System.out.println("Overage: "+ overageFeeSum);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);
    }
    public static double getPlan(){
        System.out.println("Enter your plan fee");
        double plan = scanner.nextDouble();
        return plan;
    }
    public static int getOverage(){
        System.out.println("Enter your overage minutes");
        int overage = scanner.nextInt();
        return overage;
    }
    public static double overageFeeSum(double overageFee, int overage){
        double overageFeeSum = overageFee*overage;
        return overageFeeSum;
    }
    public static double taxCount(double plan, double overageFeeSum, double taxRate){
        double taxCount = (plan+overageFeeSum)*taxRate;
        return taxCount;
    }
    public static double countTotal(double tax, double plan, double overageFee){
        double total = tax+plan+overageFee;
        return total;
    }
  }
