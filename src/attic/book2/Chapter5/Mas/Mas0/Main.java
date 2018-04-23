package attic.book2.Chapter5.Mas.Mas0;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

     //   double mas[] = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};

        double mas[]=new double[10];
        double sum=0;
        for (int i = 0; i <mas.length ; i++) {
            mas[i]=(double)(Math.random()*10.1);
            sum+=mas[i];
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(sum/mas.length);
    }
}
