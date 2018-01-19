package dontsee.LMSS.dao.Impl.mysql;

import dontsee.LMSS.dao.StudentsDAO;
import dontsee.LMSS.dao.model.Courses;
import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Students;
import dontsee.LMSS.dao.model.Teachers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentsDAOImplementation extends LMSDatabase implements StudentsDAO {


    public StudentsDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        super();

    }

    private static final String INSERT_STUDENT = "INSERT INTO students (first_name,second_name,last_name,age,phone_number,address ) VALUES (?,?,?,?,?,?)";
    private static final String SELECT_STUDENT = "SELECT * FROM students";
    private static final String DELETE_STUDENT = "DELETE FROM students WHERE  id=?";
    private static final String TRANSFER_STUDENT = "UPDATE students SET group_id=? WHERE group_id=?";
    private static final String UPDATE_STUDENT = "UPDATE students SET first_name = ?, second_name = ?, last_name = ?, age = ?, phone_number = ?, address = ? WHERE id = ?";

    @Override
    public boolean addStudent(Students student) {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(INSERT_STUDENT);
            addStudent(ps, student);
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
    public boolean deleteStudent(Students student) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_STUDENT);
            deleteStudent(pst, student);
            return pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            {
                try {
                    assert pst != null;
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean transferStudent(Groups oldGroup, Groups newGroup) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(TRANSFER_STUDENT);
            transferStudent(ps, oldGroup, newGroup);
            ps.execute();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }

    @Override
    public boolean updateStudent(Students student) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(UPDATE_STUDENT);
            updateStudent(ps, student);
            ps.execute();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }

    @Override
    public List<Students> getAll() {
        List<Students> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_STUDENT);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                Students student = new Students(
                        resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("second_name"),
                        resultSet.getString("last_name"),
                        resultSet.getInt("age"),
                        resultSet.getString("phone_number"),
                        resultSet.getString("address"),
                        new Courses(
                                resultSet.getInt("id"),
                                resultSet.getString("name")
                        ),
                        new Teachers(
                                resultSet.getInt("id"),
                                resultSet.getString("first_name"),
                                resultSet.getString("second_name"),
                                resultSet.getString("last_name")
                        ),
                        new Groups(
                                resultSet.getInt("id"),
                                resultSet.getString("name")
                        ));
                result.add(student);
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert st != null;
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private void addStudent(PreparedStatement ps, Students student) throws SQLException {
        ps.setString(1, student.getFirstName());
        ps.setString(2, student.getSecondName());
        ps.setString(3, student.getLastName());
        ps.setInt(4, student.getAge());
        ps.setString(5, student.getPhoneNumber());
        ps.setString(6, student.getAddress());

    }
    private void deleteStudent(PreparedStatement ps, Students student) throws SQLException {
        ps.setInt(1, student.getId());
    }
    private void transferStudent(PreparedStatement ps, Groups oldGroup, Groups newGroup) throws SQLException {
        ps.setInt(1, oldGroup.getId());
        ps.setInt(2, newGroup.getId());

    }
    private void updateStudent(PreparedStatement ps, Students student) throws SQLException {
        ps.setString(1, student.getFirstName());
        ps.setString(2, student.getSecondName());
        ps.setString(3, student.getLastName());
        ps.setInt(4, student.getAge());
        ps.setString(5, student.getPhoneNumber());
        ps.setString(6, student.getAddress());
        ps.setInt(7, student.getId());
    }
}

