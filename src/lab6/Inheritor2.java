package lab6;

public class Inheritor2 extends Age {
    @Override
    public void getAge() {
        super.getAge();
        System.out.print("Введите ваше имя: ");
        String name = Age.scanner.nextLine();
        System.out.println("Имя пользователя: " + name);
    }
}
