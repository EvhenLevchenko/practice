package dontsee.LMSS;

import dontsee.LMSS.dao.Impl.mysql.StudentsDAOImplementation;
import dontsee.LMSS.dao.StudentsDAO;
import dontsee.LMSS.dao.model.Students;

import java.sql.SQLException;

public class Controller {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        StudentsDAO studentsDAO = new StudentsDAOImplementation();

        Students st1 = new Students("Max","Malikov","Dmitrievich",20,"0991234567","shevchenko street");
        Students st2 = new Students("Evgen","Levchenko","Alexandrovich",18,"0991343545454","street");

        studentsDAO.addStudent(st1);
        studentsDAO.addStudent(st2);

        System.out.println(studentsDAO.getAll());
    }
}
