package dontsee.LMSS.dao.model;

import java.util.Date;
import java.util.List;

public class Timetable {
    private String Days;
    private Date startLecture;
    private Date finishLecture;
    private List<Courses>course;

    public Timetable(String days, java.sql.Date startDate, java.sql.Date finishDate, Courses courses) {
    }

    public Timetable(String days, Date startLecture, Date finishLecture, List<Courses> course) {
        Days = days;
        this.startLecture = startLecture;
        this.finishLecture = finishLecture;
        this.course = course;
    }

    public String getDays() {
        return Days;
    }

    public void setDays(String days) {
        Days = days;
    }

    public Date getStartLecture() {
        return startLecture;
    }

    public void setStartLecture(Date startLecture) {
        this.startLecture = startLecture;
    }

    public Date getFinishLecture() {
        return finishLecture;
    }

    public void setFinishLecture(Date finishLecture) {
        this.finishLecture = finishLecture;
    }

    public List<Courses> getCourse() {
        return course;
    }

    public void setCourse(List<Courses> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "Days='" + Days + '\'' +
                ", startLecture=" + startLecture +
                ", finishLecture=" + finishLecture +
                ", course=" + course +
                '}';
    }
}
