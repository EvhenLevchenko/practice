package dontsee.lerningManagmentSystem.model;

//import dontsee.lerningManagmentSystem.model.Student;
//import dontsee.lerningManagmentSystem.model.Trainer;
//
//import java.util.Date;
//
//public class Courses {
//    private static int idCounter = 0;
//    private int id;
//    private String name;
//    private Journal journal;
//    private Student studentID;
//    private Trainer trainerID;
//    private Date startDate;
//    private Date finishDate;
//    DaysOfWeek daysOfWeek;
//
//
//    public Courses(int id, String name, Journal journal, Student studentID, Trainer trainerID, Date startDate, Date finishDate) {
//        this.id = id;
//        this.name = name;
//        this.journal = journal;
//        this.studentID = studentID;
//        this.trainerID = trainerID;
//        this.startDate = startDate;
//        this.finishDate = finishDate;
//    }
//
//
//    public static int getIdCounter() {
//        return idCounter;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Journal getJournal() {
//        return journal;
//    }
//
//    public Student getStudentID() {
//        return studentID;
//    }
//
//    public Trainer getTrainerID() {
//        return trainerID;
//    }
//
//    public Date getStartDate() {
//        return startDate;
//    }
//
//    public Date getFinishDate() {
//        return finishDate;
//    }
//
//    @Override
//    public String toString() {
//        return "Courses{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", journal=" + journal +
//                ", studentID=" + studentID +
//                ", trainerID=" + trainerID +
//                ", startDate=" + startDate +
//                ", finishDate=" + finishDate +
//                ", daysOfWeek=" + daysOfWeek +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Courses courses = (Courses) o;
//
//        if (id != courses.id) return false;
//        if (name != null ? !name.equals(courses.name) : courses.name != null) return false;
//        if (journal != null ? !journal.equals(courses.journal) : courses.journal != null) return false;
//        if (studentID != null ? !studentID.equals(courses.studentID) : courses.studentID != null) return false;
//        if (trainerID != null ? !trainerID.equals(courses.trainerID) : courses.trainerID != null) return false;
//        if (startDate != null ? !startDate.equals(courses.startDate) : courses.startDate != null) return false;
//        if (finishDate != null ? !finishDate.equals(courses.finishDate) : courses.finishDate != null) return false;
//        return daysOfWeek == courses.daysOfWeek;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (journal != null ? journal.hashCode() : 0);
//        result = 31 * result + (studentID != null ? studentID.hashCode() : 0);
//        result = 31 * result + (trainerID != null ? trainerID.hashCode() : 0);
//        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
//        result = 31 * result + (finishDate != null ? finishDate.hashCode() : 0);
//        result = 31 * result + (daysOfWeek != null ? daysOfWeek.hashCode() : 0);
//        return result;
//    }
//
//    public DaysOfWeek getDaysOfWeek() {
//        return daysOfWeek;
//    }
//}
