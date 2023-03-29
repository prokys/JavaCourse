package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String args[]){

        int numberOfStudents = 24;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<numberOfStudents; i++){
            double total = 0;
            for(int j=0; j<numberOfTests; j++){
                System.out.println("Enter score for Test number" +(j+1));
                double score = scanner.nextDouble();
                total = total+score;
            }
            double average = total/numberOfTests;
            System.out.println("Test average for student # " + (i+1) + " is " + average);
        }
    }
}
