package jdbc.dao.impl.h2;


import jdbc.dao.PersonDao;
import jdbc.domain.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDao {
    private static final String DRIVER_NAME = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:mem:test";
    private static final String DB_USERNAME = "";
    private static final String DB_PASSWORD = "";

    private static final String CREATE_TABLE = "CREATE TABLE person (" +
            "id int AUTO_INCREMENT, " +
            "name varchar(50), " +
            "age int(4), " +
            "PRIMARY KEY(id) " +
            ")";

    private static final String INSERT_PERSON = "INSERT INTO person (name,age) VALUES (?,?)";
    private static final String SELECT_PERSON = "SELECT * FROM person ";

    public PersonDAOImpl() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class.forName(DRIVER_NAME).newInstance();
        createTable();
    }

    @Override
    public boolean addPerson(Person person) {
        PreparedStatement ps = null;

        try {
            ps = getConnection().prepareStatement(INSERT_PERSON);
            ps.setString(1, person.getName());
            ps.setInt(2, person.getAge());
            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public List<Person> getAll() {
        List<Person> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_PERSON);
            ResultSet resultSet = st.getResultSet();

            while (resultSet.next()) {
                Person person = new Person(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"));
                result.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        return result;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }

    private void createTable() throws SQLException {
        getConnection().createStatement().execute(CREATE_TABLE);
    }
}
