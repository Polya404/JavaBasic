package lesson12.additionally.task2;

public class Ship extends Vehicle {
    private int passengers;
    private String port;

    public Ship() {
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "passengers=" + passengers +
                ", port='" + port + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }

    public Ship(int passengers, String port) {
        this.passengers = passengers;
        this.port = port;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
