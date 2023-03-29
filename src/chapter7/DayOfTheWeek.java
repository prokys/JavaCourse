package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    public static String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public static Scanner scanner = new Scanner(System.in);
    public static int number;
    public static void main(String args[]){
        System.out.println("Enter number");
        number = scanner.nextInt();
        scanner.close();

        returnMonth();
    }
    public static void returnMonth(){
        if(number>1 && number<8){
            System.out.println(days[number-1]);
        }else {
            System.out.println("Enter number between 1 and 7");
        }

    }
}
