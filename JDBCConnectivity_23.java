package practicalJava;

import java.sql.*;

public class JDBCConnectivity_23 {
    public static void main(String[] args) {
        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicaljava", "root", "root");
            // Create the statement
            Statement stmt = con.createStatement();
            // Execute the query
            ResultSet rs = stmt.executeQuery("select * from student");
            // Iterate over the result set
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
            // Close the connection
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
