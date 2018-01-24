package module2.StaticMethodsAndFields24.example0;

public class Car {
    public static void main(String[] args) {
        Car myCar1=new Car();
        Car myCar2=new Car();
        Car myCar3=new Car();
        System.out.println(myCar1.getNumOfCars());
        System.out.println(myCar2.getNumOfCars());
        System.out.println(myCar3.getNumOfCars());
    }
    private static int numOfCars;

    public Car() {
        numOfCars++;
    }

    public int getNumOfCars() {
        return numOfCars;
    }
}
