package lab4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int a = 1; a <= 99; a += 2) {
            System.out.println(a);


                }
            }
        }
class lab {
    public static void main(String[] args) {
        StringBuilder lab3 = new StringBuilder("Делится на 3: ");
        StringBuilder lab5 = new StringBuilder("Делится на 5: ");
        StringBuilder lab3and5 = new StringBuilder("Делится на 3 и на 5: ");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                lab3.append(i).append(" ");
            }
            if (i % 5 == 0) {
                lab5.append(i).append(" ");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                lab3and5.append(i).append(" ");
            }
        }
        
        System.out.println(lab3.toString().trim());
        System.out.println(lab5.toString().trim());
        System.out.println(lab3and5.toString().trim());
    }


    public static class Numbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();

            System.out.print("Введите третье число: ");
            int thirdNumber = scanner.nextInt();

            boolean result = secondNumber > firstNumber && thirdNumber > secondNumber;

            System.out.println("Результат: " + result);

            scanner.close();
        }
    }
    public static class ArrayCheck {
        public static void main(String[] args) {
            int[] array = {3, -3, 7, 4, 5, 4, 3};

            boolean result = countThree(array);

            System.out.println("array = " + arrayToString(array));
            System.out.println(result);
        }

        public static boolean countThree(int[] array) {
            if (array.length >= 2) {
                return array[0] == 3 || array[array.length - 1] == 3;
            }
            return false;
        }

        public static String arrayToString(int[] array) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                if (i > 0) sb.append(", ");
                sb.append(array[i]);
            }
            return sb.toString();
        }
    }
    public static class NumberCheck {
        public static void main(String[] args) {
            int[] array = {2, 4, 5, 1, 7};

            boolean result = oneOrThree(array);

            System.out.println("Массив содержит 1 или 3: " + result);
        }

        public static boolean oneOrThree(int[] array) {
            for (int num : array) {
                if (num == 1 || num == 3) {
                    return true;
                }
            }
            return false;
        }
    }
}
