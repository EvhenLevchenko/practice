package dontsee.LMSS.dao.Impl.mysql;


import dontsee.LMSS.dao.StudentsDAO;
import dontsee.LMSS.dao.model.Students;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class StudentsDAOImplementation extends LMSDatabase implements StudentsDAO {


    public StudentsDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

    }

    private static final String INSERT_STUDENT = "INSERT INTO students (first_name,second_name,last_name,age,phone_number,address ) VALUES (?,?,?,?,?,?)";
    private static final String SELECT_STUDENT = "SELECT * FROM students";
    private static final String UPDATE_STUDENT = "UPDATE students SET (first_name,second_name,last_name,age,phone_number,address)VALUES(?,?,?,?,?,?) WHERE student_id=?";
    private static final String DELETE_STUDENT = "DELETE FROM students WHERE  id=?";

    @Override
    public boolean addStudent(Students student) {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(INSERT_STUDENT);
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getSecondName());
            ps.setString(3, student.getLastName());
            ps.setInt(4, student.getAge());
            ps.setString(5, student.getPhoneNumber());
            ps.setString(6, student.getAddress());
            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            {
                try {
                    assert ps != null;
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void deleteStudent(Students student) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(DELETE_STUDENT);
            ps.setInt(1, student.getId());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
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
    public boolean transferStudent(Students student) {
        return false;
    }

    @Override
    public boolean updateStudent(Students students) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(UPDATE_STUDENT);
            ps.setString(1, students.getFirstName());
            ps.setString(2, students.getSecondName());
            ps.setString(3, students.getLastName());
            ps.setInt(4, students.getAge());
            ps.setString(5, students.getPhoneNumber());
            ps.setString(6, students.getAddress());
            ps.setInt(8, students.getId());
            ps.execute();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }

    @Override
    public void getAll() throws SQLException {
        Collection<Students> students = new ArrayList<Students>();

        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = getConnection().createStatement();
            rs = stmt.executeQuery(SELECT_STUDENT);
            while (rs.next()) {
                Students st = new Students(rs);
                students.add(st);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        }
    }
}