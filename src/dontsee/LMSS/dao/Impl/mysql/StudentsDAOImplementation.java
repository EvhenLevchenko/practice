package dontsee.LMSS.dao.Impl.mysql;


import dontsee.LMSS.dao.StudentsDAO;
import dontsee.LMSS.dao.model.Students;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.List;

public class StudentsDAOImplementation extends LMSDatabase implements StudentsDAO {


    public StudentsDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

    }

    private static final String INSERT_STUDENT = "INSERT INTO students (first_name,second_name,last_name,age,phone_number,address ) VALUES (?,?,?,?,?,?)";
    private static final String SELECT_STUDENT = "SELECT * FROM person";


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
    public boolean deleteStudent(Students student) {
        return false;
    }

    @Override
    public boolean transferStudent(Students student) {
        return false;
    }

    @Override
    public boolean updateStudent(Students students) {
        return false;
    }

    @Override
    public List<Students> getAll() {
        return null;
    }
}
