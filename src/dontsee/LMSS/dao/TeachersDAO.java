package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Teachers;

import java.sql.SQLException;
import java.util.List;

public interface TeachersDAO {
    boolean addTeacher(Teachers teacher);
    boolean deleteTeacher(Teachers teacher);
    boolean transferTeacher(Groups oldGroup, Groups newGroup) throws SQLException;
    boolean updateTeacher(Teachers teacher) throws SQLException;
    List<Teachers> getAll();
}
