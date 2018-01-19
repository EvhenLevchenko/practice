package module3.lambda.Predicate;

import module3.lambda.Predicate.Person;
import module3.lambda.Predicate.PersonFactory;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() == 1;
        Predicate<String> start = (s) -> s.startsWith("A");
//or вернет true Только в том случае если соблюдается одно из условий
        System.out.println(predicate.or(start).test("Ao"));


        Predicate<Integer> predicate1 = (sd) -> sd % 2 == 0;
        System.out.println(predicate1.test(5));

        Function<Integer, Integer> mult = num -> num * num;
        System.out.println(mult.apply(2));

        Function<String, Integer> mul = num -> Integer.valueOf(num);
        System.out.println(mul.apply("133"));


        Function<Integer, String> mu = String::valueOf;
        System.out.println(mu.apply(2));


        Supplier<Person> supplier = Person::new;
        supplier.get();

        PersonFactory personFactory = Person::new;
        Person p = personFactory.p("nmbn", "nbm");
        System.out.println(p);

    }
}
