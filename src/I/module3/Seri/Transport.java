package I.module3.Seri;

import java.io.Serializable;

public class Transport implements Serializable {
    protected  int wheels;

    public Transport(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
