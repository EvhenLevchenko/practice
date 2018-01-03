package dontsee.lerningManagmentSystem.model;

import java.io.Serializable;
import java.util.Set;

public class Student implements Serializable,HasID{
    private static int idCounter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private Set<Task> tasks;
    private Journal journal;


    public Student(String firstName, String lastName, int age) {
        this.id = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int getID() {
        return id;
    }
}