package dontsee.LMSS.dao.model;

import attic.List.ArrayList.List;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Courses implements Serializable {

    private static final long serialVersionUID = 5208714252564662373L;
    private int id;
    private String courseName;
    private String description;
    private LocalDate startDate;
    private LocalDate finishDate;
    private String task;
    private Groups group;

    public Courses(){}

    public Courses(int id, String courseName, String description, LocalDate startDate, LocalDate finishDate, String task) {
        this.id = id;
        this.courseName = courseName;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.task = task;
    }

    public Courses(String courseName, String description,LocalDate startDate, LocalDate finishDate, String task) {
        this.courseName = courseName;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.task = task;
    }

    public Courses(String courseName, String description, LocalDate startDate, LocalDate finishDate, String task, Groups group) {
        this.courseName = courseName;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.task = task;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", startDate='" + startDate + '\'' +
                ", finishDate='" + finishDate + '\'' +
                ", task='" + task + '\'' +
                ", group=" + group +
                '}';
    }
}
