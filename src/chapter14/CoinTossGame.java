package chapter14;

import java.util.Scanner;

public class CoinTossGame {
    static Scanner scanner = new Scanner(System.in);
    static Player player1 = new Player();
    static Player player2 = new Player();
    public static void main(String args[]){
        getNames();
        settingHeadsOrTails();
        findWinner();
    }
    public static void findWinner(){
        String result = Coin.coinFlip();
        System.out.println("Coin landed on " + result + " side.");
        if (result.equals(player1.getGuess())){
            System.out.println("Player " + player1.getName()+" is winner! Congrats!");
        }else {
            System.out.println("Player " + player2.getName()+" is winner! Congrats!");
        }
    }
    public static void getNames(){
        System.out.println("Enter name of first player");
        player1.setName(scanner.next());
        System.out.println("Enter name of second player");
        player2.setName(scanner.next());
        System.out.println("Welcome " +player1.getName() + " and "+player2.getName()+ "." );
    }
    public static void settingHeadsOrTails(){
        do {
            player1.setGuess(pickSide());
        }while (!Coin.TAILS.equals(player1.getGuess()) && !Coin.HEADS.equals(player1.getGuess()));
        player2.setGuess(getSide(player1.getGuess()));
    }
    public static String pickSide(){
        System.out.println("First player can pick his side. Heads or tails");
        return scanner.next();
        }
    public static String getSide(String side){
        if (Coin.HEADS.equals(side)){
            return Coin.TAILS;
        }else if (Coin.TAILS.equals(side)) {
            return Coin.HEADS;
        }else {
            return "fail";
        }
    }
}
