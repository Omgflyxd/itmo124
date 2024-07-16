package lab3;
import java.time.Year;
public class House {
    public int floors;
    public int year;
    public String name;

    public void setValues(int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }
    public void printHouse() {
        System.out.println("Наименование " + name);
        System.out.println("Количество этажей " + floors);
        System.out.println("Год постройки " + year);
    }
    public int getYears() {
        int currentYear = Year.now().getValue();
        return currentYear - year;
    }
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();
        house1.setValues(9, 1970, "Панельный");
        house2.setValues(5, 1960, "Кирпичный");

        System.out.println("Первый дом");
        house1.printHouse();
        System.out.println("Количество лет с момента постройки " + house1.getYears());

        System.out.println("Второй дом");
        house2.printHouse();
        System.out.println("Количество лет с момента постройки " + house2.getYears());
    }
}
