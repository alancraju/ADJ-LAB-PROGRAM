// 9a. Read all the existing records from the table coffee which is from the database test and delete
// an existing coffee product from the table with its id and display the rest of the records using
// HTML and JSP to get the field and display the results respectively?

<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mysql://localhost:3306/test";
    String user = "root";
    String password = ""; // Default XAMPP MySQL has no password

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection(url, user, password);
%>
