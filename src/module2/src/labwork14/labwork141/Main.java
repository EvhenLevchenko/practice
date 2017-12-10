package labwork14.labwork141;

public class Main {
    public static void main(String[] args) {

        MyTuple<String, Integer, Long> myTuple1 = new MyTuple<>("Buzma", 9, 4578789L);
        MyTuple<Double, String, String> myTuple2 = new MyTuple<>(2.45646, "Buzma", "Buzma daughter");

        System.out.println(myTuple1.getA() + " : "+ myTuple1.getB() + " : " +myTuple1.getC());
        System.out.println(myTuple2.getA() + " : "+ myTuple2.getB() + " : " + myTuple2.getC());


    }
}
