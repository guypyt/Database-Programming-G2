
package dbprogramming2;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab10 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "mysql@sit";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String sql = "Update student Set email = 'aaaa@kmutt.ac.th' Where studentID = '650062'";
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
