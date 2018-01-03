package module2.ClassAndInstances.Car;


import java.util.Arrays;

class Test{
    public void test1(int x){
        x=123;

    }
    public void test2(int[] adress){
        adress[1]=123;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Test test=new Test();

        int x=1;

        test.test1(x);
        System.out.println(x);


        int[] array={1,2,3,4,5};
        test.test2(array);
        System.out.println(Arrays.toString(array));
    }
}
