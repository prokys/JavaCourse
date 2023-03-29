package chapter3;

import java.util.Scanner;

public class MoneyGame {
    public static void main(String args[]){
        int cilovaCastka = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej počet korun");
        int koruny = scanner.nextInt();
        System.out.println("Zadej počet dvoukorun");
        int dvoukoruny = scanner.nextInt();
        System.out.println("Zadej počet pětikorun");
        int petikoruny = scanner.nextInt();
        System.out.println("Zadej počet desetikorun");
        int desetikoruny = scanner.nextInt();
        int penize = koruny+2*dvoukoruny+5*petikoruny+10*desetikoruny;

        if(cilovaCastka == penize){
            System.out.println("Gratuluju, trefil jste přesně 100 Kč");
        } else if (cilovaCastka>penize) {
            System.out.println("To je malo, chybí tí " + (cilovaCastka-penize) + "Kč do 100");
        }else {
            System.out.println("To je moc, přestřelil si o " + (penize-cilovaCastka) + "Kč do 100");
        }


    }
}
