package dontsee.LMSS.dao.model;

import attic.List.ArrayList.List;

import java.io.Serializable;

public class Journal implements Serializable {

    private static final long serialVersionUID = 7347826604952733183L;
    private int id;
    private int mark;

    public Journal(){}

    public Journal(int id, int mark) {
        this.id = id;
        this.mark = mark;
    }

    public Journal(int mark) {
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }


    @Override
    public String toString() {
        return "Journal{" +
                "id=" + id +
                ", mark=" + mark +
                '}';
    }
}
