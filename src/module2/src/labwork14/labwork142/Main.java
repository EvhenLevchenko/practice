package labwork14.labwork142;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
        final int INTEGER_MAX = 8;
        System.out.println("Integer values:"+ Arrays.toString(integers));
        System.out.printf("Number of elements that are  greater than% d:%n",INTEGER_MAX);
        System.out.println(MyTestMethod.calculateNumber(integers,INTEGER_MAX));







        Double[] doubles = {1.8, 2.2, 3.2, 4.2, 5.2, 6.2, 7.2, 8.2, 9.2, 10.2};
        final double DOUBLE_MAX = 2.2;
        System.out.println("Double values:"+ Arrays.toString(doubles));
        System.out.printf("Number of elements that are  greater than %d:%n",DOUBLE_MAX);
        System.out.println(MyTestMethod.calculateNumber(doubles,DOUBLE_MAX));
    }
}
