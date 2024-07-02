package lab2;

public class Car {
    private String brand;
    private String model;
    private Integer seatPlace;

    public Car() {
    }

    public Car(String brand, String model, String seatPlace) {
        this.brand = brand;
        this.model = model;
        this.seatPlace = Integer.valueOf(seatPlace);
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




