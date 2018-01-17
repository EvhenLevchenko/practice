package dontsee.LMSS.dao.model;

import attic.List.ArrayList.List;

public class Students {
    private int id;
    private String firstName;
    private String secondName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String address;
    private List<Courses> course;
    private List<Teachers> teacher;
    private List<Groups> group;

    public Students() { }


    public Students(String firstName, String secondName, String lastName, int age, String phoneNumber, String address, List<Courses> course, List<Teachers> teacher, List<Groups> group) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.course = course;
        this.teacher = teacher;
        this.group = group;
    }

    public Students(int id, String firstName, String secondName, String lastName, int age, String phoneNumber, String address, List<Courses> course, List<Teachers> teacher, List<Groups> group) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.course = course;
        this.teacher = teacher;
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

    public List<Courses> getCourse() {
        return course;
    }

    public void setCourse(List<Courses> course) {
        this.course = course;
    }

    public List<Teachers> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teachers> teacher) {
        this.teacher = teacher;
    }

    public List<Groups> getGroup() {
        return group;
    }

    public void setGroup(List<Groups> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", course=" + course +
                ", teacher=" + teacher +
                ", group=" + group +
                '}';
    }
}
