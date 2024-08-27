package lab2;

public class Car {
    private static String brand;
    private static String model;
    private static Integer seatPlace;

    public Car() {
    }

    public Car(String brand, String model, String seatPlace) {
        Car.brand = brand;
        Car.model = model;
        Car.seatPlace = Integer.valueOf(seatPlace);
    }
    public static String getBrand() {
        return brand;
    }
    public static void setBrand(String brand) {
        Car.brand = brand;
    }
    public static String getModel() {
        return model;
    }
    public static void setModel(String model) {
        Car.model = model;
    }
    public static int getSeatPlace() {
        return seatPlace;
    }
    public static void setSeatPlace(int seatPlace) {
        Car.seatPlace = seatPlace;
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", seatPlace=" + seatPlace +
                '}';
    }

}




