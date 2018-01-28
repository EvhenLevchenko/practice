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


    private static final String INSERT_JOURNAL = "INSERT INTO journal (mark) VALUES (?)";
    private static final String SELECT_JOURNAL = "SELECT * FROM journal";
    private static final String DELETE_JOURNAL = "DELETE FROM journal WHERE id = ?";
    private static final String UPDATE_JOURNAL = "UPDATE journal SET mark = ? WHERE id = ?";
    private static final long serialVersionUID = -7487200902832522477L;


    public JournalDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        super();
    }

    @Override
    public boolean addJournal(Journal journal) throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(INSERT_JOURNAL);
            addJournal(pst, journal);
            return pst.execute();
        } finally {
            {
                if (pst != null) {
                    pst.close();
                }
            }
        }
    }

    @Override
    public boolean deleteJournal(Journal journal) throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_JOURNAL);
            deleteJournal(pst, journal);
            return pst.execute();
        } finally {
            {
                if (pst != null) {
                    pst.close();
                }
            }
        }
    }

    @Override
    public boolean updateJournal(Journal journal) throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(UPDATE_JOURNAL);
            updateJournal(pst, journal);
            return pst.execute();
        } finally {
            {
                if (pst != null) {
                    pst.close();
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
            getAll(resultSet,result);
            return result;
        } finally {
            if(st != null){
                st.close();
            }
        }
    }

    private void addJournal(PreparedStatement pst, Journal journal) throws SQLException {
        pst.setInt(1, journal.getMark());
    }

    private void deleteJournal(PreparedStatement pst, Journal journal) throws SQLException {
        pst.setInt(1, journal.getId());
    }

    private void updateJournal(PreparedStatement pst, Journal journal) throws SQLException {
        pst.setInt(1, journal.getMark());
        pst.setInt(2, journal.getId());
    }

    private void getAll(ResultSet resultSet, List<Journal> result) throws SQLException {
        while (resultSet.next()) {
            Journal journal = new Journal(
                    resultSet.getInt("id"),
                    resultSet.getInt("mark")
            );
            result.add(journal);
        }
    }
}
