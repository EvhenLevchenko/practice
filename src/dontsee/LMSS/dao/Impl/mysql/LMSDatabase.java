package dontsee.LMSS.dao.Impl.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LMSDatabase {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:5432/java?useSSL=false";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "password";


    private static final String CREATE_STUDENTS = "CREATE TABLE students(" +
            "id int AUTO_INCREMENT," +
            "first_name varchar(15)," +
            "second_name varchar(15)," +
            "last_name varchar(15)," +
            "age int(100)," +
            //"FOREIGN KEY (course_id) references courses(id)," +
            "phone_number varchar(13)," +
            "address varchar(100)," +
            //"FOREIGN KEY (teacher_id) references teachers(id)," +
            //"FOREIGN KEY (group_id) references groups(id)," +
            "PRIMARY KEY (id)" +
            ")";

    private static final String CREATE_TEACHERS = "CREATE TABLE teachers(" +
            "id int AUTO_INCREMENT," +
            "first_name varchar(15)," +
            "second_name varchar(15)," +
            "last_name varchar(15)," +
            "phone_number varchar(13)," +
            "foreign key (course_id) references courses(id)," +
            "foreign key (group_id) references groups(id)," +
            "PRIMARY KEY (id)" +
            ")";

    private static final String CREATE_COURSES = "CREATE TABLE courses(" +
            "id int AUTO_INCREMENT," +
            "name varchar(20)," +
            "description varchar(2000)," +
            "FOREIGN KEY (group_id)references groups(id)," +
            "FOREIGN KEY (teacher_id) references teachers(id)," +
            "start_date date," +
            "finish_date date," +
            "task varchar(2000)," +
            "PRIMARY KEY (id)" +
            ")";

    private static final String CREATE_GROUPS = "CREATE TABLE groups(\n" +
            "id int AUTO_INCREMENT," +
            "name varchar(10)," +
            "FOREIGN KEY (student_d) references students(id)," +
            "PRIMARY KEY (id)" +
            ")";

    private static final String CREATE_JOURNAL = "CREATE TABLE journal(" +
            "id int AUTO_INCREMENT," +
            "FOREIGN KEY (group_id) references groups(id)," +
            "FOREIGN KEY (course_id) references courses(id)," +
            "mark int(100)," +
            "PRIMARY KEY (id)" +
            ")";

    private static final String CREATE_TIMETABLE = "CREATE TABLE timetable(" +
            "id int AUTO_INCREMENT," +
            "day varchar (10)," +
            "FOREIGN KEY (course_id) references courses(id)," +
            "start_lecture datetime," +
            "finish_lecture datetime," +
            "PRIMARY KEY (id)" +
            ")";

    LMSDatabase() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName(DRIVER_NAME).newInstance();
    }

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }

    protected void createAllTables() throws SQLException {
        getConnection().createStatement().execute(CREATE_STUDENTS);
        getConnection().createStatement().execute(CREATE_TEACHERS);
        getConnection().createStatement().execute(CREATE_COURSES);
        getConnection().createStatement().execute(CREATE_GROUPS);
        getConnection().createStatement().execute(CREATE_JOURNAL);
        getConnection().createStatement().execute(CREATE_TIMETABLE);
    }

    protected void createTableStudents() throws SQLException {
        getConnection().createStatement().execute(CREATE_STUDENTS);
    }

    protected void createTableTeachers() throws SQLException {
        getConnection().createStatement().execute(CREATE_TEACHERS);
    }

    protected void createTableCourses() throws SQLException {
        getConnection().createStatement().execute(CREATE_COURSES);
    }

    protected void createTableGroups() throws SQLException {
        getConnection().createStatement().execute(CREATE_GROUPS);
    }

    protected void createTableJournal() throws SQLException {
        getConnection().createStatement().execute(CREATE_JOURNAL);
    }

    protected void createTableTimetable() throws SQLException {
        getConnection().createStatement().execute(CREATE_TIMETABLE);
    }

}
