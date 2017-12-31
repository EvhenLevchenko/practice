package attic.MVC;

public class Client {
    public static void main(String[] args) {

        Student student0 = new Student("Boris", "K");
        Student student1 = new Student("Vova", "I");
        Student student2 = new Student("Ignat", "O");
        Student student3 = new Student("Gerald", "p");

        StudentDAO studentDAO = new StudentListDAO();


        studentDAO.add(student0);
        studentDAO.add(student1);
        studentDAO.add(student2);
        studentDAO.add(student3);

        System.out.println("-------------------------");
        for (Student student : studentDAO.getAll()) {
            System.out.println(student);
        }

        studentDAO.delete(student0);
        student1.setGroup("nhglgng");

        System.out.println("--------------------------");
        for (Student student : studentDAO.getAll()) {
            System.out.println(student);
        }

        System.out.println("------------------");
        System.out.println(studentDAO.find("Vova"));

    }
}
