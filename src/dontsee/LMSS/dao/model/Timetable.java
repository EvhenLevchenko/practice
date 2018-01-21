package dontsee.LMSS.dao.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Timetable implements Serializable {

    private static final long serialVersionUID = -6578658453852486052L;
    private int id;
    private String days;
    private String startLecture;
    private String finishLecture;

    public Timetable(){}

    public Timetable(int id, String days, String startLecture, String finishLecture) {
        this.id = id;
        this.days = days;
        this.startLecture = startLecture;
        this.finishLecture = finishLecture;
    }

    public Timetable(String days, String startLecture, String finishLecture) {
        this.days = days;
        this.startLecture = startLecture;
        this.finishLecture = finishLecture;
    }

    public String getStartLecture() {
        return startLecture;
    }

    public void setStartLecture(String startLecture) {
        this.startLecture = startLecture;
    }

    public String getFinishLecture() {
        return finishLecture;
    }

    public void setFinishLecture(String finishLecture) {
        this.finishLecture = finishLecture;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "id=" + id +
                ", days='" + days + '\'' +
                ", startLecture=" + startLecture +
                ", finishLecture=" + finishLecture +
                '}';
    }
}
