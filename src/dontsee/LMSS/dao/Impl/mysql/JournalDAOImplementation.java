package dontsee.LMSS.dao.Impl.mysql;

import dontsee.LMSS.dao.JournalDAO;
import dontsee.LMSS.dao.model.Journal;

public class JournalDAOImplementation extends  LMSDatabase implements JournalDAO{
    public JournalDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    }

    @Override
    public boolean updateJournal(Journal journal) {
        return false;
    }
}
