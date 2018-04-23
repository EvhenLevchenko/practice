package I.module2.polimorfizm.example1;

public class Main {
    public static void main(String[] args) {
        Car sportCar = new SportCar();
        Car truck = new Truck();

        Car[] cars = new Car[2];
        cars[0] = new SportCar();
        cars[1] = new Truck();
        for (int i = 0; i < cars.length; i++) {
            cars[i].show();
        }
    }
}
