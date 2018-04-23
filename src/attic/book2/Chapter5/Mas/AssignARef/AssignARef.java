package attic.book2.Chapter5.Mas.AssignARef;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AssignARef {
    public static void main(String[] args) {
        int i;

        int nums1[]=new int[8];
        int nums2[]=new int[8];

        for ( i = 0; i <8 ; i++)
            nums1[i]=i;

        for ( i = 0; i <8 ; i++)
            nums2[i]=-i;

        System.out.print("Массив nums1:");
        System.out.println(Arrays.toString(nums1));

        System.out.print("Массив nums2:");
        System.out.println(Arrays.toString(nums2));

        nums1=nums2;
        System.out.print("Массив nums1 после присвоения :");
        System.out.println(Arrays.toString(nums1));

        nums2[3]=100;
        System.out.print("Массив nums2 :");
        System.out.println(Arrays.toString(nums1));

    }
}
