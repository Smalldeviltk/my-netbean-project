<%-- 
    Document   : index
    Created on : Apr 10, 2014, 3:25:57 PM
    Author     : Small
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <form>
            <h1>Create an account</h1>
            <table>
                <tbody>
                    <tr>
                        <td>Account Name:</td>
                        <td>
                            <input type="text" name="accountName" id="accountName">
                        </td>
                        <td>*</td>
                    </tr>

                    <tr>
                        <td>First Name:</td>
                        <td>
                            <input type="text" name="firstName" id="firstName">
                        </td>
                        <td>*</td>
                    </tr>

                    <tr>
                        <td>Last Name:</td>
                        <td>
                            <input type="text" name="lastName" id="lastName">
                        </td>
                        <td>*</td>
                    </tr>

                    <tr>
                        <td>Email:</td>
                        <td>
                            <input type="email" name="email" id="email">
                        </td>
                        <td>*</td>
                    </tr>
                    
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" name="submit" id="submit" value="Register" onClick="validation();">
                            <input type="reset" name="reset" id="reset" value="Clear">
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
