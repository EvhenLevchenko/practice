package dontsee.LMSS.dao.Impl.mysql;

import dontsee.LMSS.dao.StudentsDAO;

import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Students;


import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentsDAOImplementation extends LMSDatabase implements StudentsDAO,Serializable {


    private static final String INSERT_STUDENT = "INSERT INTO students (first_name, second_name, last_name, age, phone_number, address ) VALUES (?,?,?,?,?,?)";
    private static final String SELECT_STUDENT = "SELECT * FROM students";
    private static final String DELETE_STUDENT = "DELETE FROM students WHERE student_id = ?";
    private static final String UPDATE_STUDENT = "UPDATE students SET first_name = ?, second_name = ?, last_name = ?, age = ?, phone_number = ?, address = ? WHERE student_id = ?";
    private static final String TRANSFORM_STUDENT = "UPDATE students SET group_id = ? WHERE group_id = ?";
    private static final String SELECT_STUDENTS_FROM_GROUP = "SELECT DISTINCT students.student_id, students.first_name, students.second_name, students.last_name" +
            " FROM students, students_groups" +
            " WHERE students_groups.group_id = ?" +
            " AND students_groups.student_id = students.student_id";
    private static final long serialVersionUID = -5573673727119732920L;

    public StudentsDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        super();
    }

    @Override
    public boolean addStudent(Students student) throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(INSERT_STUDENT);
            addStudent(pst, student);
            return pst.execute();
        } finally {
            if (pst != null) {
                pst.close();
            }
        }
    }

    @Override
    public boolean deleteStudent(Students student) throws SQLException {

        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_STUDENT);
            deleteStudent(pst, student);
            return pst.execute();
        } finally {
            if (pst != null) {
                pst.close();
            }
        }
    }

    @Override
    public boolean transformStudent(Groups oldGroup, Groups newGroup) throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(TRANSFORM_STUDENT);
            transformStudent(pst, oldGroup, newGroup);
            return pst.execute();
        } finally {
            if (pst != null) {
                pst.close();
            }
        }
    }

    @Override
    public boolean updateStudent(Students student) throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(UPDATE_STUDENT);
            updateStudent(pst, student);
            return pst.execute();
        } finally {
            if (pst != null) {
                pst.close();
            }
        }
    }

    @Override
    public List<Students> selectStudentsFromGroup(Groups group) throws SQLException {
        List<Students> result = new ArrayList<>();
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(SELECT_STUDENTS_FROM_GROUP);
            pst.setInt(1, group.getGroupId());
            pst.execute();
            ResultSet resultSet = pst.getResultSet();
            selectStudentsFromGroup(resultSet, result);
            return result;
        } finally {
            if (pst != null) {
                pst.close();
            }
        }
    }

    @Override
    public List<Students> getAll() throws SQLException {
        List<Students> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_STUDENT);
            ResultSet resultSet = st.getResultSet();
            getAll(resultSet, result);
            return result;
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    private void addStudent(PreparedStatement pst, Students student) throws SQLException {
        pst.setString(1, student.getFirstName());
        pst.setString(2, student.getSecondName());
        pst.setString(3, student.getLastName());
        pst.setInt(4, student.getAge());
        pst.setString(5, student.getPhoneNumber());
        pst.setString(6, student.getAddress());
    }

    private void deleteStudent(PreparedStatement pst, Students student) throws SQLException {
        pst.setInt(1, student.getStudentId());
    }

    private void transformStudent(PreparedStatement pst, Groups oldGroup, Groups newGroup) throws SQLException {
        pst.setInt(1, oldGroup.getGroupId());
        pst.setInt(2, newGroup.getGroupId());
    }

    private void updateStudent(PreparedStatement pst, Students student) throws SQLException {
        pst.setString(1, student.getFirstName());
        pst.setString(2, student.getSecondName());
        pst.setString(3, student.getLastName());
        pst.setInt(4, student.getAge());
        pst.setString(5, student.getPhoneNumber());
        pst.setString(6, student.getAddress());
        pst.setInt(7, student.getStudentId());
    }

    private void getAll(ResultSet resultSet, List<Students> result) throws SQLException {
        while (resultSet.next()) {
            Students student = new Students(
                    resultSet.getInt("student_id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("second_name"),
                    resultSet.getString("last_name"),
                    resultSet.getInt("age"),
                    resultSet.getString("phone_number"),
                    resultSet.getString("address")
            );
            result.add(student);
        }
    }

    private void selectStudentsFromGroup(ResultSet resultSet, List<Students> result) throws SQLException {
        while (resultSet.next()) {
            Students student = new Students(
                    resultSet.getInt("student_id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("second_name"),
                    resultSet.getString("last_name")
            );
            result.add(student);
        }
    }
}
