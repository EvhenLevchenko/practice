package dontsee.LMSS.dao.Impl.mysql;

import dontsee.LMSS.dao.JournalDAO;
import dontsee.LMSS.dao.model.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JournalDAOImplementation extends  LMSDatabase implements JournalDAO{

    private static final String INSERT_JOURNAL = "INSERT INTO journal (name) VALUES (?)";
    private static final String SELECT_JOURNAL = "SELECT * FROM journal";
    private static final String DELETE_JOURNAL = "DELETE FROM journal WHERE id=?";
    private static final String UPDATE_JOURNAL = "UPDATE  journal name=?,description=?,startDate=?,finishDate=?,task=?";

    public JournalDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    }

    @Override
    public boolean updateJournal(Journal journal) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(UPDATE_JOURNAL);
            updateJournal(ps, journal);
            ps.execute();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }

    @Override
    public boolean addJournal(Journal journal) {
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(INSERT_JOURNAL);
            addJournal(ps,journal);
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
    public boolean deleteJournal(Journal journal) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_JOURNAL);
            deleteJournal(pst,journal);
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
    public List<Journal> getAll() throws SQLException {
        List<Journal> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_JOURNAL);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                Journal journal = new Journal(
                        resultSet.getInt("id"),
                        resultSet.getInt("mark"),
                        new Courses(
                                resultSet.getInt("id"),
                                resultSet.getString("name")
                        ),
                        new Teachers(
                                resultSet.getInt("id"),
                                resultSet.getString("first_name"),
                                resultSet.getString("second_name"),
                                resultSet.getString("last_name")
                        ),
                        new Groups(
                                resultSet.getInt("id"),
                                resultSet.getString("name"),
                                new Students(
                                        resultSet.getInt("id"),
                                        resultSet.getString("first_name"),
                                        resultSet.getString("second_name"),
                                        resultSet.getString("last_name")
                                )
                        ));
                result.add(journal);
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

    private void addJournal(PreparedStatement ps, Journal journal) throws SQLException {
        ps.setInt(1, journal.getMark());
    }
    private void deleteJournal(PreparedStatement ps, Journal journal) throws SQLException {
        ps.setInt(1, journal.getId());
    }
    private void updateJournal(PreparedStatement ps, Journal journal) throws SQLException {
        ps.setInt(1, journal.getMark());
        ps.setInt(2, journal.getId());

    }
}
