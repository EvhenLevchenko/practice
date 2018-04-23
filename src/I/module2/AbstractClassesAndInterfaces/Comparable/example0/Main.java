package I.module2.AbstractClassesAndInterfaces.Comparable.example0;

import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car(100, 4, "BMW");
        cars[1] = new Car(2000, 0, "LANOS");
        cars[2] = new Car(150, 2, "ASTRA");


        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();


        System.out.println();
        Arrays.sort(cars, new CarMaxSpeedComparator());
        for (Car car : cars) {
            System.out.println(car);
        }


        System.out.println();
        Arrays.sort(cars, new CarNameComparator());
        for (Car car : cars) {
            System.out.println(car);
        }


        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getAge() > o2.getAge()) return 1;
                if (o1.getAge() < o2.getAge()) return -1;
                return 0;
            }
        });

        System.out.println();
        for (Car car : cars) {
            System.out.println(car);
        }

    }
}
