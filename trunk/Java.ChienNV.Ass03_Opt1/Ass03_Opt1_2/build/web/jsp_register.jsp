<%--
    Document   : jsp_register
    Created on : Apr 13, 2014, 10:30:10 AM
    Author     : Small
--%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 
<html>
<head>
<title>Register Success</title>
</head>
<body>
    
    <%@page language="java" import="java.sql.*, javax.sql.*, java.io.*, javax.naming.* " %>
    <%@page isErrorPage="true"%>
    
    <% 
        String _sAcccount = session.getAttribute("sAccount").toString();
        String _sFirstName = session.getAttribute("sFirstName").toString();
        String _sLastName = session.getAttribute("sLastName").toString();
        String _sEmail = session.getAttribute("sEmail").toString();
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            Connection con = DriverManager.getConnection("jdbc:odbc:accTraine");
            Connection con = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" 
                        + application.getRealPath("WEB-INF/Traine.accdb"));
            
            String sInsert = "INSERT INTO tbUser VALUES('"
                    + _sAcccount + "', '" + _sFirstName + "',"
                    + "'" + _sLastName + "', '" + _sEmail + "')";
            Statement stat = con.createStatement();
            int _nResult = stat.executeUpdate(sInsert);
            if(_nResult > 0){
    %>
        <h1> You have registered successfully!!! </h1
        <p> Wait for 5 seconds and you'll be taken to login page... <span id="spTime">5</span> seconds</p>
    <%
            }
            
            stat.close();
            con.close();
        }
        catch(Exception e)
        {
    %>
        <h1> You have not registered successfully!!! </h1
        <p> Wait for 5 seconds and you'll be taken to login page... <span id="spTime">5</span> seconds</p>
    <%
            out.println("ERROR! " + e.getMessage());
        }
    %>

    <script type="text/javascript">
        var time = 5;
        document.getElementById("spTime").innerHTML = time;
        function stime() 
        {
            document.getElementById("spTime").innerHTML = time;
            time = time - 1;
            if(time == 0)
            {
                    clearInterval(timing);
                    location = "jsp_input.jsp";
            }
        }
        var timing = setInterval("stime();", 1000);
    </script>

</body>
</html>