package dontsee.LMSS.dao.Impl.mysql;

import dontsee.LMSS.dao.TeachersDAO;
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


public class TeachersDAOImplementation extends LMSDatabase implements TeachersDAO {


    public TeachersDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        super();
    }

    private static final String INSERT_TEACHERS = "INSERT INTO teachers (first_name,second_name,last_name,phone_number ) VALUES (?,?,?,?,?,?)";
    private static final String SELECT_TEACHERS = "SELECT * FROM teachers";
    private static final String DELETE_TEACHERS = "DELETE FROM teachers WHERE  id=?";
    private static final String TRANSFER_TEACHERS = "UPDATE teachers SET group_id=? WHERE group_id=?";
    private static final String UPDATE_TEACHERS = "UPDATE teachers SET first_name = ?, second_name = ?, last_name = ?, phone_number = ? WHERE id = ?";


    @Override
    public boolean addTeacher(Teachers teacher) {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(INSERT_TEACHERS);
            addTeacher(ps, teacher);
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
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_TEACHERS);
            delteTeacher(pst, teacher);
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
    public boolean transferTeacher(Groups oldGroup, Groups newGroup) throws SQLException {

        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(TRANSFER_TEACHERS);
            transferTeacher(ps, oldGroup, newGroup);

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }

    @Override
    public boolean updateTeacher(Teachers teacher) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(UPDATE_TEACHERS);
            updateTeacher(ps, teacher);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }

    @Override
    public List<Teachers> getAll() {
        List<Teachers> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_TEACHERS);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                Teachers teachers = new Teachers(
                        resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("second_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("phone_number"),
                        new Courses(
                                resultSet.getInt("id"),
                                resultSet.getString("name")
                        ),
                        new Groups(
                                resultSet.getInt("id"),
                                resultSet.getString("name")
                        ));
                result.add(teachers);
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

    private void addTeacher(PreparedStatement ps, Teachers teacher) throws SQLException {
        ps.setString(1, teacher.getFirstName());
        ps.setString(2, teacher.getSecondName());
        ps.setString(3, teacher.getLastName());
        ps.setString(4, teacher.getPhoneNumber());

    }

    private void delteTeacher(PreparedStatement pst, Teachers teacher) throws SQLException {
        pst.setInt(1, teacher.getId());

    }

    private void transferTeacher(PreparedStatement ps, Groups oldGroup, Groups newGroup) throws SQLException {
        ps.setInt(1, oldGroup.getId());
        ps.setInt(2, newGroup.getId());

    }

    private void updateTeacher(PreparedStatement ps, Teachers teacher) throws SQLException {
        ps.setString(2, teacher.getSecondName());
        ps.setString(3, teacher.getLastName());
        ps.setString(4, teacher.getPhoneNumber());
        ps.setInt(5, teacher.getId());

    }

}
