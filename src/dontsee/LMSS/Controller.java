package dontsee.LMSS;


import dontsee.LMSS.dao.*;
import dontsee.LMSS.dao.Impl.mysql.*;
import dontsee.LMSS.dao.model.*;

import java.sql.SQLException;


public class Controller {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

        LMSDatabase lmsDatabase = new LMSDatabase();
        lmsDatabase.createDatabase();

        StudentsDAO studentsDAO = new StudentsDAOImplementation();

//        studentsDAO.addStudent(st1);
//        studentsDAO.addStudent(st2);
//        studentsDAO.addStudent(st3);

//        studentsDAO.deleteStudent(st1);

//
//        studentsDAO.updateStudent(st1);
//        studentsDAO.updateStudent(st2);
//        studentsDAO.updateStudent(st3);
//
//
        //       System.out.println(studentsDAO.getAll());

//        GroupsDAO groupsDAO = new GroupsDAOImplementation();
//        StudentsGroupsDAO studentsGroupsDAO = new StudentsGroupsDAOImplementation();
//
//        Students st1 = new Students(2);
//        Students st2 = new Students(3);
//        Students st3 = new Students(4);
//
//        Groups gp1 = new Groups(1,"J1");
//        Groups gp2 = new Groups(2,"C#1");
//        Groups gp3 = new Groups(3,"J1");
//
//        studentsGroupsDAO.insertToStudentsGroups(st1,gp1);
//        studentsGroupsDAO.insertToStudentsGroups(st2,gp1);
//        studentsGroupsDAO.insertToStudentsGroups(st3,gp2);

//        groupsDAO.addGroup(gp1);
//        groupsDAO.addGroup(gp2);
//        groupsDAO.addGroup(gp3);
//
//        System.out.println(groupsDAO.getAll());
//        List<Students> students = studentsDAO.selectStudentsFromGroup(gp2);
//        for(Students p : students){
//            System.out.println(p.getStudentId());
//            System.out.println(p.getFirstName());
//            System.out.println(p.getSecondName());
//            System.out.println(p.getLastName());
//        }

//
//        teachersDAO.addTeacher(tch1);
//        teachersDAO.addTeacher(tch2);
//
//        System.out.println(teachersDAO.getAll());
//

//        coursesDAO.addCourse(cs1);
//        coursesDAO.addCourse(cs2);
//
//        System.out.println(coursesDAO.getAll());
//
//        JournalDAO journalDAO = new JournalDAOImplementation();
//
//        Journal j1 = new Journal(10);
//        Journal j2 = new Journal(12);
//
//        journalDAO.addJournal(j1);
//        journalDAO.addJournal(j2);
//
//        System.out.println(journalDAO.getAll());
//
//        TimetableDAO timetableDAO = new TimetableDAOImplementation();
//
//        Timetable tm1 = new Timetable("Monday","12:00:00","15:00:00\n");
//        Timetable tm2 = new Timetable("Tuesday","15:00:00","18:00:00");
//
//        timetableDAO.addTimetable(tm1);
//        timetableDAO.addTimetable(tm2);
//
//        System.out.println(timetableDAO.getTimetable()



    }
}