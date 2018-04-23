package C.module1.Arrays.example2;

public class MAin {
    public static void main(String[] args) {

        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int min = m[0];
        int max = m[0];
        int sum = 0;

        for (int num : m) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }double sr = (double) sum / m.length;

        System.out.println(min);
        System.out.println(max);
        System.out.println(sr);


    }
}
