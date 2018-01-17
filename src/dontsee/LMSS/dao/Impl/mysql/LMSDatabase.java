package dontsee.LMSS.dao.Impl.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LMSDatabase {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sdo";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "password";


    public static final String CREATE_STUDENTS = "CREATE TABLE students(\n" +
            "id int AUTO_INCREMENT,\n" +
            "first_name varchar(15),\n" +
            "second_name varchar(15),\n" +
            "last_name varchar(15),\n" +
            "age int(100),\n" +
            "FOREIGN KEY (course_id) references courses(id),\n" +
            "phone_number varchar(13),\n" +
            "address varchar(100),\n" +
            "FOREIGN KEY (teacher_id) references teachers(id),\n" +
            "FOREIGN KEY (group_id) references groups(id)\n" +
            "PRIMARY KEY (id)\n" +
            ")";

    public static final String CREATE_TEACHERS = "CREATE TABLE teachers(\n" +
            "id int AUTO_INCREMENT,\n" +
            "first_name varchar(15),\n" +
            "second_name varchar(15),\n" +
            "last_name varchar(15),\n" +
            "phone_number varchar(13),\n" +
            "foreign key (course_id) references courses(id),\n" +
            "foreign key (group_id) references groups(id)\n" +
            "PRIMARY KEY (id)\n" +
            ")";

    public static final String CREATE_COURSES = "CREATE TABLE courses(\n" +
            "id int AUTO_INCREMENT,\n" +
            "name varchar(20),\n" +
            "description varchar(2000),\n" +
            "FOREIGN KEY (group_id)references groups(id),\n" +
            "FOREIGN KEY (teacher_id) references teachers(id),\n" +
            "start_date date,\n" +
            "finish_date date,\n" +
            "task varchar(2000)\n" +
            "PRIMARY KEY (id)\n" +
            ")";

    private static final String CREATE_GROUPS = "CREATE TABLE groups(\n" +
            "id int AUTO_INCREMENT,\n" +
            "name varchar(10),\n" +
            "FOREIGN KEY (student_d) references students(id)\n" +
            "PRIMARY KEY (id)\n" +
            ")";

    public static final String CREATE_JOURNAL = "CREATE TABLE journal(\n" +
            "id int AUTO_INCREMENT,\n" +
            "FOREIGN KEY (group_id) references groups(id),\n" +
            "FOREIGN KEY (course_id) references courses(id),\n" +
            "mark int(100)\n" +
            "PRIMARY KEY (id)\n" +
            ")";

    public static final String CREATE_TIMETABLE = "CREATE TABLE timetable(\n" +
            "day varchar (10),\n" +
            "FOREIGN KEY (course_id) references courses(id),\n" +
            "start_lecture datetime,\n" +
            "finish_lecture datetime\n" +
            ")";


    public LMSDatabase() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName(DRIVER_NAME).newInstance();

    }

    Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }
}
