package dontsee.LMSS.dao.Impl.mysql;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LMSDatabase implements Serializable {

    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sdo?useSSL=false";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    private static final String CREATE_STUDENTS = "CREATE TABLE IF NOT EXISTS students(" +
            "student_id INT AUTO_INCREMENT," +
            "first_name  VARCHAR (15)," +
            "second_name VARCHAR (15)," +
            "last_name VARCHAR (15)," +
            "age INT(3)," +
            "phone_number VARCHAR (13)," +
            "address VARCHAR (100)," +
            "PRIMARY KEY (student_id)" +
            ")";

    private static final String CREATE_STUDENTS_GROUPS = "CREATE TABLE IF NOT EXISTS students_groups(" +
            "students_groups_id INT AUTO_INCREMENT," +
            "student_id INT," +
            "group_id INT," +
            "FOREIGN KEY (student_id) REFERENCES students(student_id)," +
            "FOREIGN KEY (group_id) REFERENCES groups(group_id)," +
            "PRIMARY KEY (students_groups_id)" +
            ")";

    private static final String CREATE_TEACHERS = "CREATE TABLE IF NOT EXISTS teachers(" +
            "teacher_id INT AUTO_INCREMENT," +
            "first_name VARCHAR (15)," +
            "second_name VARCHAR (15)," +
            "last_name VARCHAR (15)," +
            "phone_number VARCHAR (13)," +
            "PRIMARY KEY (teacher_id)" +
            ")";

    private static final String CREATE_TEACHERS_GROUPS = "CREATE TABLE IF NOT EXISTS teachers_groups(" +
            "teacher_id INT," +
            "group_id INT," +
            "FOREIGN KEY (teacher_id) REFERENCES teachers(teacher_id)," +
            "FOREIGN KEY (group_id) REFERENCES groups(group_id)" +
            ")";

    private static final String CREATE_GROUPS = "CREATE TABLE IF NOT EXISTS groups(" +
            "group_id INT AUTO_INCREMENT," +
            "group_name VARCHAR (10)," +
            "course_id INT," +
            "FOREIGN KEY (course_id) REFERENCES courses(course_id)," +
            "PRIMARY KEY (group_id)" +
            ")";

    private static final String CREATE_COURSES = "CREATE TABLE IF NOT EXISTS courses(" +
            "course_id INT AUTO_INCREMENT," +
            "course_name VARCHAR (20)," +
            "description VARCHAR (2000)," +
            "start_date DATE ," +
            "finish_date DATE," +
            "task VARCHAR (2000)," +
            "PRIMARY KEY (course_id)" +
            ")";

    private static final String CREATE_JOURNAL = "CREATE TABLE IF NOT EXISTS journal(" +
            "journal_id INT AUTO_INCREMENT," +
            "mark INT (100)," +
            "group_id INT," +
            "student_id INT," +
            "FOREIGN KEY (group_id) REFERENCES groups(group_id)," +
            "FOREIGN KEY (student_id) REFERENCES students(student_id)," +
            "PRIMARY KEY (journal_id)" +
            ")";

    private static final String CREATE_DAYS_OF_WEEK = "CREATE TABLE IF NOT EXISTS days_of_week(" +
            "days_of_week_id INT," +
            "day VARCHAR(15)," +
            "PRIMARY KEY (days_of_week_id)" +
            ")";

    private static final String CREATE_TIMETABLE = "CREATE TABLE IF NOT EXISTS timetable(" +
            "timetable_id INT AUTO_INCREMENT," +
            "days_of_week_id INT," +
            "start_lecture TIME ," +
            "finish_lecture TIME ," +
            "group_id INT," +
            "FOREIGN KEY (days_of_week_id) REFERENCES days_of_week(days_of_week_id)," +
            "FOREIGN KEY (group_id) REFERENCES groups(group_id)," +
            "PRIMARY KEY (timetable_id)" +
            ")";

    private static final String INSERT_DAYS_OF_WEEK = "INSERT INTO days_of_week VALUES" +
            "(1, 'SUNDAY')," +
            "(2, 'MONDAY')," +
            "(3, 'TUESDAY')," +
            "(4, 'WEDNESDAY')," +
            "(5, 'THURSDAY')," +
            "(6, 'FRIDAY')," +
            "(7, 'SATURDAY')";
    private static final long serialVersionUID = -3003859058256429125L;


    public LMSDatabase() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName(DRIVER_NAME).newInstance();
    }

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }

    protected void closeConnection() throws SQLException {
        getConnection().close();
    }

    public void createDatabase() throws SQLException {
        getConnection().createStatement().execute(CREATE_STUDENTS);
        getConnection().createStatement().execute(CREATE_TEACHERS);
        getConnection().createStatement().execute(CREATE_COURSES);
        getConnection().createStatement().execute(CREATE_GROUPS);
        getConnection().createStatement().execute(CREATE_TEACHERS_GROUPS);
        getConnection().createStatement().execute(CREATE_STUDENTS_GROUPS);
        getConnection().createStatement().execute(CREATE_JOURNAL);
        getConnection().createStatement().execute(CREATE_DAYS_OF_WEEK);
        ResultSet rs = getConnection().createStatement().executeQuery("select count(*) FROM days_of_week");
        rs.next();
        int insertData = rs.getInt("count(*)");
        if (insertData == 0) {
            getConnection().createStatement().execute(INSERT_DAYS_OF_WEEK);
        } else if (insertData != 7) {
            getConnection().createStatement().execute("DROP TABLE days_of_week");
            getConnection().createStatement().execute(CREATE_DAYS_OF_WEEK);
            getConnection().createStatement().execute(INSERT_DAYS_OF_WEEK);
        }
        getConnection().createStatement().execute(CREATE_TIMETABLE);
    }
}