// 8d. Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
// the table Emp of the database Employee using HTML and JSP to get the fields and display the
// results respectively?

package db;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Employee", "root", ""  // Use your MySQL password if set
        );
    }
}
