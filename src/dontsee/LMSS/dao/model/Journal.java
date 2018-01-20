package dontsee.LMSS.dao.model;

import attic.List.ArrayList.List;

public class Journal {
    private int id;
    private int mark;
    private List<Courses> course;
    private List<Groups> group;
    List<Teachers> teacher;

    public Journal() {
    }

    public Journal(int id, int mark, Courses courses, Teachers teachers, Groups groups){
        this.id = id;
        this.mark = mark;
        this.course = (List<Courses>) courses;
        this.teacher = (List<Teachers>) teachers;
        this.group = (List<Groups>) groups;
    }

    public Journal(int id, int mark, List<Courses> course, List<Groups> group) {
        this.id = id;
        this.mark = mark;
        this.course = course;
        this.group = group;
    }

    public Journal(int mark, List<Courses> course, List<Groups> group) {
        this.mark = mark;
        this.course = course;
        this.group = group;
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

    public List<Groups> getGroup() {
        return group;
    }

    public void setGroups(List<Groups> groups) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "id=" + id +
                ", mark=" + mark +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
