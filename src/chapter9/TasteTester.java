package chapter9;

public class TasteTester {
    static Cake basicCake = new Cake();
    static BirthdayCake birthdayCake = new BirthdayCake();
    static WeddingCake weddingCake = new WeddingCake();
    public static void main(String args[]){
        setCakes();
        System.out.println("Your cake is "+basicCake.flavor + " flavor and will cost you " +basicCake.price);
        System.out.println("Your cake is "+birthdayCake.flavor + " flavor and will cost you " +birthdayCake.price + " because you ordered " + birthdayCake.candles + " candles");
        System.out.println("Your cake is "+weddingCake.flavor + " flavor and will cost you " +weddingCake.price + " because you ordered " + weddingCake.tiers + " tiers");
    }
    public static void setCakes(){
        basicCake.flavor = "vanilla";
        basicCake.price = 500;

        birthdayCake.flavor = "chocolate";
        birthdayCake.price = 600;
        birthdayCake.candles = 31;

        weddingCake.flavor = "pistachio";
        weddingCake.price = 1000;
        weddingCake.tiers = 3;
    }
}
