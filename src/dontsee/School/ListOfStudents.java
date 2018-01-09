package dontsee.School;

import attic.List.ArrayList.List;
import attic.List.ArrayList.NewArrayList;
import dontsee.lms.persom.Student;

import java.time.LocalDate;

public class ListOfStudents {
    private static List<Student> students = new NewArrayList<>();

    static {
        students.add(new Student("Mario", "Ko", 1564));
        students.add(new Student("Kim", "Chen", 1564));


    }
    protected static List<Student> getStudents() {
        return students;
    }
}
