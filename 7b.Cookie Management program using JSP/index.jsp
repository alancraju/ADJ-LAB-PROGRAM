// 7b. Construct a Cookie Management program using JSP to get the fields Name, Domain and Max
// Expiry Age ( in sec) and press the button Add Cookie for displaying the set cookie information. Then
// it has to go to show the active cookie list when you press the link go to the active cookie list?
  
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cookie List Management</title>
    <style>
        .cookie-table {
            border-collapse: collapse;
            width: 60%;
            margin: 20px 0;
        }
        .cookie-table th, .cookie-table td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        .cookie-table th {
            background-color: #f2f2f2;
        }
        .form-group {
            margin: 10px 0;
        }
        .auto-refresh {
            color: #666;
            font-size: 0.9em;
            margin-bottom: 10px;
        }
    </style>
    <script>
        // Auto refresh page every 1 second
        setTimeout(function () {
            window.location.reload();
        }, 1000);
    </script>
</head>
<body>
    <h2>Cookie List Management</h2>

    <!-- Form to set cookies -->
    <form action="setCookie.jsp" method="post">
        <h3>Set New Cookie</h3>
        <table>
            <tr>
                <td><label for="cookieName">Cookie Name:</label></td>
                <td><input type="text" name="cookieName" required></td>
            </tr>
            <tr>
                <td><label for="domain">Domain:</label></td>
                <td><input type="text" name="domain" required></td>
            </tr>
            <tr>
                <td><label for="maxAge">Max Age (seconds):</label></td>
                <td><input type="number" name="maxAge" value="100" required></td>
            </tr>
        </table>
        <input type="submit" value="Add Cookie">
    </form>

    <hr>

    <!-- Display cookie list -->
    <h3>List of Active Cookies</h3>
    <p class="auto-refresh">List updates automatically when cookies expire</p>
    <table class="cookie-table">
        <thead>
            <tr>
                <th>Cookie Name</th>
                <th>Domain</th>
                <th>Max Age (seconds)</th>
            </tr>
        </thead>
        <tbody>
        <%
            List<Map<String, String>> cookieList = (List<Map<String, String>>) session.getAttribute("cookieList");
            long currentTime = System.currentTimeMillis() / 1000;

            if (cookieList != null) {
                Iterator<Map<String, String>> iterator = cookieList.iterator();
                while (iterator.hasNext()) {
                    Map<String, String> cookie = iterator.next();
                    long setTime = Long.parseLong(cookie.get("setTime"));
                    int maxAge = Integer.parseInt(cookie.get("maxAge"));
                    if (currentTime > setTime + maxAge) {
                        iterator.remove();
                    }
                }
                session.setAttribute("cookieList", cookieList);
            }

            if (cookieList != null && !cookieList.isEmpty()) {
                for (Map<String, String> cookie : cookieList) {
        %>
        <tr>
            <td><%= cookie.get("name") %></td>
            <td><%= cookie.get("domain") %></td>
            <td><%= cookie.get("maxAge") %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="3" style="text-align:center;">No active cookies</td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</body>
</html>
