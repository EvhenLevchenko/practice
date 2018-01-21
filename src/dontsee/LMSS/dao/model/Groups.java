package dontsee.LMSS.dao.model;


import java.io.Serializable;

public class Groups implements Serializable {


    private static final long serialVersionUID = 8850424821756658571L;
    private int id;
    private String name;

    public Groups(){}

    public Groups(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Groups(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Groups{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
