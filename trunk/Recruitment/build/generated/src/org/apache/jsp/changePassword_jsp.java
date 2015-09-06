package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");

try{
        HttpSession mysession=request.getSession(false);
        String utype=(String)mysession.getAttribute("utype");
        if(mysession!=null){
            if(!utype.equals("applicant")||!utype.equals("HR")||!utype.equals("interviewer"))
                {


      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"description\" content=\"#\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"#\" />\r\n");
      out.write("<meta name=\"author\" content=\"#\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"recruitment_css.css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"print.css\" media=\"print\" />\r\n");

        //HttpSession mysesssion=request.getSession(false);
        //String password=(String)mysesssion.getAttribute("password");


      out.write("\r\n");
      out.write("<script language = \"Javascript\">\r\n");
      out.write("function echeck(str) {\r\n");
      out.write("\t\tvar conpass=document.frmSample.cnewpass.value\r\n");
      out.write("\t\tif(conpass!=str){\r\n");
      out.write("\t\treturn false\r\n");
      out.write("\t\t}\r\n");
      out.write(" \t\treturn true\t\t\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("function ValidateForm(){\r\n");
      out.write("\tvar emailID=document.frmSample.newpass\r\n");
      out.write("\tvar cpass=document.frmSample.cnewpass\r\n");
      out.write("\r\n");
      out.write("\tif ((emailID.value==null)||(emailID.value==\"\")){\r\n");
      out.write("\t\talert(\"Please Enter your New Password\")\r\n");
      out.write("\t\temailID.focus()\r\n");
      out.write("\t\treturn false\r\n");
      out.write("\t}\r\n");
      out.write("\tif (echeck(emailID.value)==false){\r\n");
      out.write("\t\talert(\"Please Enter your Password correctly\")\r\n");
      out.write("\t\temailID.value=\"\"\r\n");
      out.write("\t\tcpass.value=\"\"\r\n");
      out.write("\t\temailID.focus()\r\n");
      out.write("\t\treturn false\r\n");
      out.write("\t}\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("\treturn true\r\n");
      out.write(" }\r\n");
      out.write("</script>\r\n");
      out.write("<title>Recruitment</title>\r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("<div class=\"page_wrap clearfix\">\r\n");
      out.write("  <div class=\"header_text\">\r\n");
      out.write("    <h1>&nbsp;</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"topnav\" id=\"nav\"> \r\n");
      out.write("    <ul>\r\n");
      out.write("       <li><a href=\"/Recruitment\">Home</a></li>\r\n");
      out.write("      \r\n");
      out.write("      <li><a href=\"changePassword.jsp\">Change password</a></li>\r\n");
      out.write("      \r\n");
      out.write("      <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"container clearfix\">\r\n");
      out.write("    <h2 align=\"left\">Welcome, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("    <p align=\"center\">&nbsp;</p>\r\n");
      out.write("\t<center>\r\n");
      out.write("            <form name=\"frmSample\" action=\"Controller\" method=\"post\" onSubmit=\"return ValidateForm()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t    <p>&nbsp;</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t    <table width=\"302\" height=\"82\" bordercolor=\"#000000\" background=\"../rsz_copy_of_picture1.jpg\" bgcolor=\"#CFD9BE\">\r\n");
      out.write("                                    <tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("                                        <td width=\"172\" align=\"left\" class=\"style8\"><strong>Current password: </strong></td>\r\n");
      out.write("                                        <td width=\"118\">                                          <input name=\"curpass\" type=\"password\" id=\"curpass\" size=\"18\" />                                        </td>\r\n");
      out.write("                                      </tr>\r\n");
      out.write("                                      <tr>\r\n");
      out.write("                                        <td width=\"172\" align=\"left\" class=\"style8\"><strong>New password: </strong></td>\r\n");
      out.write("                                        <td width=\"118\">                                          <input name=\"newpass\" type=\"password\" id=\"newpass\" size=\"18\" />                                        </td>\r\n");
      out.write("                                      </tr>\r\n");
      out.write("                                      <tr>\r\n");
      out.write("                                        <td align=\"left\" valign=\"middle\"><strong>Confirm password:</strong></td>\r\n");
      out.write("                                        <td><input name=\"cnewpass\" type=\"password\" id=\"cnewpass\" size=\"18\" /></td>\r\n");
      out.write("                                      </tr>\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("\t    <br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t    <input name=\"change\" type=\"submit\" id=\"change\" value=\"Change\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"reset\" name=\"reset\" value=\"reset\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"hidden\" name=\"req_type\" value=\"6\"/>\r\n");
      out.write("\t  </form>\r\n");
      out.write("    </center>\r\n");
      out.write("\t<p align=\"center\">\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"footer\" id=\"footer\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");

    }
 }
}
   catch(java.lang.NullPointerException e){
   response.sendRedirect("/Recruitment/loginRequired.jsp");
}

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
