package dontsee.LMSS.dao.model;

import java.util.Date;
import java.util.List;

public class Timetable {
    private int id;
    private String days;
    private Date startLecture;
    private Date finishLecture;
    private List<Courses> course;


    public Timetable(int id, String days, java.sql.Date start_lecture, java.sql.Date finish_lecture, Courses courses){
        this.id = id;
        this.days = days;
        this.startLecture = start_lecture;
        this.finishLecture = finish_lecture;
        this.course = (List<Courses>) courses;
    }

    public Timetable(int id ,String days, Date startLecture, Date finishLecture, List<Courses> course) {
        this.id = id;
        this.days = days;
        this.startLecture = startLecture;
        this.finishLecture = finishLecture;
        this.course = course;
    }

    public Timetable(String days, Date startDate, Date finishDate, Courses courses) {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
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
                "id=" + id +
                ", days='" + days + '\'' +
                ", startLecture=" + startLecture +
                ", finishLecture=" + finishLecture +
                ", course=" + course +
                '}';
    }
}
