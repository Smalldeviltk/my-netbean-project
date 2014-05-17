<%-- 
    Document   : index
    Created on : Apr 22, 2014, 2:07:06 PM
    Author     : Small
--%>

<%@page contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<s:actionerror/>
<s:form action="login.action" method="post">
    <s:textfield name="username" key="label.username" size="20"/>
    <s:password name="password" key="label.password" size="20"/>
    <s:submit method="execute" key="label.login" align="center"/>
</s:form>