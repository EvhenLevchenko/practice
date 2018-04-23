package attic.book2.Chapter5.Mas.Bubble;

import java.util.Arrays;

class Bubble {
    public static void main(String args[]) {
//        int nums[] = {99, -10, 100123, 18, -978,
//                5623, 463, -9, 287, 49};
//        int a, b, t;
//        int size;
//
//        size = 10; // number of elements to sort
//
//        // Отобразить исходный массив
//        System.out.print("Original array is:");
//        for (int i = 0; i < size; i++)
//            System.out.print(" " + nums[i]);
//        System.out.println();
//
//// Реализовать алгоритм пузырьковой сортировки
//        for (a = 1; a < size; a++)
//            for (b = size - 1; b >= a; b--) {
//                if (nums[b - 1] > nums[b]) { // if out of order
//                    // exchange elements
//                    t = nums[b - 1];
//                    nums[b - 1] = nums[b];
//                    nums[b] = t;
//                }
//            }
//
//        // display sorted array
//        System.out.print("Sorted array is:");
//        for (int i = 0; i < size; i++)
//            System.out.print(" " + nums[i]);
//        System.out.println();
        int mas[] = new int[15];
        int a, b, c, size = 15;

        for (int i = 0; i < size; i++) {
            mas[i] = (int) (Math.random() * 100) - 50;
        }
        System.out.println("Исходный массив" + Arrays.toString(mas));

        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (mas[b - 1] > mas[b]) {
                    c = mas[b - 1];
                    mas[b - 1] = mas[b];
                    mas[b] = c;
                }
            }
        System.out.println("Сортирований массив" + Arrays.toString(mas));
    }
}