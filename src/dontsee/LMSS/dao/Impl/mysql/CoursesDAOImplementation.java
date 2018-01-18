package dontsee.LMSS.dao.Impl.mysql;

import dontsee.LMSS.dao.CoursesDAO;
import dontsee.LMSS.dao.model.Courses;
import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Teachers;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CoursesDAOImplementation extends LMSDatabase implements CoursesDAO {
    public CoursesDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    }

    private static final String INSERT_COURSES = "INSERT INTO courses (name,description,startDate,finishDate,task ) VALUES (?,?,?,?,?)";
    private static final String SELECT_COURSES = "SELECT * FROM courses";
    private static final String DELETE_COURSES = "DELETE FROM courses WHERE id=?";
    private static final String UPDATE_COURSES = "UPDATE  courses name=?,description=?,startDate=?,finishDate=?,task=?";


    @Override
    public boolean addCourse(Courses course) {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(INSERT_COURSES);
      addCourse(ps,course);
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
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_COURSES);
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
    public boolean updateCourse(Courses course) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(UPDATE_COURSES);
            updateCourse(ps, course);
            ps.execute();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }

    public List<Courses> getAll() {
        List<Courses> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_COURSES);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                Courses course = new Courses(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getDate("start_date"),
                        resultSet.getDate("finish_date"),
                        resultSet.getString("task"),
                        new Teachers(
                                resultSet.getInt("id"),
                                resultSet.getString("first_name"),
                                resultSet.getString("second_name"),
                                resultSet.getString("last_name")
                        ),
                        new Groups(
                                resultSet.getInt("id"),
                                resultSet.getString("name")
                        ));
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

    private void addCourse(PreparedStatement ps, Courses course) throws SQLException {
        ps.setString(1, course.getName());
        ps.setString(2, course.getDescription());
        ps.setDate(3, (Date) course.getStartDate());
        ps.setDate(4, (Date) course.getFinishDate());
        ps.setString(5, course.getTask());
    }
    private void deleteCourse(PreparedStatement ps, Courses course) throws SQLException {
        ps.setInt(1, course.getId());
    }
    private void updateCourse(PreparedStatement ps, Courses course) throws SQLException {
        ps.setString(1, course.getName());
        ps.setString(2, course.getDescription());
        ps.setDate(3,(Date) course.getStartDate());
        ps.setDate(4,(Date) course.getFinishDate());
        ps.setString(5, course.getTask());
    }
}
