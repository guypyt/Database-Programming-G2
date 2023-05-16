package dbprogramming2;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class Lab7 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "mysql@sit";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String sql = "Select * from student";
            ResultSet results = statement.executeQuery(sql);
            while(results.next()){
                System.out.println(results.getString(1) + " " +
                        results.getString(2) + " " +
                        results.getString(3) + " " +
                        results.getString(4) + " " +
                        results.getString(5));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}