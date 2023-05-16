
package dbprogramming2;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

public class Lab12 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "mysql@sit";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "Insert into student(studentID,firstname,lastname,email,deptID)"
                    + "values(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "111111");
            preparedStatement.setString(2, "aaaa");
            preparedStatement.setString(3, "bbbb");
            preparedStatement.setString(4, "aaaa@gmail.com");
            preparedStatement.setString(5, "IT");
            
            preparedStatement.executeUpdate();


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
