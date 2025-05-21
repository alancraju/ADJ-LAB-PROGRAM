// Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
// into the table Emp of the database Employee by getting the fields through keyboard and
// Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
// HTML and JSP to get the fields and display the results respectively?

package db;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        // If your MySQL user is root with no password, leave it blank
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Employee", "root", ""
        );
    }
}
