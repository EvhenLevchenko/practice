package dontsee.LMSS.dao.model;

import attic.List.ArrayList.List;

public class Journal {
    private  int id;
    private int mark;
    private List<Courses>course;
    private List<Groups>groups;

    public Journal() {
    }

    public Journal(int mark, List<Courses> course, List<Groups> groups) {
        this.mark = mark;
        this.course = course;
        this.groups = groups;
    }

    public Journal(int id, int mark, List<Courses> course, List<Groups> groups) {
        this.id = id;
        this.mark = mark;
        this.course = course;
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public List<Courses> getCourse() {
        return course;
    }

    public void setCourse(List<Courses> course) {
        this.course = course;
    }

    public List<Groups> getGroups() {
        return groups;
    }

    public void setGroups(List<Groups> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "id=" + id +
                ", mark=" + mark +
                ", course=" + course +
                ", groups=" + groups +
                '}';
    }
}
