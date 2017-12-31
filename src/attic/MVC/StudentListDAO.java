package attic.MVC;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentListDAO implements StudentDAO {

    private List<Student> students = new ArrayList<>();


    public StudentListDAO() {
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void delete(Student student) {
        students.remove(student);
    }

    @Override
    public void update(Student student) {

        int index = students.indexOf(student);
        if (index < 0) {
            return;
        }
        students.set(index, student);
    }

    @Override
    public Student find(String studentName) {
        for (Student student : students) {
            if (student.getName().equals(studentName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Collection<Student> getAll() {
        return Collections.unmodifiableList(students);
    }
}
