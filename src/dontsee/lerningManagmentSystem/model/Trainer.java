package dontsee.lerningManagmentSystem.model;

import java.io.Serializable;

public class Trainer implements Serializable,HasID{
    private static int idCounter;
    private int id;
    private String firstName;
    private String lastName;

    public Trainer(String firstName, String lastName) {
        this.id = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return (String.format("id: %d. %s %s", id, firstName, lastName));
    }

    @Override
    public int getID() {
        return id;
    }
}

