package dontsee.LMSS.dao.model;

import attic.List.ArrayList.List;

public class Groups {
    private int id;
    private String name;
    private List<Students> student;
    private List<Teachers> teacher;


    public Groups(){}

    public Groups(int id, String name, List<Students> student, List<Teachers> teacher) {
        this.id = id;
        this.name = name;
        this.student = student;
        this.teacher = teacher;
    }

    public Groups(int id, String name){
        this.id =id ;
        this.name = name;
    }

    public Groups(int id, String name, Students student) {
        this.id = id;
        this.name = name;
        this.student = (List<Students>) student;
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

    public List<Teachers> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teachers> teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + student +
                ", teacher=" + teacher +
                '}';
    }
}
