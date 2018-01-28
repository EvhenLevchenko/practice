package dontsee.LMSS.dao.model;

import attic.List.ArrayList.List;

import java.io.Serializable;

public class Teachers implements Serializable {


    private static final long serialVersionUID = 6955736773009625470L;
    private int id;
    private String firstName;
    private String secondName;
    private String lastName;
    private String phoneNumber;
    private Courses course;
    private Groups group;

    public Teachers (){}

    public Teachers(int id, String firstName, String secondName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Teachers(String firstName, String secondName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Teachers(String firstName, String secondName, String lastName, String phoneNumber, Courses course, Groups group) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.group = group;
    }

    public Teachers(int id, String firstName, String secondName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
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
        return "Teachers{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
