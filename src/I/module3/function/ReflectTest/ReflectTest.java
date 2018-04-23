package I.module3.function.ReflectTest;

import javax.xml.soap.SAAJResult;

class Car {

    class Engine {
        private String sn;

        public Engine(String sn) {
            this.sn = sn;
        }

        public String getSn() {
            return sn;
        }


        @Override
        public String toString() {
            return "Engine{" +
                    "sn='" + sn + '\'' +
                    '}';
        }
    }

    private String model;
    private Engine engine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}


public class ReflectTest {
    public static void main(String[] args) {
        Car car = new Car("Subaru");
        Car.Engine engine = car.new Engine("mbkgdlf");
        car.setEngine(engine);
        System.out.println(car);


        Class carClass=car.getClass();//обьект класса клас

        System.out.println(carClass.getName());


    }
}
