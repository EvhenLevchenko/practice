package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Students;

import java.security.acl.Group;
import java.sql.SQLException;
import java.util.List;

public interface StudentsDAO {

    boolean addStudent(Students student);
    boolean deleteStudent(Students student) throws SQLException;
    boolean transferStudent(Groups oldGroup,Groups newGroup) throws SQLException;
    boolean updateStudent(Students students) throws SQLException;

    List<Students> getAll() throws SQLException;

}
