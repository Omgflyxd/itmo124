package lab6;

public class Main {
    abstract static class Person {
        protected String firstName;
        protected String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public abstract void displayInfo();
    }

    static class Client extends Person {
        private final String bankName;

        public Client(String firstName, String lastName, String bankName) {
            super(firstName, lastName);
            this.bankName = bankName;
        }

        @Override
        public void displayInfo() {
            System.out.println("Клиент: " + firstName + " " + lastName + ", Банк: " + bankName);
        }
    }

    static class BankEmployee extends Person {
        private final String bankName;

        public BankEmployee(String firstName, String lastName, String bankName) {
            super(firstName, lastName);
            this.bankName = bankName;
        }

        @Override
        public void displayInfo() {
            System.out.println("Работник банка: " + firstName + " " + lastName + ", Банк: " + bankName);
        }
    }

    public static class Main1 {
        public static void main(String[] args) {
            Client client = new Client("А", "В", "Банк 1");
            BankEmployee bankEmployee = new BankEmployee("А", "Б", "Банк 2");

            client.displayInfo();
            bankEmployee.displayInfo();
        }
    }
    public static class Car {
        public int weight;
        public String model;
        public char color;
        public float speed;

        public void outPut() {
            System.out.println("Вес " + model + " составляет " + weight + " кг.");
            System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        }

        public Car(int w, String m, char c, float s) {
            weight = w;
            model = m;
            color = c;
            speed = s;
        }

        public Car() {}
    }

    static class Truck extends Car {
        private int numberOfWheels;
        private final int maxWeight;

        public Truck(int w, String m, char c, float s, int numberOfWheels, int maxWeight) {
            super(w, m, c, s);
            this.numberOfWheels = numberOfWheels;
            this.maxWeight = maxWeight;
        }

        public void newWheels(int newNumberOfWheels) {
            this.numberOfWheels = newNumberOfWheels;
            System.out.println("Новое количество колес: " + this.numberOfWheels);
        }

        @Override
        public void outPut() {
            super.outPut();
            System.out.println("Количество колес: " + numberOfWheels);
            System.out.println("Максимальный вес: " + maxWeight + " кг.");
        }
    }
    
    public static class Main2 {
        public static void main(String[] args) {
            Truck truck = new Truck(4444, "Ford", 'B', 120.5f, 8, 20000);
            truck.outPut();
            truck.newWheels(10);
        }
    }
}

