package labwork14.labwork144;

import java.util.Random;

public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array.clone();
    }

    public T[]shuffle(){
        Random random=new Random();
        for (int i = 0; i < 10*array.length; i++) {
            T temp;
            int index0=random.nextInt(array.length);
            int index1=random.nextInt(array.length);
            temp=array[index0];
            array[index0]=array[index1];
            array[index1]=temp;
        }
        return array;
    }
}
