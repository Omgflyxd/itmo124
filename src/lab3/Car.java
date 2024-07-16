package lab3;

public class Car {

    private String color;
    private String name;
    private double weight;

    public Car() {
        this.color = "Отсутствует";
        this.name = "Отсутствует";
        this.weight = 0.0;
    }

    public Car(String color) {
        this.color = color;
        this.name = "Отсутствует";
        this.weight = 0.0;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.name = "Отсутствует";
        this.weight = weight;
    }

    public Car(String color, String name, double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public void printCar() {
        System.out.println("Цвет " + color);
        System.out.println("Название " + name);
        System.out.println("Вес " + weight);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Черный", "Toyota", 1350.0);
        Car car2 = new Car("Белый", 1400.1);

        car1.printCar();
        System.out.println();
        car2.printCar();
    }
}