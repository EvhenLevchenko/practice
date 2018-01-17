package dontsee.LMSS.dao.Impl.mysql;

import dontsee.LMSS.dao.TeachersDAO;
import dontsee.LMSS.dao.model.Teachers;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class TeachersDAOImplementation extends  LMSDatabase implements TeachersDAO {


    public TeachersDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        super();
    }
    private static final String INSERT_TEACHERS = "INSERT INTO teachers (first_name,second_name,last_name ) VALUES (?,?,?)";
    private static final String SELECT_TEACHERS= "SELECT * FROM teachers";


    @Override
    public boolean addTeacher(Teachers teacher) {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(INSERT_TEACHERS);
            ps.setString(1, teacher.getFirstName());
            ps.setString(2, teacher.getSecondName());
            ps.setString(3, teacher.getLastName());
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
    public boolean deleteTeacher(Teachers teacher) {
        return false;
    }

    @Override
    public boolean transferStudent(Teachers teacher) {
        return false;
    }

    @Override
    public boolean updateStudent(Teachers teacher) {
        return false;
    }

    @Override
    public List<Teachers> getAll() {

        return null;
    }
}
