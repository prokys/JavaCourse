package chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String args[]){
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();
        scanner.close();

        if(salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congrats you qualify for the loan");
        }
        else {
            System.out.println("Sorry your salary have to be at least " + requiredSalary + " to qualify. Or you need to work for at least " + requiredYearsEmployed + " years");
        }
    }
}
