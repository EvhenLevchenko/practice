package dontsee.LMSS.dao.Impl.mysql;

import dontsee.LMSS.dao.TeachersDAO;
import dontsee.LMSS.dao.model.Courses;
import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Students;
import dontsee.LMSS.dao.model.Teachers;


import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class TeachersDAOImplementation extends LMSDatabase implements TeachersDAO,Serializable {


    private static final long serialVersionUID = 8191682078603112091L;


    private static final String INSERT_TEACHER = "INSERT INTO teachers (first_name, second_name, last_name, phone_number) VALUES (?,?,?,?)";
    private static final String SELECT_TEACHER = "SELECT * FROM teachers";
    private static final String DELETE_TEACHER = "DELETE FROM teachers WHERE id = ?";
    private static final String UPDATE_TEACHER = "UPDATE teachers SET first_name = ?, second_name = ?, last_name = ?, phone_number = ? WHERE id = ?";
    private static final String TRANSFORM_TEACHER = "UPDATE teachers SET group_id = ? WHERE group_id = ?";


    public TeachersDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        super();
        createTableTeachers();
    }

    @Override
    public boolean addTeacher(Teachers teacher) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(INSERT_TEACHER);
            addTeacher(pst,teacher);
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
    public boolean deleteTeacher(Teachers teacher) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_TEACHER);
            deleteTeacher(pst,teacher);
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
    public boolean transformTeacher(Groups oldGroup, Groups newGroup) {
        PreparedStatement pst = null;
        try{
            pst = getConnection().prepareStatement(TRANSFORM_TEACHER);
            transformTeacher(pst, oldGroup, newGroup);
            return pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return  false;
        }finally {
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
    public boolean updateTeacher(Teachers teacher) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(UPDATE_TEACHER);
            updateTeacher(pst, teacher);
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
    public List<Teachers> getAll() {
        List<Teachers> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_TEACHER);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                Teachers teacher = new Teachers(
                        resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("second_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("phone_number")
                );
                result.add(teacher);
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

    private void addTeacher(PreparedStatement pst, Teachers teacher) throws SQLException {
        pst.setString(1, teacher.getFirstName());
        pst.setString(2, teacher.getSecondName());
        pst.setString(3, teacher.getLastName());
        pst.setString(4, teacher.getPhoneNumber());
    }

    private void deleteTeacher(PreparedStatement pst,Teachers teacher) throws SQLException {
        pst.setInt(1, teacher.getId());
    }

    private void transformTeacher(PreparedStatement pst, Groups oldGroup, Groups newGroup) throws SQLException {
        pst.setInt(1,oldGroup.getId());
        pst.setInt(2,newGroup.getId());
    }

    private void updateTeacher(PreparedStatement pst, Teachers teacher) throws SQLException {
        pst.setString(1, teacher.getFirstName());
        pst.setString(2, teacher.getSecondName());
        pst.setString(3, teacher.getLastName());
        pst.setString(4, teacher.getPhoneNumber());
        pst.setInt(5,teacher.getId());
    }
}
