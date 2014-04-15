package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jsp_005finput_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Registered</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"60\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css_style.css\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>       \r\n");
      out.write("        <form name=\"frmRegister\" id=\"frmRegister\" action=\"ServletTraines\" method=\"post\" style=\"width:80%\">\r\n");
      out.write("            \r\n");
      out.write("            <fieldset class=\"hiden\">\r\n");
      out.write("                <label class=\"cls-label\">Account</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtAccount\" id=\"txtAccount\" class=\"cls-margin-left\" tabindex=\"1\"\r\n");
      out.write("                       value=\"");

                           if(session.getAttribute("sAccount") != null)
                               out.println(session.getAttribute("sAccount"));
                       
      out.write("\" required=\"required\"/><br />\r\n");
      out.write("            </fieldset>\r\n");
      out.write("\r\n");
      out.write("            <fieldset style=\"border:hidden\">\r\n");
      out.write("                <label class=\"cls-label\">First Name</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtFirstName\" id=\"txtFirstName\" class=\"cls-margin-left\" tabindex=\"2\"\r\n");
      out.write("                       value=\"");

                           if(session.getAttribute("sFirstName") != null)
                               out.println(session.getAttribute("sFirstName"));
                       
      out.write("\" required=\"required\"/><br />\r\n");
      out.write("            </fieldset>\r\n");
      out.write("            \r\n");
      out.write("            <fieldset style=\"border:hidden\">\r\n");
      out.write("                <label class=\"cls-label\">Last Name</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtLastName\" id=\"txtLastName\" class=\"cls-margin-left\" tabindex=\"3\"\r\n");
      out.write("                       value=\"");

                           if(session.getAttribute("sLastName") != null)
                               out.println(session.getAttribute("sLastName"));
                       
      out.write("\" required=\"required\"/><br />\r\n");
      out.write("            </fieldset>\r\n");
      out.write("            \r\n");
      out.write("            <fieldset class=\"hiden\">\r\n");
      out.write("                <label class=\"cls-label\">Email</label>\r\n");
      out.write("                <input type=\"email\" name=\"txtEmail\" id=\"txtEmail\" class=\"cls-margin-left\" placeholder=\"abc@xyz.com\" \r\n");
      out.write("                       value=\"");

                           if(session.getAttribute("sEmail") != null)
                               out.println(session.getAttribute("sEmail"));
                       
      out.write("\" tabindex=\"4\" required=\"required\"/><br />\r\n");
      out.write("            </fieldset>\r\n");
      out.write("\r\n");
      out.write("            <fieldset style=\"border:hidden\">\r\n");
      out.write("                <label class=\"cls-label\">&zwj;</label>\r\n");
      out.write("                <input type=\"submit\" name=\"btLogin\" value=\"Go\" class=\"cls-margin-left\" tabindex=\"5\"/>\r\n");
      out.write("                <input type=\"reset\" name=\"btReset\" value=\"Reset\" tabindex=\"6\"/>\r\n");
      out.write("            </fieldset>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
