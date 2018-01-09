package dontsee.lms.persom;

import java.util.Scanner;


public class Course {
    private static int idCounter = 0;
    private int id;
    private String name;
    private String description;
    private Trainer trainerID;
    private String startDate;
    private String finishDate;

    public Course(int id, String name, String description, String startDate, String finishDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.trainerID = trainerID;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (id != course.id) return false;
        if (name != null ? !name.equals(course.name) : course.name != null) return false;
        if (description != null ? !description.equals(course.description) : course.description != null) return false;
        if (trainerID != null ? !trainerID.equals(course.trainerID) : course.trainerID != null) return false;
        if (startDate != null ? !startDate.equals(course.startDate) : course.startDate != null) return false;
        return finishDate != null ? finishDate.equals(course.finishDate) : course.finishDate == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (trainerID != null ? trainerID.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (finishDate != null ? finishDate.hashCode() : 0);
        return result;
    }

    @Override
    public String
    toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", trainerID=" + trainerID +
                ", startDate='" + startDate + '\'' +
                ", finishDate='" + finishDate + '\'' +
                '}';
    }

    public static Course createCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course id:");
        int id = scanner.nextInt();
        System.out.println("Enter course name:");
        String name = scanner.nextLine();
        System.out.println("Enter course description:");
        String description = scanner.nextLine();
        System.out.println("Enter start date");
        String startDate = scanner.nextLine();
        System.out.println("Enter finish date");
        String finishDate = scanner.nextLine();
        return new Course(id, name, description, startDate, finishDate);
    }

}
