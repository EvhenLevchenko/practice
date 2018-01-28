package dontsee.LMSS.dao;



import dontsee.LMSS.dao.model.Timetable;

import java.sql.SQLException;
import java.util.List;

public interface TimetableDAO{
    boolean addTimetable(Timetable timetable);
    boolean deleteTimetable(Timetable timetable);
    boolean updateTimetable(Timetable timetable);
    List<Timetable> getTimetable();
}
