// 9b. Read all the existing records from the table coffee which is from the database test and query
// coffee name starting with ‘D’ in the table using HTML and JSP to get the field and display the
// results respectively?

<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mysql://localhost:3306/test";
    String user = "root";
    String password = ""; // XAMPP default has no password

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection(url, user, password);
%>
