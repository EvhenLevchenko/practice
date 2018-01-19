package module3.Seri;

import java.awt.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Car car = new Car(1, "bfd", 5, 200, new Skoda("bfdb", 5),4);
        FileOutputStream fis = new FileOutputStream("s.txt");
        try {
            ObjectOutputStream o = new ObjectOutputStream(fis);
            o.writeObject(car);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        readObject();
    }

//        Car.Skoda skoda=new Car.Skoda("fdb",1900);
//        FileOutputStream fis=new FileOutputStream("s.txt");
//        ObjectOutputStream o=new ObjectOutputStream(fis);
//        o.writeObject(skoda);
//
//        System.out.println();
//
//        readObjec();
//    }
//        Student student = new Student("Bob", "Pi", 32);
//
//        FileOutputStream fis = new FileOutputStream("s.txt");
//        try { ObjectOutputStream oos = new ObjectOutputStream(fis)){
//                oos.writeObject(student);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        private static void readObject () throws FileNotFoundException {
            Car car1;
            FileInputStream fis = new FileInputStream("s.txt");
            try (ObjectInputStream oos = new ObjectInputStream(fis)) {
                car1 = (Car) oos.readObject();
                System.out.println(car1);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }


    }
