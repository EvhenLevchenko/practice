package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Journal;

import java.sql.SQLException;
import java.util.List;

public interface JournalDAO {
    boolean addJournal(Journal journal) throws SQLException;
    boolean deleteJournal(Journal journal) throws SQLException;
    boolean updateJournal(Journal journal) throws SQLException;
    List<Journal> getAll() throws SQLException;

}
