package I.module3.lambda.example0;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<String> predicate = (s) -> s.length() ==1 ;
        Predicate<String>start=(s)->s.startsWith("A");
        System.out.println(predicate.or(start).test("o"));
       // System.out.println(predicate.and(start).test("o"));
      //  System.out.println(predicate.test(""));
       // System.out.println(predicate.negate().test(""));

    }
}
