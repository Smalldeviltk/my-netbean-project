<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Registered</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="60">
        <link rel="stylesheet" href="css_style.css" type="text/css"/>
    </head>
    <body>       
        <form name="frmRegister" id="frmRegister" action="ServletTraines" method="post" style="width:80%">
            
            <fieldset class="hiden">
                <label class="cls-label">Account</label>
                <input type="text" name="txtAccount" id="txtAccount" class="cls-margin-left" tabindex="1"
                       value="<%
                           if(session.getAttribute("sAccount") != null)
                               out.println(session.getAttribute("sAccount"));
                       %>" required="required"/><br />
            </fieldset>

            <fieldset style="border:hidden">
                <label class="cls-label">First Name</label>
                <input type="text" name="txtFirstName" id="txtFirstName" class="cls-margin-left" tabindex="2"
                       value="<%
                           if(session.getAttribute("sFirstName") != null)
                               out.println(session.getAttribute("sFirstName"));
                       %>" required="required"/><br />
            </fieldset>
            
            <fieldset style="border:hidden">
                <label class="cls-label">Last Name</label>
                <input type="text" name="txtLastName" id="txtLastName" class="cls-margin-left" tabindex="3"
                       value="<%
                           if(session.getAttribute("sLastName") != null)
                               out.println(session.getAttribute("sLastName"));
                       %>" required="required"/><br />
            </fieldset>
            
            <fieldset class="hiden">
                <label class="cls-label">Email</label>
                <input type="email" name="txtEmail" id="txtEmail" class="cls-margin-left" placeholder="abc@xyz.com" 
                       value="<%
                           if(session.getAttribute("sEmail") != null)
                               out.println(session.getAttribute("sEmail"));
                       %>" tabindex="4" required="required"/><br />
            </fieldset>

            <fieldset style="border:hidden">
                <label class="cls-label">&zwj;</label>
                <input type="submit" name="btLogin" value="Go" class="cls-margin-left" tabindex="5"/>
                <input type="reset" name="btReset" value="Reset" tabindex="6"/>
            </fieldset>
        </form>
    </body>
</html>
