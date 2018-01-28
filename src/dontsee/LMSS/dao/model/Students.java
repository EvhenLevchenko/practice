package dontsee.LMSS.dao.model;

import attic.List.ArrayList.List;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Students implements Serializable {


    private static final long serialVersionUID = -994619034723239759L;
    private int studentId;
    private String firstName;
    private String secondName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String address;

    public Students(){}

    public Students(int studentId, String firstName, String secondName, String lastName, int age, String phoneNumber, String address) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }


    public Students(int studentId, String firstName, String secondName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public Students(String firstName, String secondName, String lastName, int age, String phoneNumber, String address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Students(int studentId) {
        this.studentId = studentId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}