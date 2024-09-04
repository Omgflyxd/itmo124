package lab6;

public class Run2 {
    public static void main(String[] args) {
        Inheritor2 Object = new Inheritor2();
        Object.getAge();
        int age = Object.getAgeNumber();
        System.out.println("Возраст пользователя: " + age);

        Age.scanner.close();
    }
}
