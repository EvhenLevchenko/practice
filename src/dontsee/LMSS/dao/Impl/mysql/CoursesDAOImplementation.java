package dontsee.LMSS.dao.Impl.mysql;

import dontsee.LMSS.dao.CoursesDAO;
import dontsee.LMSS.dao.model.Courses;
import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Teachers;

import java.io.Serializable;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CoursesDAOImplementation extends LMSDatabase implements CoursesDAO,Serializable {


    private static final long serialVersionUID = -4922174685627863354L;

    private static final String INSERT_COURSE = "INSERT INTO courses (name, description, start_date, finish_date, task) VALUES (?,?,?,?,?)";
    private static final String SELECT_COURSE = "SELECT * FROM courses";
    private static final String DELETE_COURSE = "DELETE FROM courses WHERE id = ?";
    private static final String UPDATE_COURSE = "UPDATE courses SET name = ?, description = ?, start_date = ?, finish_date = ?, task = ?  WHERE id = ?";

    public CoursesDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        super();
        createTableCourses();
    }

    @Override
    public boolean addCourse(Courses course) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(INSERT_COURSE);
            addCourse(pst,course);
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
            deleteCourse(pst,course);
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
            updateCourse(pst,course);
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
                        resultSet.getString("start_date"),
                        resultSet.getString("finish_date"),
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
        pst.setString(1, course.getName());
        pst.setString(2, course.getDescription());
        pst.setString(3, course.getStartDate());
        pst.setString(4, course.getFinishDate());
        pst.setString(5, course.getTask());
    }

    private void deleteCourse(PreparedStatement pst, Courses course) throws SQLException {
        pst.setInt(1, course.getId());
    }

    private void updateCourse(PreparedStatement pst, Courses course) throws SQLException {
        pst.setString(1, course.getName());
        pst.setString(2, course.getDescription());
        pst.setString(3, course.getStartDate());
        pst.setString(4, course.getFinishDate());
        pst.setString(5, course.getTask());
        pst.setInt(6,course.getId());
    }
}