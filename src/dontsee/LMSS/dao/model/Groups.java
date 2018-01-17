package dontsee.LMSS.dao.model;

import attic.List.ArrayList.List;

public class Groups {
    private int id;
    private String name;
    private List<Students> student;

    public Groups() {
    }

    public Groups(int id, String name, List<Students> student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public Groups(String name, List<Students> student) {
        this.name = name;
        this.student = student;
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

    public List<Students> getStudent() {
        return student;
    }

    public void setStudent(List<Students> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
