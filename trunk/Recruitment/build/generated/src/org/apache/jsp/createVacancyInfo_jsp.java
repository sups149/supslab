package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createVacancyInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/UnauthorisedUser.jsp"));
        if(utype.equals("interviewer"))
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/UnauthorisedUser.jsp"));

    if(utype.equals("HR")){


      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"description\" content=\"#\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"#\" />\r\n");
      out.write("<meta name=\"author\" content=\"#\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"grass_stains.css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"print.css\" media=\"print\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"calendar.css\">\r\n");
      out.write("<script language=\"JavaScript\" src=\"calendar_us.js\"></script>\r\n");
      out.write("<title>culture shock:grass stains</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {color: #FF0000}\r\n");
      out.write(".style2 {\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".style4 {color: #666666}\r\n");
      out.write(".style6 {color: #339933; font-weight: bold; }\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"page_wrap clearfix\">\r\n");
      out.write("  <div class=\"header_text\">\r\n");
      out.write("    <h1>culture shock</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"topnav\" id=\"nav\"> \r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"/Recruitment\">Home</a></li>\r\n");
      out.write("      <li><a href=\"viewVacancyHR.jsp\">View Vacancy</a></li>\r\n");
      out.write("      <li><a href=\"createVacancyInfo.jsp\">Create vacancy</a></li>\r\n");
      out.write("      <li><a href=\"ScheduleInterview.jsp\">Schedule</a></li>\r\n");
      out.write("      <li><a href=\"changePassword.jsp\">Change password</a></li>\r\n");
      out.write("      <li><a href=\"logout.jsp\">logout</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"container clearfix\">\r\n");
      out.write("    <form action=\"Controller\" method=\"post\" name=\"form1\" id=\"form1\">\r\n");
      out.write("      <h2 align=\"left\">Create Vacancy</h2>\r\n");
      out.write("  <p align=\"left\">&nbsp;</p>\r\n");
      out.write("  <table width=\"722\" border=\"0\" align=\"center\">\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td><div align=\"left\"><strong>Vacancy Detail : </strong><span class=\"style1\">*</span> </div></td>\r\n");
      out.write("      <td>\r\n");
      out.write("        <div align=\"left\">\r\n");
      out.write("          <textarea name=\"vdetail\" cols=\"23\" rows=\"4\" id=\"vdetail\"></textarea>\r\n");
      out.write("        </div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td align=\"left\" valign=\"top\" class=\"LabelColor\" style=\"text-align: right\"><div align=\"left\"><strong>Closing Date: </strong> <span class=\"style1\">*</span> </div></td>\r\n");
      out.write("              <td colspan=\"2\"><!-- calendar attaches to existing form element -->\r\n");
      out.write("                  <input name=\"closedate\" type=\"text\" id=\"closedate\" size=\"25\" />\r\n");
      out.write("                  <script language=\"JavaScript\">\r\n");
      out.write("\tnew tcal ({\r\n");
      out.write("\t\t// form name\r\n");
      out.write("\t\t'formname': 'form1',\r\n");
      out.write("\t\t// input name\r\n");
      out.write("\t\t'controlname': 'closedate'\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t        </script>\r\n");
      out.write("                  <br />\r\n");
      out.write("                  <span class=\"style4\">mm/dd/yyyy</span> </td>\r\n");
      out.write("\t\t\t\t  </tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td align=\"left\" valign=\"top\" class=\"LabelColor\" style=\"text-align: right\"><div align=\"left\"><strong>Interview Date: </strong> <span class=\"style1\">*</span> </div></td>\r\n");
      out.write("          <td colspan=\"2\"><!-- calendar attaches to existing form element -->\r\n");
      out.write("              <input name=\"int_date\" type=\"text\" id=\"int_date\" size=\"25\" />\r\n");
      out.write("                  <script language=\"JavaScript\">\r\n");
      out.write("\tnew tcal ({\r\n");
      out.write("\t\t// form name\r\n");
      out.write("\t\t'formname': 'form1',\r\n");
      out.write("\t\t// input name\r\n");
      out.write("\t\t'controlname': 'int_date'\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t        </script>\r\n");
      out.write("                  <br />\r\n");
      out.write("                  <span class=\"style4\">mm/dd/yyyy</span></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"70\"><div align=\"left\"><strong>Number of Vacancy :</strong> <span class=\"style1\">*</span> </div></td>\r\n");
      out.write("\t\t<td width=\"239\"><div align=\"left\">\r\n");
      out.write("\t\t  <div align=\"left\">\r\n");
      out.write("\t\t    <input name=\"nov\" type=\"text\" id=\"nov\" value=\"\" size=\"30\">\r\n");
      out.write("\t\t    \r\n");
      out.write("            </div></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t <!--<tr style=\"vertical-align: top\" class=\"FooterColor\">\r\n");
      out.write("     <td colspan=\"3\">\r\n");
      out.write("\t  \t<input name=\"Previous\" type=\"button\" value=\"Previous\" />\r\n");
      out.write("\t  \t<input type=\"reset\" name=\"reset\" value=\"Reset\">\r\n");
      out.write("        <input type=\"submit\" name=\"Submit\" value=\"Next\" />     </td>\r\n");
      out.write("    </tr>-->\r\n");
      out.write("  </table>\r\n");
      out.write("          <br>\r\n");
      out.write("  \t\t  \r\n");
      out.write("\t\t  <div align=\"center\">\r\n");
      out.write("                      <input type=\"hidden\" name=\"req_type\" value=\"3\"/>\r\n");
      out.write("\t\t    <input type=\"reset\" name=\"reset\" value=\"Reset\">\r\n");
      out.write("            <input type=\"submit\" name=\"Submit\" value=\"Create\" />\r\n");
      out.write("          </div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<p>&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"footer\" id=\"footer\">Copyright, 2005 (Your Site Name) &nbsp;&#8226;&nbsp; \r\n");
      out.write("    Design by <a href=\"http://www.openwebdesign.org/userinfo.phtml?user=pogy366\">pogy366</a> \r\n");
      out.write("    for OSWD &nbsp;&#8226;&nbsp; <a href=\"http://validator.w3.org/check?uri=referer\">Valid \r\n");
      out.write("    XHTML</a> &nbsp;&#8226;&nbsp; <a href=\"http://jigsaw.w3.org/css-validator/\">Valid \r\n");
      out.write("    CSS</a> <br />\r\n");
      out.write("    \r\n");
      out.write("<!--This theme is free for distriubtion,  so long as  link to openwebdesing.org and florida-villa.com  stay on the theme-->\r\n");
      out.write("Courtesy  <a href=\"http://www.openwebdesign.org\" target=\"_blank\">Open Web Design</a><a href=\"http://www.dubaiapartments.biz\" target=\"_blank\"><img src=\"spacer.gif\" width=\"5\" height=\"5\" border=\"0\"/></a>Thanks \r\n");
      out.write("    to <a href=\"http://www.florida-villa.com\" target=\"_blank\">Florida Vacation Homes</a> </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");

    }
  }
}
   catch(java.lang.NullPointerException e){
   response.sendRedirect("/Recruitment/loginRequired.jsp");
}

      out.write('\r');
      out.write('\n');
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
