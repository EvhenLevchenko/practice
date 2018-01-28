package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Students;

import java.security.acl.Group;
import java.sql.SQLException;
import java.util.List;

public interface  StudentsDAO {
    boolean addStudent(Students student) throws SQLException;
    boolean deleteStudent(Students students) throws SQLException;
    boolean transformStudent(Groups oldGroup, Groups newGroup) throws SQLException;
    boolean updateStudent(Students student) throws SQLException;
    List<Students> selectStudentsFromGroup(Groups group) throws SQLException;
    List<Students> getAll() throws SQLException;
}

