package chapter10;

public class Banana extends Fruit{
    public Banana(double calories) {
        setCalories(calories);
    }

    public void peel(){
        System.out.println("Banana is being peeled");
    }
    @Override
    public void makeJuice() {
        System.out.println("Making banana juice");
    }
}
