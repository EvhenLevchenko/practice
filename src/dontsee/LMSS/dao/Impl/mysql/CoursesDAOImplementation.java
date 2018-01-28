package dontsee.LMSS.dao.Impl.mysql;

import dontsee.LMSS.dao.CoursesDAO;
import dontsee.LMSS.dao.model.Courses;
import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Teachers;

import java.io.Serializable;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CoursesDAOImplementation extends LMSDatabase implements CoursesDAO, Serializable {

    private static final String INSERT_COURSE = "INSERT INTO courses (course_name, description, start_date, finish_date, task) VALUES (?,?,?,?,?)";
    private static final String SELECT_COURSE = "SELECT * FROM courses JOIN groups ON courses.id = groups.course_id JOIN teachers ON courses.id = teachers.course_id";
    private static final String DELETE_COURSE = "DELETE FROM courses WHERE id = ?";
    private static final String UPDATE_COURSE = "UPDATE courses SET course_name = ?, description = ?, start_date = ?, finish_date = ?, task = ?  WHERE id = ?";
    private static final long serialVersionUID = -6862735119582177027L;

    public CoursesDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        super();
    }

    @Override
    public boolean addCourse(Courses course) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(INSERT_COURSE);
            addCourse(pst, course);
            return pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            {
                try {
                    assert pst != null;
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean deleteCourse(Courses course) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_COURSE);
            deleteCourse(pst, course);
            return pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            {
                try {
                    assert pst != null;
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean updateCourse(Courses course) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(UPDATE_COURSE);
            updateCourse(pst, course);
            return pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            {
                try {
                    assert pst != null;
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public List<Courses> getAll() {
        List<Courses> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_COURSE);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                Courses course = new Courses(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        (LocalDate) DateTimeFormatter.ISO_DATE.parse(resultSet.getString("start_date")),
                        (LocalDate) DateTimeFormatter.ISO_DATE.parse(resultSet.getString("finish_date")),
                        resultSet.getString("task")
                );
                result.add(course);
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert st != null;
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private void addCourse(PreparedStatement pst, Courses course) throws SQLException {
        pst.setString(1, course.getCourseName());
        pst.setString(2, course.getDescription());
        pst.setString(3, course.getStartDate().format(DateTimeFormatter.ISO_DATE));
        pst.setString(4, course.getFinishDate().format(DateTimeFormatter.ISO_DATE));
        pst.setString(5, course.getTask());
    }

    private void deleteCourse(PreparedStatement pst, Courses course) throws SQLException {
        pst.setInt(1, course.getId());
    }

    private void updateCourse(PreparedStatement pst, Courses course) throws SQLException {
        pst.setString(1, course.getCourseName());
        pst.setString(2, course.getDescription());
        pst.setString(3, course.getStartDate().format(DateTimeFormatter.ISO_DATE));
        pst.setString(4, course.getFinishDate().format(DateTimeFormatter.ISO_DATE));
        pst.setString(5, course.getTask());
        pst.setInt(6, course.getId());
    }
}