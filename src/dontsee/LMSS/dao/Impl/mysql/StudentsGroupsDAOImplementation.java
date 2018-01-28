package dontsee.LMSS.dao.Impl.mysql;

import dontsee.LMSS.dao.StudentsGroupsDAO;
import dontsee.LMSS.dao.model.Groups;
import dontsee.LMSS.dao.model.Students;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentsGroupsDAOImplementation extends LMSDatabase implements Serializable, StudentsGroupsDAO {


    private static final long serialVersionUID = 6217482556190079694L;
    private static final String INSERT_TO_STUDENTS_GROUPS = "INSERT INTO students_groups(" +
            "student_id," +
            "group_id)" +
            "VALUES(?,?)";

    public StudentsGroupsDAOImplementation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        super();
    }


    @Override
    public boolean insertToStudentsGroups(Students student, Groups group) throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = getConnection().prepareStatement(INSERT_TO_STUDENTS_GROUPS);
            insertToStudentsGroups(pst, student, group);
            return pst.execute();
        } finally {
            if (pst != null) {
                pst.close();
            }
        }
    }

    private void insertToStudentsGroups(PreparedStatement pst, Students student, Groups group) throws SQLException {
        pst.setInt(1, student.getStudentId());
        pst.setInt(2, group.getGroupId());
    }
}