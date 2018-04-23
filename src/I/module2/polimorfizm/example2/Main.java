package I.module2.polimorfizm.example2;

public class Main {
    public static void main(String[] args) {
        Transport[]transports=new Transport[3];
        transports[0]=new Car();
        transports[1]=new Plane();
        transports[2]=new Ship();


        for (int i = 0; i < transports.length; i++) {
            transports[i].show();
        }
        System.out.println();

    }
}
