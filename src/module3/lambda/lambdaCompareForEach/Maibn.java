package module3.lambda.lambdaCompareForEach;


import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class Maibn {

    public static void main(String[] args) {
        String[] arr = new String[]{"ef", "asd", "qaw"};
        List<String> list = Arrays.asList(arr);

        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(s -> System.out.println(s));
        // System.out.println(list);
        MyI myI = a -> System.out.println(a);
        myI.someMethod(3);

        VoidI voidI = () -> {
            System.out.print("Hello");
            System.out.println(" world");
        };
        voidI.vm();
        InAndRet inAndRet = (a,b) -> a + b+1546+a;

        RetI retI = () -> 1029;
        System.out.print(retI.get());
    }
}
