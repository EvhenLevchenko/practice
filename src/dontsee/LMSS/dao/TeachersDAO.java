package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Teachers;

import java.sql.SQLException;
import java.util.List;


public interface TeachersDAO {
    boolean addTeacher(Teachers teacher);
    boolean deleteTeacher(Teachers teacher);
    boolean transformTeacher(Groups oldGroup, Groups newGroup);
    boolean updateTeacher(Teachers teacher);
    List<Teachers> getAll();
}
