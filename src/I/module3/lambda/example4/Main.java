package I.module3.lambda.example4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        Supplier<Car> supplier = Car::new;


        CarFactory<Car> personFactory = Car::new;
        Car car = personFactory.odj(2015, 300.0);
        System.out.println(car);

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("yyy");
        list.add("ddd");
        list.add("bbb");
        list.add("aaa3");

    }
}
