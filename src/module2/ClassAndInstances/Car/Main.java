package module2.ClassAndInstances.Car;

class Engine {
    String serialNumber;

}

class Car {
    Engine engine;//поле двигатель

    public Engine getEngine() {
        return engine;
    }

    public void Engine(Engine newEngine) {
        engine = newEngine;
    }


    // поля класа
    // модификаторы доступа private для encapsulation класса Car
    // добавляем методы которые будут нам возвращать эти поля
    private String model;//4 байта
    private int year;//4 байта
    private int speed;//4 байта
    private int maxSpeed;//4 байта
    private boolean moving;


    public Car() {
        System.out.println("Car Constructor");
        this.model = "Toyota";
    }

    void printSpeed() {
        System.out.println("My speed is " + speed);
    }

    public boolean isMoving() {//Getter для boolean
        return moving;
    }

    public String getModel() {
        return model;
    }// для получения значений

    public int getYear() {
        return year;
    }// для получения значений

    public int getSpeed() {
        return speed;
    }// для получения значений

    public int getMaxSpeed() {
        return maxSpeed;
    }// для получения значений

    public void setModel(String model) {
        this.model = model;
    }// для установки значений

    public void setYear(int year) {
        this.year = year;
    }// для установки значений

    public void setSpeed(int speed) {
        this.speed = speed;
    }// для установки значений

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }// для установки значений
}

class Square {
    private int width;// поля классов инициализировать каким-то значением не обязательно в отличии от локальны пременных
    private int area;// будет исп значение по умолчанию

    // метод задает шырину
    public void setWidth(int newWidth) {// принимает на вход новую шырину
        //  newWidth = newWidth;//  присвает текущей шырине
        // area = newWidth * newWidth;
        width = newWidth;
        calculateArea();
    }

    private void calculateArea() {
        area = width * width;
    }

    public int getArea() {
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.setWidth(10);
        System.out.println(square.getArea());

        //обьекты класа
        Car car = new Car();
        Engine engine = new Engine();
        engine.serialNumber = "";
        car.engine = engine;// присвоили автомобилю двигатель
        System.out.println(car.engine.serialNumber);

//        car.model = "Subaru";
//        car.year = 2016;
//        car.maxSpeed = 300;
//        car.speed = 50;
//
//        Car car2 = new Car();
//        car2.model = "Toyota";
//        car2.year = 2016;
//        car2.maxSpeed = 300;
//        car2.speed = 70;

//
//        car.printSpeed();
//        car2.printSpeed();
//        System.out.println("Model " + car.model);
    }
}
