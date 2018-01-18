package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Groups;

import java.sql.SQLException;
import java.util.List;

public interface GroupsDAO {
    boolean addGroup(Groups group);
    boolean deleteGroup(Groups group);
    boolean updateGroup(Groups group) throws SQLException;
    List<Groups> getAll() throws SQLException;
}
