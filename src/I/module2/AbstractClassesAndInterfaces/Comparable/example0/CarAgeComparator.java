package I.module2.AbstractClassesAndInterfaces.Comparable.example0;

import java.util.Comparator;

class CarAgeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Car car1 = (Car) o1;
        Car car2 = (Car) o2;

        if (car1.getAge() > car2.getAge()) return 1;
        if (car1.getAge() < car2.getAge()) return -1;
        return 0;

    }
}
