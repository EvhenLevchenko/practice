package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Students;

import java.sql.SQLException;

public interface StudentsDAO {

    boolean addStudent(Students student);
    void deleteStudent(Students student) throws SQLException;
    boolean transferStudent(Students student);
    boolean updateStudent(Students students) throws SQLException;
    void getAll() throws SQLException;

}
