package lab1;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        int x = (46 + 10) * (10 / 3);
        System.out.println(x);
        int y = (29) * (4) * (-15);
        System.out.println(y);

        int number = 10500;
        int result = (number / 10) / 10;
        System.out.println(result);

        double a = 3.6;
        double n = 4.1;
        double c = 5.9;
        double result1 = a * n * c;
        System.out.println(result1);


        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println(num);
        }
        scanner.close();

        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();

        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }

        scanner.close();
    }


}



