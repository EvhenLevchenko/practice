package dontsee.LMSS.dao.Impl.mysql;

import attic.List.ArrayList.List;
import dontsee.LMSS.dao.TimetableDAO;
import dontsee.LMSS.dao.model.Journal;

public class TimetableDAOImplementation extends  LMSDatabase implements TimetableDAO{
    public TimetableDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    }

    @Override
    public List<Journal> getTimetable() {
        return null;
    }
}
