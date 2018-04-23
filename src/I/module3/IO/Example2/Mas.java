package I.module3.IO.Example2;


import java.io.RandomAccessFile;

public class Mas {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("t.txt", "rw");
//            raf.write(metod());
//            raf.seek(0);
//            byte result[] = new byte[10];
//            raf.read(result);
//            System.out.println(Arrays.toString(result));
//            raf.close();

            //   raf.writeInt(45465);
            // raf.writeUTF("\u265e\u262d\u2622\u2615\u26f3");
            raf.writeInt(1762);
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                System.out.println(raf.readInt());
            }
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// public static byte[] metod() {
//        Random random = new Random();
//        byte[] result = new byte[10];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = (byte) random.nextInt(100);
//
//        }
//        return result;
//    }

