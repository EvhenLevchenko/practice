package module2.Methods.constr.example2;


import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.findMax(4, 6));
        System.out.println(Main.findMin(7, 2));

        int[] array = new int[]{6, 5, 8, 4, 7};
        System.out.println(Main.findMax(array));
        System.out.println(Main.findMin(array));

    }

    public static int findMax(int a, int b) {
        return a >= b ? a : b;
    }

    public static int findMin(int a, int b) {
        return a <= b ? a : b;
    }

    public static int findMax(int[] array) {
        int result = array[0];
        for (int number : array) {
            if (result < number) {
                result = number;
            }
        }
        return result;
    }

    public static int findMin(int[] array) {
        int result = array[0];
        for (int number : array) {
            if (result > number) {
                result = number;
            }
        }
        return result;
    }
}
