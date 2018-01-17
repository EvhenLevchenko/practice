package dontsee.LMSS.dao.Impl.mysql;

import dontsee.LMSS.dao.CoursesDAO;
import dontsee.LMSS.dao.model.Courses;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class CoursesDAOImplementation extends LMSDatabase implements CoursesDAO {
    public CoursesDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    }

    private static final String INSERT_COURSES = "INSERT INTO courses (name,description,startDate,finishDate,task ) VALUES (?,?,?,?,?)";
    private static final String SELECT_COURSES= "SELECT * FROM courses";

    @Override
    public boolean addCourse(Courses course) {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(INSERT_COURSES);
            ps.setString(1, course.getName());
            ps.setString(2, course.getDescription());
            ps.setDate(3, Date.valueOf("2018-06-18"));
            ps.setDate(4, Date.valueOf("2018-09-18"));
            ps.setString(5, course.getTask());

            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            {
                try {
                    assert ps != null;
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean deleteCourse(Courses course) {
        return false;
    }

    @Override
    public boolean updateCourse(Courses course) {
        return false;
    }

    @Override
    public List<Courses> getAll() {
        return null;
    }
}
