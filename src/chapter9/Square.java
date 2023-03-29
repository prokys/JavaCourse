package chapter9;

public class Square extends Rectangle{
    @Override
    public double calculatePerimeter() {
        return sides*width;
    }
    public void print(String what){
        System.out.println("I am " +what);
    }
}
