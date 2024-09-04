package lab6;

public class Inheritor extends Main1 {

    public Inheritor(int number) {
        super(number);
    }
    public void printNumber() {
        System.out.println("Number: " + getNumber());
    }
}
