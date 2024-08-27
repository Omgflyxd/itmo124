package lab2;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Сумма double: " + calc.sum(1.1, 2.2));
        System.out.println("Сумма long: " + calc.sum(1L, 2L));
        System.out.println("Сумма int " + calc.sum(1, 2));

        System.out.println("Деление double: " + calc.divide(5.1, 2.2));
        System.out.println("Деление long: " + calc.divide(6L, 2L));
        System.out.println("Деление int " + calc.divide(6, 2));

        System.out.println("Умножение double: " + calc.multiply(1.0, 3.0));
        System.out.println("Умножение long: " + calc.multiply(1L, 3L));
        System.out.println("Умножение int: " + calc.multiply(1, 3));

        System.out.println("Вычитание double: " + calc.subtract(3.0, 1.0));
        System.out.println("Вычитание long: " + calc.subtract(3L, 1L));
        System.out.println("Вычитание int: " + calc.subtract(3, 1));

        Car car = new Car("Toyota","Crown","5");
        Car carDefault = new Car();
        System.out.println(car);
        System.out.println(carDefault);

        Car.setBrand("Toyota");
        Car.setModel("Crown");
        Car.setSeatPlace(5);

        String brand = Car.getBrand();
        String model = Car.getModel();
        int seatPlace = Car.getSeatPlace();

        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Seat Place: " + seatPlace);

    }
}
