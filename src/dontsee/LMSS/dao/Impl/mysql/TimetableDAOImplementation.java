package dontsee.LMSS.dao.Impl.mysql;


import dontsee.LMSS.dao.TimetableDAO;
import dontsee.LMSS.dao.model.Courses;
import dontsee.LMSS.dao.model.Timetable;
import javafx.scene.input.DataFormat;

import java.io.Serializable;
import java.sql.*;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TimetableDAOImplementation extends LMSDatabase implements TimetableDAO, Serializable {


    private static final String INSERT_TIMETABLE = "INSERT INTO timetable (days, start_lecture, finish_lecture) VALUES (?,?,?)";
    private static final String SELECT_TIMETABLE = "SELECT * FROM timetable";
    private static final String DELETE_TIMETABLE = "DELETE FROM timetable WHERE id = ?";
    private static final String UPDATE_TIMETABLE = "UPDATE timetable SET days = ?, start_lecture = ?, finish_lecture = ? WHERE id = ?";
    private static final long serialVersionUID = -7532368520133108523L;


    public TimetableDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        super();
    }

    @Override
    public boolean addTimetable(Timetable timetable) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(INSERT_TIMETABLE);
            addTimetable(pst, timetable);
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
    public boolean updateTimetable(Timetable timetable) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(UPDATE_TIMETABLE);
            updateTimetable(pst, timetable);
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
    public List<Timetable> getTimetable() {
        List<Timetable> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_TIMETABLE);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                Timetable timetable = new Timetable(
                        resultSet.getInt("id"),
                        resultSet.getString("days"),
                        (LocalDate) DateTimeFormatter.ISO_LOCAL_TIME.parse(resultSet.getString("start_lecture")),
                        (LocalDate) DateTimeFormatter.ISO_LOCAL_TIME.parse(resultSet.getString("finish_lecture"))
                );
                result.add(timetable);
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

    private void addTimetable(PreparedStatement pst, Timetable timetable) throws SQLException {
        pst.setString(1, timetable.getDays());
        pst.setString(2, timetable.getStartLecture().format(DateTimeFormatter.ISO_LOCAL_TIME));
        pst.setString(3, timetable.getFinishLecture().format(DateTimeFormatter.ISO_LOCAL_TIME));
    }

    private void deleteTimetable(PreparedStatement pst, Timetable timetable) throws SQLException {
        pst.setString(1, timetable.getDays());
    }

    private void updateTimetable(PreparedStatement pst, Timetable timetable) throws SQLException {
        pst.setString(1, timetable.getStartLecture().format(DateTimeFormatter.ISO_LOCAL_TIME));
        pst.setString(2, timetable.getFinishLecture().format(DateTimeFormatter.ISO_LOCAL_TIME));
        pst.setString(3, timetable.getDays());
    }

}
