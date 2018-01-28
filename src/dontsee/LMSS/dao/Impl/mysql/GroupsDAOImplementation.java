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


    private static final String INSERT_GROUP = "INSERT INTO groups (group_name) VALUES (?)";
    private static final String SELECT_GROUP = "SELECT * FROM groups";
    private static final String DELETE_GROUP = "DELETE FROM groups WHERE group_id = ?";
    private static final String UPDATE_GROUP = "UPDATE groups SET group_name = ? WHERE group_id = ?";
    private static final long serialVersionUID = -2827073176309435274L;


    public GroupsDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        super();
    }

    @Override
    public boolean addGroup(Groups group) throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(INSERT_GROUP);
            addGroup(pst, group);
            return pst.execute();
        } finally {
            if (pst != null) {
                pst.close();
            }
        }
    }

    @Override
    public boolean deleteGroup(Groups group) throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_GROUP);
            deleteGroup(pst, group);
            return pst.execute();
        } finally {
            if (pst != null) {
                pst.close();
            }
        }
    }

    @Override
    public boolean updateGroup(Groups group) throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(UPDATE_GROUP);
            updateGroup(pst, group);
            return pst.execute();
        } finally {
            if (pst != null) {
                pst.close();
            }
        }
    }

    @Override
    public List<Groups> getAll() throws SQLException {
        List<Groups> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_GROUP);
            ResultSet resultSet = st.getResultSet();
            getAll(resultSet,result);
            return result;
        } finally {
            if(st != null){
                st.close();
            }
        }
    }

    private void addGroup(PreparedStatement pst, Groups group) throws SQLException {
        pst.setString(1, group.getGroupName());
        // pst.setInt(2, group.getStudent().getStudentId());
    }

    private void deleteGroup(PreparedStatement pst, Groups group) throws SQLException {
        pst.setInt(1, group.getGroupId());
    }

    private void updateGroup(PreparedStatement pst, Groups group) throws SQLException {
        pst.setString(1, group.getGroupName());
        pst.setInt(2, group.getGroupId());
    }

    private void getAll(ResultSet resultSet, List<Groups> result) throws SQLException {
        while (resultSet.next()) {
            Groups group = new Groups(
                    resultSet.getInt("group_id"),
                    resultSet.getString("group_name")
            );
            result.add(group);
        }
    }
}
