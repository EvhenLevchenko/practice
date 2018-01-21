package dontsee.LMSS.dao.Impl.mysql;

import dontsee.LMSS.dao.JournalDAO;
import dontsee.LMSS.dao.model.*;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JournalDAOImplementation extends  LMSDatabase implements JournalDAO,Serializable {

    private static final long serialVersionUID = -1005105079029085202L;
    private static final String INSERT_JOURNAL = "INSERT INTO journal (mark) VALUES (?)";
    private static final String SELECT_JOURNAL = "SELECT * FROM journal";
    private static final String DELETE_JOURNAL = "DELETE FROM journal WHERE id = ?";
    private static final String UPDATE_JOURNAL = "UPDATE journal SET mark = ? WHERE id = ?";


    public JournalDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        super();
        createTableJournal();
    }

    @Override
    public boolean addJournal(Journal journal) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(INSERT_JOURNAL);
            addJournal(pst, journal);
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
    public boolean deleteJournal(Journal journal) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_JOURNAL);
            deleteJournal(pst, journal);
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
    public boolean updateJournal(Journal journal) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(UPDATE_JOURNAL);
            updateJournal(pst, journal);
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
    public List<Journal> getAll() {
        List<Journal> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_JOURNAL);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                Journal journal = new Journal(
                        resultSet.getInt("id"),
                        resultSet.getInt("mark")
                );
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

    private void addJournal(PreparedStatement pst,Journal journal) throws SQLException {
        pst.setInt(1, journal.getMark());
    }

    private void deleteJournal(PreparedStatement pst, Journal journal) throws SQLException {
        pst.setInt(1, journal.getId());
    }

    private void updateJournal(PreparedStatement pst, Journal journal) throws  SQLException{
        pst.setInt(1, journal.getMark());
        pst.setInt(2, journal.getId());
    }
}
