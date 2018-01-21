package dontsee.LMSS.dao.model;

import attic.List.ArrayList.List;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Courses implements Serializable {


    private static final long serialVersionUID = -7661308522188934714L;
    private int id;
    private String name;
    private String description;
    private String startDate;
    private String finishDate;
    private String task;

    public Courses(){}

    public Courses(int id, String name, String description, String startDate, String finishDate, String task) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.task = task;
    }

    public Courses(String name, String description,String startDate, String finishDate, String task) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.task = task;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
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
                '}';
    }
}
