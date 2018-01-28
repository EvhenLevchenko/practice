package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Students;

import java.sql.SQLException;

public interface StudentsGroupsDAO {
    boolean insertToStudentsGroups(Students student, Groups group) throws SQLException;
}
