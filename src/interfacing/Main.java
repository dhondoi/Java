package interfacing;

public class Main {

    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTire());
        System.out.println(car.isMaintenance());
    }
}
