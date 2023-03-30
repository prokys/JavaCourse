package chapter11;

public class Duck extends Animal{
    @Override
    void makeSound() {
        System.out.println("quack quack");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
