// 9c. Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary
// into the table Emp of the database Employee by getting the fields through keyboard and Generate
// the report as follows for the table Emp (Emp_NO , Emp_Name, Basicsalary ) using HTML and JSP
// to get the field and display the results respectively?

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Add Employee</title></head>
<body>
    <h2>Enter Employee Details</h2>
    <form action="insert.jsp" method="post">
        Emp No: <input type="number" name="empno" required><br><br>
        Emp Name: <input type="text" name="empname" required><br><br>
        Basic Salary: <input type="number" name="salary" required><br><br>
        <input type="submit" value="Add Employee">
    </form>
    <br>
    <form action="report.jsp">
        <input type="submit" value="Generate Salary Report (Names starting with 'R')">
    </form>
</body>
</html>
