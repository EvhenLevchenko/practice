package dontsee.LMSS.dao.Impl.mysql;


import dontsee.LMSS.dao.GroupsDAO;
import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Students;
import dontsee.LMSS.dao.model.Teachers;

import java.security.acl.Group;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GroupsDAOImplementation extends LMSDatabase implements GroupsDAO {
    public GroupsDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    }

    private static final String INSERT_GROUPS = "INSERT INTO groups (name) VALUES (?)";
    private static final String SELECT_GROUPS = "SELECT * FROM groups";
    private static final String DELETE_GROUPS = "DELETE FROM courses WHERE id=?";
    private static final String UPDATE_GROUPS = "UPDATE  courses name=?,description=?,startDate=?,finishDate=?,task=?";

    @Override
    public boolean addGroup(Groups group) {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(INSERT_GROUPS);
            addGroup(ps, group);
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
    public boolean deleteGroup(Groups group) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_GROUPS);
            deleteGroup(pst, group);
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
    public boolean updateGroup(Groups group) throws SQLException {

        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(UPDATE_GROUPS);
            updateGroup(ps, group);
            ps.execute();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }

    @Override
    public List<Groups> getAll() throws SQLException {
        List<Groups> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_GROUPS);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                Groups group = new Groups(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        new Students(
                                resultSet.getInt("id"),
                                resultSet.getString("first_name"),
                                resultSet.getString("second_name"),
                                resultSet.getString("last_name")
                        ));
                result.add(group);
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

    private void addGroup(PreparedStatement ps, Groups group) throws SQLException {
        ps.setString(1, group.getName());
    }
    private void deleteGroup(PreparedStatement ps, Groups groups) throws SQLException {
        ps.setInt(1, groups.getId());
    }
    private void updateGroup(PreparedStatement ps, Groups group) throws SQLException {
        ps.setString(1, group.getName());
        ps.setInt(2, group.getId());
    }
}
