package module2.AbstractClassesAndInterfaces.Compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Start {
    private static ArrayList<Car> cars = new ArrayList();

    public static void main(String[] args) {

        Car car1 = new Car("BMW", 1978);
        Car car2 = new Car("NIVA", 2018);
        Car car3 = new Car("OPEL", 1654);
        Car car4 = new Car("Nissan", 1989);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Collections.sort(cars);
        print();
        System.out.println(cars.get(1).getName());


    }
    public static void print() {
        System.out.println();
        Iterator<Car> iterator=cars.iterator();
    }
}
