package dontsee.LMSS.dao.model;

import attic.List.ArrayList.List;

import java.io.Serializable;

public class Journal implements Serializable {


    private static final long serialVersionUID = 2114289391714965849L;
    private int id;
    private int mark;
    private Groups group;

    public Journal(){}

    public Journal(int id, int mark) {
        this.id = id;
        this.mark = mark;
    }

    public Journal(int mark) {
        this.mark = mark;
    }

    public Journal(int mark, Groups group) {
        this.mark = mark;
        this.group = group;
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

    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "id=" + id +
                ", mark=" + mark +
                ", group=" + group +
                '}';
    }
}
