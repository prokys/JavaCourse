package chapter11;

import javax.sound.midi.SysexMessage;

public class Pig extends Animal{
    @Override
    void makeSound() {
        System.out.println("Oink oink");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
