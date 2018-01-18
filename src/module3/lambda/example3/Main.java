package module3.lambda.example3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        Supplier<Person> supplier = Person::new;
        supplier.get();

        List<Person> list = new ArrayList<>();
        list.add(new Person("lol",5));
//        list.add(11, "Alex");
//        list.add(22, "Kim");
//        list.add(33, "Bob");


         list.stream()
                .filter(s -> s.getAge() >= 30)
                .map(s -> s.getFirstName().toLowerCase())
                .forEach(System.out::println);

//возраст больше 30 перевести имя в ловер
//        PersonFactory personFactory = Person::new;
//        Person p = personFactory.p("fn", "ln");
//
//        System.out.println(p);

//        Consumer<Person> consumer = pers -> System.out.println(p.getFirstName());
//        consumer.accept(p);

//
//        Optional<Person> optional = Optional.of(p);
//        System.out.println(optional.isPresent());
//        System.out.println(optional.get());

    }
}
