package chapter10;

public class Market {
    public static void main(String args[]){
        Apple greenApple = new Apple(100);
        greenApple.makeJuice();
        greenApple.removeSeeds();

        Banana unripeBanana = new Banana(150);
        unripeBanana.makeJuice();
        unripeBanana.peel();

        Fruit redApple = new Apple(120);
        redApple.makeJuice();
        ((Apple)redApple).removeSeeds();
        redApple = new Banana(130);
        redApple.makeJuice();
        ((Banana)redApple).peel();

    }
}
