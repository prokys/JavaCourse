package chapter14;

import java.util.Random;

public class Coin {
    private String side;
    public static final String HEADS = "heads";
    public static final String TAILS = "tails";
    public static String coinFlip(){
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if (randomNumber<1){
            return HEADS;
        }else {
            return TAILS;
        }
    }
    public String getSide() {
        return side;
    }
    public void setSide(String side) {
        this.side = side;
    }
}
