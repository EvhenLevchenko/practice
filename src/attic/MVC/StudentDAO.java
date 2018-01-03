package attic.MVC;

import java.util.Collection;
import java.util.Collections;

public interface StudentDAO {

    void add(Student student);

    void delete(Student student);

    void update(Student student);

   Student  find(String studentName);

   Collection<Student> getAll();

}
