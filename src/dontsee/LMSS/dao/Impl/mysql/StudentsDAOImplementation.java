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

    private static final long serialVersionUID = -5559105054162154188L;


    private static final String INSERT_STUDENT = "INSERT INTO students (first_name, second_name, last_name, age, phone_number, address ) VALUES (?,?,?,?,?,?)";
    private static final String SELECT_STUDENT = "SELECT * FROM students";
    private static final String DELETE_STUDENT = "DELETE FROM students WHERE id = ?";
    private static final String UPDATE_STUDENT = "UPDATE students SET first_name = ?, second_name = ?, last_name = ?, age = ?, phone_number = ?, address = ? WHERE id = ?";
    private static final String TRANSFORM_STUDENT = "UPDATE students SET group_id = ? WHERE group_id = ?";

    public StudentsDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        super();
        createTableStudents();
    }

    @Override
    public boolean addStudent(Students student) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(INSERT_STUDENT);
            addStudent(pst,student);
            return pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            {
                try {
                    assert pst != null;
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean deleteStudent(Students student) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(DELETE_STUDENT);
            deleteStudent(pst,student);
            return pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            {
                try {
                    assert pst != null;
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean transformStudent(Groups oldGroup, Groups newGroup) {
        PreparedStatement pst = null;
        try{
            pst = getConnection().prepareStatement(TRANSFORM_STUDENT);
            transformStudent(pst,oldGroup,newGroup);
            return pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return  false;
        }finally {
            {
                try {
                    assert pst != null;
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean updateStudent(Students student) {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(UPDATE_STUDENT);
            updateStudent(pst,student);
            return pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            {
                try {
                    assert pst != null;
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public List<Students> getAll() {
        List<Students> result = new ArrayList<>();
        Statement st = null;
        try {
            st = getConnection().createStatement();
            st.execute(SELECT_STUDENT);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                Students student = new Students(
                        resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("second_name"),
                        resultSet.getString("last_name"),
                        resultSet.getInt("age"),
                        resultSet.getString("phone_number"),
                        resultSet.getString("address")
                );
                result.add(student);
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert st != null;
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private void addStudent(PreparedStatement pst,Students student) throws SQLException {
        pst.setString(1, student.getFirstName());
        pst.setString(2, student.getSecondName());
        pst.setString(3, student.getLastName());
        pst.setInt(4, student.getAge());
        pst.setString(5, student.getPhoneNumber());
        pst.setString(6, student.getAddress());
    }

    private void deleteStudent(PreparedStatement pst,Students student) throws SQLException {
        pst.setInt(1, student.getId());
    }

    private void transformStudent(PreparedStatement pst, Groups oldGroup, Groups newGroup) throws SQLException {
        pst.setInt(1,oldGroup.getId());
        pst.setInt(2,newGroup.getId());
    }

    private void updateStudent(PreparedStatement pst, Students student) throws SQLException {
        pst.setString(1, student.getFirstName());
        pst.setString(2, student.getSecondName());
        pst.setString(3, student.getLastName());
        pst.setInt(4, student.getAge());
        pst.setString(5, student.getPhoneNumber());
        pst.setString(6, student.getAddress());
        pst.setInt(7,student.getId());
    }
}
