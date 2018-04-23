package I.module2.AbstractClassesAndInterfaces.Comparable.example0;


import java.util.Comparator;

class CarNameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Car car1 = (Car) o1;
        Car car2 = (Car) o2;

        return car1.getName().compareTo(car2.getName());
    }
}
