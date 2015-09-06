package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WrongPass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");

try{
        HttpSession mysession=request.getSession(false);
        String utype=(String)mysession.getAttribute("utype");
        if(mysession!=null){
        if(utype.equals("applicant"))
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/RegisteredApplicantHome.jsp"));

    if(utype.equals("HR"))
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/HRHome.jsp"));

    if(utype.equals("interviewer"))
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/InterviewerHome.jsp"));
    }
        }
   catch(java.lang.NullPointerException e){
   //response.sendRedirect("/Recruitment/home.jsp");
   //}

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"description\" content=\"#\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"#\" />\r\n");
      out.write("<meta name=\"author\" content=\"#\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"recruitment_css.css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"print.css\" media=\"print\" />\r\n");
      out.write("<title>Recruitment</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style8 {\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".style9 {color: #FF0000}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"page_wrap clearfix\">\r\n");
      out.write("  <div class=\"header_text\">\r\n");
      out.write("    <h1>&nbsp;</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"topnav\" id=\"nav\">\r\n");
      out.write("    <ul>\r\n");
      out.write("       <li><a href=\"/Recruitment\">Home</a></li>\r\n");
      out.write("        <li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("\t<li><a href=\"Registration.jsp\">Register</a></li>\r\n");
      out.write("        <li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"container clearfix\">\r\n");
      out.write("    <h2 align=\"center\" class=\"style9\">Check login Informations</h2>\r\n");
      out.write("    <p align=\"center\">&nbsp;</p>\r\n");
      out.write("\t<center>\r\n");
      out.write("            <form action=\"Controller\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t    <p>&nbsp;</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t    <table width=\"240\" height=\"82\" bordercolor=\"#000000\" background=\"../rsz_copy_of_picture1.jpg\" bgcolor=\"#CFD9BE\">\r\n");
      out.write("                                    <tbody>\r\n");
      out.write("                                      <tr>\r\n");
      out.write("                                        <td width=\"81\" align=\"left\" class=\"style8\">User ID: </td>\r\n");
      out.write("                                        <td width=\"134\">                                          <input name=\"uid\" type=\"text\" id=\"uid\" size=\"18\" />                                        </td>\r\n");
      out.write("                                      </tr>\r\n");
      out.write("                                      <tr>\r\n");
      out.write("                                        <td align=\"left\" valign=\"middle\"><strong>Password:</strong></td>\r\n");
      out.write("                                        <td><input name=\"password\" type=\"password\" id=\"password\" value=\"\" size=\"18\" /></td>\r\n");
      out.write("                                      </tr>\r\n");
      out.write("                                      <tr>\r\n");
      out.write("                                        <td align=\"left\" valign=\"middle\"><strong>User type:</strong></td>\r\n");
      out.write("                                        <td><select name=\"utype\" class=\"bigselect\" id=\"utype\" style=\"width:135px;\">\r\n");
      out.write("                                          <option value=\"0\" selected=\"selected\">--Select--</option>\r\n");
      out.write("                                          <option value=\"applicant\">Applicant</option>\r\n");
      out.write("                                          <option value=\"interviewer\">Interviewer</option>\r\n");
      out.write("                                          <option value=\"HR\">HR</option>\r\n");
      out.write("                                                                                </select></td>\r\n");
      out.write("                                      </tr>\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("\t    <br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t    <input type=\"submit\" name=\"submit\" value=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"reset\" name=\"reset\" value=\"reset\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input type=\"hidden\" name=\"req_type\" value=\"2\"/>\r\n");
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
