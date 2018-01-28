package dontsee.LMSS.dao.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;


public class Timetable implements Serializable {


    private static final long serialVersionUID = 8004675338711978956L;
    private int id;
    private String days;
    private LocalDate startLecture;
    private LocalDate finishLecture;
    private Courses course;

    public Timetable(){}

    public Timetable(int id, String days, LocalDate startLecture, LocalDate finishLecture) {
        this.id = id;
        this.days = days;
        this.startLecture = startLecture;
        this.finishLecture = finishLecture;
    }

    public Timetable(String days, LocalDate startLecture, LocalDate finishLecture) {
        this.days = days;
        this.startLecture = startLecture;
        this.finishLecture = finishLecture;
    }

    public Timetable(String days, LocalDate startLecture, LocalDate finishLecture, Courses course) {
        this.days = days;
        this.startLecture = startLecture;
        this.finishLecture = finishLecture;
        this.course = course;
    }

    public LocalDate getStartLecture() {
        return startLecture;
    }

    public void setStartLecture(LocalDate startLecture) {
        this.startLecture = startLecture;
    }

    public LocalDate getFinishLecture() {
        return finishLecture;
    }

    public void setFinishLecture(LocalDate finishLecture) {
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

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "id=" + id +
                ", days='" + days + '\'' +
                ", startLecture='" + startLecture + '\'' +
                ", finishLecture='" + finishLecture + '\'' +
                ", course=" + course +
                '}';
    }
}
