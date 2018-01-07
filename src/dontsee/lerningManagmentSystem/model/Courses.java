package dontsee.lerningManagmentSystem.model;

//import dontsee.lerningManagmentSystem.model.Student;
//import dontsee.lerningManagmentSystem.model.Trainer;
//
import java.util.Date;
import java.util.Objects;


public class Courses {
    private static int idCounter=0;
    private int id;
    private String name;
    private Journal journal;
    private Student studentID;
    private Trainer trainerID;
    private Date startDate;
    private Date finishDate;
    private DaysOfWeek daysOfWeek;

    public Courses(String name, Journal journal, Student studentID, Trainer trainerID, Date startDate, Date finishDate) {
        this.id = ++idCounter;
        this.name = name;
        this.journal = journal;
        this.studentID = studentID;
        this.trainerID = trainerID;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Journal getJournal() {
        return journal;
    }

    public Student getStudentID() {
        return studentID;
    }

    public Trainer getTrainerID() {
        return trainerID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", journal=" + journal +
                ", studentID=" + studentID +
                ", trainerID=" + trainerID +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", daysOfWeek=" + daysOfWeek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courses courses = (Courses) o;
        return id == courses.id &&
                Objects.equals(name, courses.name) &&
                Objects.equals(journal, courses.journal) &&
                Objects.equals(studentID, courses.studentID) &&
                Objects.equals(trainerID, courses.trainerID) &&
                Objects.equals(startDate, courses.startDate) &&
                Objects.equals(finishDate, courses.finishDate) &&
                daysOfWeek == courses.daysOfWeek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, journal, studentID, trainerID, startDate, finishDate, daysOfWeek);
    }
}