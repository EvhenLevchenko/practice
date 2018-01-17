package dontsee.LMSS.dao.Impl.mysql;


import dontsee.LMSS.dao.GroupsDAO;
import dontsee.LMSS.dao.model.Groups;

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
    private static final String SELECT_GROUPS = "SELECT group_id, name, teacher FROM groups";


    @Override
    public boolean addGroup(Groups group) {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(INSERT_GROUPS);
            ps.setString(1, group.getName());
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
        return false;
    }

    @Override
    public boolean updateGroup(Groups group) {
        return false;
    }

    @Override
    public List<Groups> getAll() throws SQLException {
        List<Groups> groups = new ArrayList<Groups>();

        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = getConnection().createStatement();
            rs = stmt.executeQuery(SELECT_GROUPS);
            while (rs.next()) {
                Groups gr = new Groups();
                gr.setId(rs.getInt(1));
                gr.setName(rs.getString(2));
                groups.add(gr);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        }
        return groups;
    }
}

