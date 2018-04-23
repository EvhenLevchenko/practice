package attic.book2.Chapter5.Mas.MasMaxEle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] mas = new int[12];
        int min, max;
        min=max=mas[0];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20)-10;
            if (mas[i] < min) min = mas[i];
            if (mas[i] > max) max = mas[i];

        }
        System.out.println(Arrays.toString(mas));
        System.out.println(min+" "+max);
    }

}

