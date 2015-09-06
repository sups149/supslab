package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ErrorPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"description\" content=\"#\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"#\" />\r\n");
      out.write("<meta name=\"author\" content=\"#\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"recruitment_css.css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"print.css\" media=\"print\" />\r\n");
      out.write("<title>Recruitment</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {color: #697D55}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <div class=\"page_wrap clearfix\">\r\n");
      out.write("  <div class=\"header_text\">\r\n");
      out.write("    <h1>&nbsp;</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"topnav\" id=\"nav\"> \r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"/Recruitment\">Home</a></li>\r\n");
      out.write("      \r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"container clearfix\">\r\n");
      out.write("    <h4 align=\"center\" class=\"style1\">An error has occured!!</h4>\r\n");
      out.write("    <p align=\"center\" class=\"style1\"><a href=\"/Recruitment\">Go back Home</a> </p>\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("\t\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"footer\" id=\"footer\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
