package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Courses;

import java.util.List;

public interface CoursesDAO {
    boolean addCourse(Courses course);
    boolean deleteCourse(Courses course);
    boolean updateCourse(Courses course);
    List<Courses> getAll();
}
