package dontsee.LMSS.dao;

import dontsee.LMSS.dao.model.Journal;

import java.sql.SQLException;
import java.util.List;

public interface JournalDAO {
    boolean updateJournal(Journal journal) throws SQLException;
    boolean addJournal(Journal journal);
    boolean deleteJournal(Journal journal);
    List<Journal> getAll() throws SQLException;

}
