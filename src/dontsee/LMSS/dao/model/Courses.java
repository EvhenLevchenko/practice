package dontsee.LMSS.dao.model;

import attic.List.ArrayList.List;

import java.time.LocalDate;

public class Courses {
    private int id;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate finishDate;
    private String task;
    private List<Teachers> teacher;
    private List<Groups> group;


    public Courses() {
    }

    public Courses(int id, String name, String description, LocalDate startDate, LocalDate finishDate, String task, List<Teachers> teacher, List<Groups> group) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.task = task;
        this.teacher = teacher;
        this.group = group;
    }

    public Courses(String name, String description, LocalDate startDate, LocalDate finishDate, String task, List<Teachers> teacher, List<Groups> group) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.task = task;
        this.teacher = teacher;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Teachers> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teachers> teacher) {
        this.teacher = teacher;
    }

    public List<Groups> getGroup() {
        return group;
    }

    public void setGroup(List<Groups> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", task='" + task + '\'' +
                ", teacher=" + teacher +
                ", group=" + group +
                '}';
    }
}
