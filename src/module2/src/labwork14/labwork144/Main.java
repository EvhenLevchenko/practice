package labwork14.labwork144;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] strings = {"nine", "one", "two", "three", "four", "five", "six", "seven", "eight"};

        MyMixer<Integer> integerMyMixer=new MyMixer<>(integers);
        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(integerMyMixer.shuffle()));


        MyMixer<String> stringMyMixer=new MyMixer<>(strings);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(stringMyMixer.shuffle()));

    }
}
