package module3.Seri;

import java.io.Serializable;

public class Skoda implements Serializable {
    private String brend;
    private  int year;

    public Skoda() {
    }



    public Skoda(String brend, int year) {
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


    @Override
    public String toString() {
        return "Skoda{" +
                "brend='" + brend + '\'' +
                ", year=" + year +
                '}';
    }

    public void setYear(int year) {
        this.year = year;
    }
}
