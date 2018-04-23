package I.module3.Seri;

import java.io.Serializable;

public class Brend implements Serializable {
    private String brend;
    private  int year;

    public Brend() {
    }

    public Brend(String brend, int year) {
        this.brend = brend;
        this.year = year;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Brend{" +
                "brend='" + brend + '\'' +
                ", year=" + year +
                '}';
    }
}
