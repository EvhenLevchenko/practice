package module3.IO.Example1;

import java.io.RandomAccessFile;
import java.util.Arrays;

public class Raf {
    public static void main(String[] args) {
        RandomAccessFile raf = null;//обьявили обьект нашего будущего файла

        try {
            raf = new RandomAccessFile("t.txt", "rw");
            byte data[] = new byte[]{1, 2};
            raf.write(data);
            raf.seek(0);
            byte result[] = new byte[2];
            raf.read(result);
            System.out.println(Arrays.toString(result));
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
