import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
   Class.forName("org.h2.Driver").newInstance();

        Connection connection= DriverManager.getConnection("jdbc:h2:mem:test","","");

        Statement st=connection.createStatement();
        st.execute("SHOW DATABASES");
    }
}
