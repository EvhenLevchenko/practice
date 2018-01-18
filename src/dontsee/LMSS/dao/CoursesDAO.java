package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Courses;

import java.sql.SQLException;
import java.util.List;

public interface CoursesDAO {
    boolean addCourse(Courses course);
    boolean deleteCourse(Courses course);
    boolean updateCourse(Courses course) throws SQLException;
    List<Courses> getAll();
}
