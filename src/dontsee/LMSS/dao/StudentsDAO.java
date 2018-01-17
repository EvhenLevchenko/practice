package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Students;

import java.sql.SQLException;
import java.util.List;

public interface StudentsDAO {

    boolean addStudent(Students student);
    boolean deleteStudent(Students student);
    boolean transferStudent(Students student);
    boolean updateStudent(Students students);
    List<Students> getAll();

}
