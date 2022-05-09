package lesson11.task2;

public class Main {
    public static void main(String[] args) {
        Car opel = new Car();
        Car honda = new Car(2003);
        Car daewoo = new Car(2003, 200);
        Car dodge = new Car(1998, 290, 30000);
        Car fiat = new Car(2005, 220, 40000, "Blue");
    }
}
