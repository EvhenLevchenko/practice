package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Teachers;

import java.sql.SQLException;
import java.util.List;

public interface TeachersDAO {
    boolean addTeacher(Teachers teacher);
    boolean deleteTeacher(Teachers teacher);
    boolean transferStudent(Teachers teacher);
    boolean updateStudent(Teachers teacher);
    List<Teachers> getAll();
}
