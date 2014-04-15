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
        <title>Traines</title>
        <link rel="stylesheet" href="css_style.css" type="text/css" />
    </head>
<body>
    
    <form style="width: 80%" name="frmTraines">
        <%@page language="java" import="java.sql.*, javax.sql.*, java.io.*, javax.naming.* " %>
        <%@page isErrorPage="true" %>

        <% 
            String _sAcccount = session.getAttribute("sAccount").toString();
            String _sFirstName = session.getAttribute("sFirstName").toString();
            String _sLastName = session.getAttribute("sLastName").toString();
            String _sEmail = session.getAttribute("sEmail").toString();
            
            try
            {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//                Connection con = DriverManager.getConnection("jdbc:odbc:accTraine");
                Connection con = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" 
                        + application.getRealPath("WEB-INF/Traine.accdb"));
                Statement stat = con.createStatement();

                String query = "SELECT * FROM tbUser";
                ResultSet rs = stat.executeQuery(query);
        %>
        <table border="1" width="80%">
            <tr>
                <th style="width: 20%; text-align: center">Account</th>
                <th style="width: 20%; text-align: center">First Name</th>
                <th style="width: 20%; text-align: center">Last Name</th>
                <th style="width: 40%; text-align: center">Email</th>
            </tr>
        <% while (rs.next()) { %>
            <tr>
                <td style="width: 20%; text-align: center"><% out.println(rs.getString(1)+ "<br>"); %></th>
                <td style="width: 20%; text-align: center"><% out.println(rs.getString(2)+ "<br>"); %></th>
                <td style="width: 20%; text-align: center"><% out.println(rs.getString(3)+ "<br>"); %></th>
                <td style="width: 20%; text-align: center"><% out.println(rs.getString(4)+ "<br>"); %></th>
            </tr>
        <%
                }
                rs.close();
                stat.close();
                con.close();
            }
            catch(Exception e)
            {
                out.println("ERROR! " + e.getMessage());
                String _sRegister = "Register.html";
                response.sendRedirect(_sRegister);
            }
        %>
        <fieldset style="width: 80%">
            <legend><h3>Information input of you:</h3></legend>
            <label class="cls-label">Account:</label>
            <input type="text" name="txtAccount" class="cls-input" value="<% out.println(_sAcccount); %>" style="width: 20%" disabled/><br>
            <label class="cls-label">First Name:</label>
            <input type="text" name="txtAccount" class="cls-input" value="<% out.println(_sFirstName); %>" style="width: 20%" disabled/><br>
            <label class="cls-label">Last Name:</label>
            <input type="text" name="txtAccount" class="cls-input" value="<% out.println(_sLastName); %>" style="width: 20%" disabled/><br>
            <label class="cls-label">Email:</label>
            <input type="text" name="txtAccount" class="cls-input" value="<% out.println(_sEmail); %>" style="width: 40%" disabled/><br>
        </fieldset>
        <fieldset class="hiden">
            <label class="cls-label">&zwj;</label>
            <input type="button" name="btSave" class="cls-input" value="Save" style="width: auto" onclick="javascript:location.href = 'jsp_register.jsp'"/>
            <input type="button" name="btUpdate" value="Update" onclick="javascript:location.href = 'index.jsp'"/>
        </fieldset>
    </form>    
</body>
</html>