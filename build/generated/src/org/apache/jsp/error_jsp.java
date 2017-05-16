package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <title>JSP Page</title>\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        html{overflow: hidden;\n");
      out.write("                    overflow-x: scroll;}\n");
      out.write("        body\n");
      out.write("            {\n");
      out.write("                overflow: hidden;\n");
      out.write("\t\toverflow-x: scroll;\n");
      out.write("                color: black;\n");
      out.write("                background-image: url(\"asd.jpg\");\n");
      out.write("                background-position: center center;\n");
      out.write("                background-size: cover;\n");
      out.write("                position: relative;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #logo\n");
      out.write("            {\n");
      out.write("                display: block;\n");
      out.write("                margin: 0  auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #title\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                border: 3px solid #ccc;\n");
      out.write("                -webkit-transition: 0.5s;\n");
      out.write("                transition: 0.5s;\n");
      out.write("                outline: none;\n");
      out.write("                font-family: Segoe UI;\n");
      out.write("                font-size: 150%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #title:focus\n");
      out.write("            {\n");
      out.write("                border: 3px solid #FFFF00;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #details\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                border: 3px solid #ccc;\n");
      out.write("                -webkit-transition: 0.3s;\n");
      out.write("                transition: 0.3s;\n");
      out.write("                outline: none;\n");
      out.write("                font-family: Segoe UI;\n");
      out.write("                font-size: 150%;                            \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #details:focus\n");
      out.write("            {\n");
      out.write("                border: 3px solid #FFFF00;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            #buttons\n");
      out.write("            {\n");
      out.write("                    display: block;\n");
      out.write("                    margin: 0 auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .hvr-grow\n");
      out.write("            {\n");
      out.write("                display: inline-block;\n");
      out.write("                -webkit-transform: perspective(1px) translateZ(0);\n");
      out.write("                transform: perspective(1px) translateZ(0);\n");
      out.write("                box-shadow: 0 0 1px transparent;\n");
      out.write("                -webkit-transition-duration: 0.3s;\n");
      out.write("                transition-duration: 0.3s;\n");
      out.write("                -webkit-transition-property: transform;\n");
      out.write("                transition-property: transform;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .hvr-grow:hover, .hvr-grow:focus, .hvr-grow:active\n");
      out.write("            {\n");
      out.write("                -webkit-transform: scale(1.1);\n");
      out.write("                transform: scale(1.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button\n");
      out.write("            {\n");
      out.write("                padding: 15px 25px 15px 25px;\n");
      out.write("                font-size: 24px;\n");
      out.write("                text-align: center;\n");
      out.write("                cursor: pointer;\n");
      out.write("                outline: none;\n");
      out.write("                color: white;\n");
      out.write("                background-color: #80ced6;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 15px;\n");
      out.write("                width: 100%;\n");
      out.write("                font-family: Segoe UI;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button:hover\n");
      out.write("            {\n");
      out.write("                background-color: #d5f4e6;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button:active\n");
      out.write("            {\n");
      out.write("                background-color: #FFFF00;\n");
      out.write("                box-shadow: 0 5px #808000;\n");
      out.write("                transform: translateY(4px);\n");
      out.write("            }\n");
      out.write("            .w3-card   {\n");
      out.write("                width:50%;\n");
      out.write("                margin:0 auto\n");
      out.write("            }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("   <body>\n");
      out.write("        <div class=\"w3-container\">\n");
      out.write("            \n");
      out.write("            <h3> <font color=red size=4px>User Not Found</font></h3>\n");
      out.write("            <br><br><br><br><br><br>\n");
      out.write("            <div class=\"w3-card w3-card-4\">\n");
      out.write("                <header class=\"w3-container w3-teal\">\n");
      out.write("                      <center><h1>Login</h1></center>\n");
      out.write("                </header>\n");
      out.write("            <form action=\"loginServlet\" method=\"POST\"> \n");
      out.write("            <div class=\"row\" align=\"center\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <input type=\"text\" name=\"uname\" id=\"title\" value=\"\" placeholder=\"Username\" style=\"width: 100%\" required/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                <br>\n");
      out.write("            <div class=\"row\" align=\"center\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <input type=\"password\" name=\"pass\" id=\"title\" value=\"\" placeholder=\"Password\" style=\"width: 100%\" required/>\n");
      out.write("                </div>\n");
      out.write("            </div><br>\n");
      out.write("            \n");
      out.write("            <div class=\"row\" align=\"center\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <button class=\"button hvr-grow\" name=\"but\" type=\"submit\" value=\"login\" style=\"width: 100%\"><b>Login</b></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
