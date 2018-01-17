package dontsee.LMSS.dao.model;

import attic.List.ArrayList.List;

public class Teachers {
    private int id;
    private String firstName;
    private String secondName;
    private String lastName;
    private List<Courses> course;
    private List<Groups> group;

    public Teachers() { }

    public Teachers(String firstName, String secondName, String lastName, List<Courses> course, List<Groups> group) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.course = course;
        this.group = group;
    }

    public Teachers(int id, String firstName, String secondName, String lastName, List<Courses> course, List<Groups> group) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Courses> getCourse() {
        return course;
    }

    public void setCourse(List<Courses> course) {
        this.course = course;
    }

    public List<Groups> getGroup() {
        return group;
    }

    public void setGroup(List<Groups> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
