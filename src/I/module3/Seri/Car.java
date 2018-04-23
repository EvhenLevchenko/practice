package I.module3.Seri;



import java.io.Serializable;
import java.util.Random;


public class Car extends Transport implements Serializable {
    private transient int id;
    private  String color;
    private  int year;
    private  int mileage;
    private Brend brend;


    public Car(int wheels, int id, String color, int year, int mileage, Brend brend) {
        super(wheels);
        this.id = id;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.brend = brend;
    }

    public Brend getBrend() {
        return brend;
    }

    public void setBrend(Brend brend) {
        this.brend = brend;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", brend=" + brend +
                ", wheels=" + wheels +
                '}';
    }
}
