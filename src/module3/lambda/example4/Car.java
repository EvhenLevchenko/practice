package module3.lambda.example4;

public class Car {
    int year;
    double maxSpeed;

    public Car() {
    }

    public Car(int year, double maxSpeed) {
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
