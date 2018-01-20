package dontsee.LMSS.dao.Impl.mysql;


import dontsee.LMSS.dao.TimetableDAO;
import dontsee.LMSS.dao.model.Courses;
import dontsee.LMSS.dao.model.Timetable;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TimetableDAOImplementation extends LMSDatabase implements TimetableDAO {
    private static final String INSERT_TIMETABLE = "INSERT INTO timetable (days, start_lecture, finish_lecture) VALUES (?,?,?)";
    private static final String SELECT_TIMETABLE = "SELECT * FROM timetable";
    private static final String DELETE_TIMETABLE = "DELETE FROM timetable WHERE days = ?";
    private static final String UPDATE_TIMETABLE = "UPDATE timetable SET start_lecture = ?, finish_lecture = ? WHERE days = ?";

    public TimetableDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    }


    @Override
    public List<Timetable> getTimetable() {
        List<Timetable> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_TIMETABLE);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                Timetable timetablenal = new Timetable(
                        resultSet.getString("days"),
                        resultSet.getDate("startDate"),
                        resultSet.getDate("finishDate"),
                        new Courses(
                                resultSet.getInt("id"),
                                resultSet.getString("name")
                        )
                );
                result.add(timetablenal);
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

    @Override
    public boolean addTimetable(Timetable timetable) {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(INSERT_TIMETABLE);
            addTimetable(ps, timetable);
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
    public boolean deleteTimetable(Timetable timetable) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_TIMETABLE);
            deleteTimetable(pst, timetable);
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
    public boolean updateTimetable(Timetable timetable) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(UPDATE_TIMETABLE);
            updateTimetable(ps, timetable);
            ps.execute();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
        return false;

    }


    private void addTimetable(PreparedStatement ps, Timetable timetable) throws SQLException {
        ps.setString(1, timetable.getDays());
        ps.setDate(2, (Date) timetable.getStartLecture());
        ps.setDate(3, (Date) timetable.getFinishLecture());

    }

    private void deleteTimetable(PreparedStatement ps, Timetable timetable) throws SQLException {
        ps.setString(1, timetable.getDays());
    }

    private void updateTimetable(PreparedStatement ps, Timetable timetable) throws SQLException {
        ps.setDate(1, (Date) timetable.getStartLecture());
        ps.setDate(2, (Date) timetable.getFinishLecture());
        ps.setString(3, timetable.getDays());

    }
}
