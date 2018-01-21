package dontsee.LMSS.dao.Impl.mysql;


import dontsee.LMSS.dao.GroupsDAO;
import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Students;
import dontsee.LMSS.dao.model.Teachers;

import java.io.Serializable;
import java.security.acl.Group;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GroupsDAOImplementation extends LMSDatabase implements GroupsDAO,Serializable {

    private static final long serialVersionUID = -1538748824744973693L;

    private static final String INSERT_GROUP = "INSERT INTO groups (name) VALUES (?)";
    private static final String SELECT_GROUP = "SELECT * FROM groups";
    private static final String DELETE_GROUP = "DELETE FROM groups WHERE id = ?";
    private static final String UPDATE_GROUP = "UPDATE groups SET name = ? WHERE id = ?";


    public GroupsDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        super();
        createTableGroups();
    }

    @Override
    public boolean addGroup(Groups group) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(INSERT_GROUP);
            addGroup(pst, group);
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
    public boolean deleteGroup(Groups group) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_GROUP);
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
    public boolean updateGroup(Groups group) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(UPDATE_GROUP);
            updateGroup(pst, group);
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
    public List<Groups> getAll() {
        List<Groups> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_GROUP);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                Groups group = new Groups(
                        resultSet.getInt("id"),
                        resultSet.getString("name")
                );
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

    private void addGroup(PreparedStatement pst, Groups group) throws SQLException {
        pst.setString(1, group.getName());
    }

    private void deleteGroup(PreparedStatement pst, Groups group) throws SQLException {
        pst.setInt(1, group.getId());
    }

    private void updateGroup(PreparedStatement pst, Groups group) throws SQLException {
        pst.setString(1, group.getName());
        pst.setInt(2, group.getId());
    }

}
