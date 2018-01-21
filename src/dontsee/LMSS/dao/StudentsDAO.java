package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Students;

import java.security.acl.Group;
import java.sql.SQLException;
import java.util.List;

public interface  StudentsDAO {
    boolean addStudent(Students student);
    boolean deleteStudent(Students student);
    boolean transformStudent(Groups oldGroup, Groups newGroup);
    boolean updateStudent(Students student);
    List<Students> getAll();
}

