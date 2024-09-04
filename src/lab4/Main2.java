package lab4;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main2 {


    public static class Sorted {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};

            if (isSorted(array)) {
                System.out.println("OK");
            } else {
                System.out.println("Please, try again");
            }
        }
        public static boolean isSorted(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
            return true;
        }
    }
    public static class ArrayInput {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Array length: ");

            int length = scanner.nextInt();
            int[] array = new int[length];
            System.out.println("Numbers of array:");

            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.print("Result: [");
            for (int i = 0; i < length; i++) {
                System.out.print(array[i]);
                if (i < length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            scanner.close();
        }
    }
    public static class SwapArray {
        public static void main(String[] args) {
            int[] array = {5, 6, 7, 2};

            System.out.println("Array 1: " + Arrays.toString(array));

            swapEnds(array);

            System.out.println("Array 2: " + Arrays.toString(array));
        }

        public static void swapEnds(int[] array) {
            if (array.length > 1) {
                int temp = array[0];
                array[0] = array[array.length - 1];
                array[array.length - 1] = temp;
            }
        }
    }
    public static class FirstNumber {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 1, 2, 4};

            int result = firstUnique(array);

            if (result != -1) {
                System.out.println("Первое уникальное число: " + result);
            } else {
                System.out.println("Нет уникальных чисел в массиве.");
            }
        }

        public static int firstUnique(int[] array) {
            Map<Integer, Integer> countMap = new HashMap<>();

            for (int num : array) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            for (int num : array) {
                if (countMap.get(num) == 1) {
                    return num;
                }
            }

            return -1;
        }
    }
    public static class Merge {

        public static void main(String[] args) {
            int size = 7;

            int[] array = generateRandomArray(size);

            System.out.println("Неотсортированный массив: " + Arrays.toString(array));

            mergeSort(array, 0, array.length - 1);

            System.out.println("Отсортированный массив: " + Arrays.toString(array));
        }

        public static int[] generateRandomArray(int size) {
            Random random = new Random();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(100);
            }
            return array;
        }

        public static void mergeSort(int[] array, int left, int right) {
            if (left < right) {
                int middle = (left + right) / 2;

                mergeSort(array, left, middle);
                mergeSort(array, middle + 1, right);
                merge(array, left, middle, right);
            }
        }

        public static void merge(int[] array, int left, int middle, int right) {
            int n1 = middle - left + 1;
            int n2 = right - middle;

            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            System.arraycopy(array, left, leftArray, 0, n1);
            System.arraycopy(array, middle + 1, rightArray, 0, n2);

            int i = 0, j = 0;
            int k = left;
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    array[k] = leftArray[i];
                    i++;
                } else {
                    array[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                array[k] = leftArray[i];
                i++;
                k++;
            }
            while (j < n2) {
                array[k] = rightArray[j];
                j++;
                k++;
            }
        }
    }
}

