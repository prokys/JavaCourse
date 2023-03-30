package chapter10;

public class Apple extends Fruit{
    public Apple(double calories) {
        setCalories(calories);
    }

    public void removeSeeds(){
        System.out.println("Seeds are removed");
    }
    @Override
    public void makeJuice() {
        System.out.println("Apple juice is being made");
    }
}
