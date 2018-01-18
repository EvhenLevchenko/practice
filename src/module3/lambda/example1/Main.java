package module3.lambda.example1;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> integerPredicate = (numb) -> numb % 2 == 0;
        Predicate<Integer> integerPredicate1 = (numb) -> numb > 30;
        //System.out.println(integerPredicate.test(10));
        //System.out.println(integerPredicate.test(132));
        System.out.println(integerPredicate.and(integerPredicate1).test(10));
        System.out.println(integerPredicate.and(integerPredicate1).test(44));
//
//        Function<Integer, Integer> mult = num -> num * num;
//        System.out.println(mult.apply(10));

        Function<String, Integer> function = nam -> Integer.valueOf(nam);
        System.out.println(function.apply("133"));

        Function<Integer, String> mult = String::valueOf;
        System.out.println(mult.apply(20));

        Predicate<String> multi=String::isEmpty;
        System.out.println(multi.test(""));
    }
}
