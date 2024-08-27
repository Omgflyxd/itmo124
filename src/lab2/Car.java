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
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getSeatPlace() {
        return seatPlace;
    }
    public void setSeatPlace(int seatPlace) {
        this.seatPlace = seatPlace;
    }
}




