package chapter11;

public class Farm {
    public static void main(String args[]){
        Pig pig = new Pig();
        Duck duck = new Duck();

        pig.eat();
        pig.makeSound();

        duck.eat();
        duck.makeSound();
    }
}
