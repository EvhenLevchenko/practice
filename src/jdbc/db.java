package jdbc;

import jdbc.dao.PersonDao;
import jdbc.dao.impl.h2.PersonDAOImpl;
import jdbc.domain.Person;


import java.sql.*;


public class db {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        PersonDao personDao = new PersonDAOImpl();
        Person p1 = new Person("Alex", 22);
        Person p2 = new Person("Ivan", 23);

        personDao.addPerson(p1);
        personDao.addPerson(p2);


        System.out.println(personDao.getAll());
        //        Class.forName("org.h2.Driver").newInstance();
//
//        Connection connection = DriverManager.getConnection("jdbc:h2:mem:test", "", "");
//
//        Statement statement = connection.createStatement();
//
//        String createTable = "CREATE TABLE t1 (" +
//                "id int AUTO_INCREMENT, " +
//                "name varchar(50), " +
//                "age int(4), " +
//                "PRIMARY KEY(id) " +
//                ")";
//        statement.execute(createTable);
//
//        String insert = "INSERT INTO t1 (name,age) VALUES ('n1',34)";
//        statement.execute(insert);
//
//        ResultSet resultSet = statement.executeQuery("SELECT * FROM t1");
//
//        while (resultSet.next()) {
//            System.out.println("name: " + resultSet.getString("name"));
//            System.out.println("age: " + resultSet.getInt("age"));
//            System.out.println("id: " + resultSet.getInt("id"));
//        }
//
//        connection.close();
    }
}
