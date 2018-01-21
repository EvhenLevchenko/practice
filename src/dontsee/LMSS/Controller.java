package dontsee.LMSS;

import dontsee.LMSS.dao.*;
import dontsee.LMSS.dao.Impl.mysql.*;
import dontsee.LMSS.dao.model.*;

import java.sql.SQLException;

public class Controller {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        StudentsDAO studentsDAO = new StudentsDAOImplementation();

        Students st1 = new Students("Max","Malikov","Dmitrievich",20,"0991234567","shevchenko street\n");
        Students st2 = new Students("Evgen","Levchenko","Alexandrovich",18,"0991343545454","street");

        studentsDAO.addStudent(st1);
        studentsDAO.addStudent(st2);

        System.out.println(studentsDAO.getAll());

        TeachersDAO teachersDAO = new TeachersDAOImplementation();

        Teachers tch1 = new Teachers("Ivan","Moklak","Petrovich","09912132434\n");
        Teachers tch2 = new Teachers("Igor","Turckin","Borisovich","099756345234");

        teachersDAO.addTeacher(tch1);
        teachersDAO.addTeacher(tch2);

        System.out.println(teachersDAO.getAll());

        CoursesDAO coursesDAO = new CoursesDAOImplementation();

        Courses cs1 = new Courses("Java","qwertyuiop[asdfghjkl;zxcvbnm,.","01.01.2018","03.01.2018", "create prog\n");
        Courses cs2 = new Courses("C#","q/.,mnbvcxz';lkjhgfdsa][poiuytrewq","04.01.2018","06.01.2018", "create prog");

        coursesDAO.addCourse(cs1);
        coursesDAO.addCourse(cs2);

        System.out.println(coursesDAO.getAll());

        GroupsDAO groupsDAO = new GroupsDAOImplementation();

        Groups gp1 = new Groups("J1/n");
        Groups gp2 = new Groups("C#1");

        groupsDAO.addGroup(gp1);
        groupsDAO.addGroup(gp2);

        System.out.println(groupsDAO.getAll());

        JournalDAO journalDAO = new JournalDAOImplementation();

        Journal j1 = new Journal(10);
        Journal j2 = new Journal(12);

        journalDAO.addJournal(j1);
        journalDAO.addJournal(j2);

        System.out.println(journalDAO.getAll());

        TimetableDAO timetableDAO = new TimetableDAOImplementation();

        Timetable tm1 = new Timetable("Monday","12:00:00","15:00:00\n");
        Timetable tm2 = new Timetable("Tuesday","15:00:00","18:00:00");

        timetableDAO.addTimetable(tm1);
        timetableDAO.addTimetable(tm2);

        System.out.println(timetableDAO.getTimetable());
    }
}