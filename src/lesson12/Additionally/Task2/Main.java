package lesson12.Additionally.Task2;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(1200, 180);
        plane.setPrice(98000);
        plane.setSpeed(20000);
        plane.setX(23);
        plane.setY(59);
        plane.setYear(1990);
        System.out.println(plane);
        Car car = new Car();
        car.setX(42);
        car.setY(23);
        car.setPrice(6700);
        car.setSpeed(300);
        car.setYear(2004);
        System.out.println(car);
        Ship ship = new Ship(200, "Hawaii");
        ship.setX(203);
        ship.setY(102);
        ship.setPrice(60000);
        ship.setSpeed(260);
        ship.setYear(2014);
        System.out.println(ship);
    }
}
