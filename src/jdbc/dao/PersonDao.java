package jdbc.dao;


import jdbc.domain.Person;

import java.sql.SQLException;
import java.util.List;

public interface PersonDao {

    boolean addPerson(Person person) throws SQLException;

    List<Person> getAll();
}
