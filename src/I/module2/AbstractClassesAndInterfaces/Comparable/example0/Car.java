package I.module2.AbstractClassesAndInterfaces.Comparable.example0;

public class Car   {
    private int maxSpeed;
    private int age;
    private String name;


    public Car(int maxSpeed, int age, String name) {
        this.maxSpeed = maxSpeed;
        this.age = age;
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


}
