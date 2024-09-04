package lab6;
import java.util.Scanner;

public class Age {
    private int age;
    protected static Scanner scanner = new Scanner(System.in);
    public void getAge() {
        System.out.print("Введите ваш возраст: ");
        age = scanner.nextInt();
        scanner.nextLine();
    }
    public int getAgeNumber() {
        return age;
    }
}