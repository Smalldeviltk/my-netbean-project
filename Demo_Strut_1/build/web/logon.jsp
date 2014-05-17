<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html>
    <head>
        <title>Login Form</title>
    </head>
    <body bgcolor="#ffffff">
        <html:form action="logon.do" focus="userName">
            <br>
            User Name: <html:text maxlength="16" property="userName" size="16"/><br />
            Password: <html:text maxlength="16" property="password" size="16"/><br />
            <html:submit value="Submit" property="Submit"/>
        </html:form>
    </body>
</html:html>