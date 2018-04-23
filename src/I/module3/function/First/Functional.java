package I.module3.function.First;


import java.util.ArrayList;
import java.util.stream.Stream;

public class Functional {
    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>();
        string.stream();

        Stream<String> stream1 = Stream.generate(() -> "10");
        Stream<String> stream2 = Stream.empty();//создаст пустой поток
        Stream<String> stream3 = Stream.of("10", "20", "30");//создаст поток из 3 елем
        Stream<String> stream4 = Stream.iterate("0", s -> s += "0");
        // stream4.limit(10).forEach(System.out::println);
        Stream<Double> stream5 = Stream.generate(Math::random);//генерирует случ числа
        //stream5.filter(x->x>0.5).limit(10).forEach(System.out::println);// больше 0,5 десять чисел
        stream5.filter(x -> x > 0.5)
                .limit(10)
                .map(String::valueOf)
                .map(s -> s.substring(0, 4))
                .forEach(System.out::println);
        Stream.iterate(1, x -> ++x).limit(9).forEach(x -> System.out.print(x + " "));
    }
}
