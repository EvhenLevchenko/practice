package C.module1.Arrays.example0;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int mas[]=new int[30];
        for (int i = 0; i <mas.length ; i++) {
            mas[i]=(i+1)*2;
        }
        System.out.println(Arrays.toString(mas));
    }
}
