package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ScheduleInterview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_url_scope_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_sql_dataSource_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sql_setDataSource_var_url_scope_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_sql_dataSource_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sql_setDataSource_var_url_scope_driver_nobody.release();
    _jspx_tagPool_sql_query_var_sql_dataSource_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"description\" content=\"#\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"#\" />\r\n");
      out.write("<meta name=\"author\" content=\"#\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"recruitment_css.css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"print.css\" media=\"print\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"calendar.css\">\r\n");
      out.write("<script language=\"JavaScript\" src=\"calendar_eu.js\"></script>\r\n");
      out.write("<title>Recruitment</title>\r\n");
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
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/*function showEmp(vac_value)\r\n");
      out.write("{\r\n");
      out.write("\tif(document.getElementById(\"vid\").value!=\"0\")\r\n");
      out.write("\t{\r\n");
      out.write(" xmlHttp=GetXmlHttpObject()\r\n");
      out.write("if (xmlHttp==null)\r\n");
      out.write(" {\r\n");
      out.write(" alert (\"Browser does not support HTTP Request\")\r\n");
      out.write(" return\r\n");
      out.write(" }\r\n");
      out.write("var url=\"getinterviewer.jsp\"\r\n");
      out.write("url=url+\"?vid=\"+vac_value\r\n");
      out.write("\r\n");
      out.write("xmlHttp.onreadystatechange=stateChanged;\r\n");
      out.write("xmlHttp.open(\"GET\",url,true);\r\n");
      out.write("xmlHttp.send(null);\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("\t\t alert(\"Please Select Employee Id\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("*/\r\n");
      out.write("function showEmp(vac_id){\r\n");
      out.write("      if (typeof XMLHttpRequest != \"undefined\"){\r\n");
      out.write("      xmlHttp= new XMLHttpRequest();\r\n");
      out.write("      }\r\n");
      out.write("      else if (window.ActiveXObject){\r\n");
      out.write("      xmlHttp= new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("      }\r\n");
      out.write("      if (xmlHttp==null){\r\n");
      out.write("      alert(\"Browser does not support XMLHTTP Request\")\r\n");
      out.write("      return;\r\n");
      out.write("      }\r\n");
      out.write("      var url=\"getinterviewer.jsp\"\r\n");
      out.write("      \r\n");
      out.write("      url=url+\"?vid=\"+vac_id\r\n");
      out.write("      //url=url+\"?vid=V003\"\r\n");
      out.write("      xmlHttp.onreadystatechange = stateChanged;\r\n");
      out.write("      xmlHttp.open(\"GET\", url, true);\r\n");
      out.write("      xmlHttp.send(null);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("function stateChanged() //callback\r\n");
      out.write("{\r\n");
      out.write("\t//document.getElementById(\"ename\").value =\"\";\r\n");
      out.write("\t//document.getElementById(\"eid\").value =\"\";\r\n");
      out.write("if (xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\")\r\n");
      out.write(" {\r\n");
      out.write("\r\n");
      out.write("  document.getElementById(\"eid\").innerHTML=xmlHttp.responseText;\r\n");
      out.write("\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function GetXmlHttpObject()\r\n");
      out.write("{\r\n");
      out.write("var xmlHttp=null;\r\n");
      out.write("try\r\n");
      out.write(" {\r\n");
      out.write(" // Firefox, Opera 8.0+, Safari\r\n");
      out.write(" xmlHttp=new XMLHttpRequest();\r\n");
      out.write(" }\r\n");
      out.write("catch (e)\r\n");
      out.write(" {\r\n");
      out.write(" //Internet Explorer\r\n");
      out.write(" try\r\n");
      out.write("  {\r\n");
      out.write("  xmlHttp=new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n");
      out.write("  }\r\n");
      out.write(" catch (e)\r\n");
      out.write("  {\r\n");
      out.write("  xmlHttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("  }\r\n");
      out.write(" }\r\n");
      out.write("return xmlHttp;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
      out.write("    <h2 align=\"left\">Interview Schedule </h2>\r\n");
      out.write("    <p align=\"center\">&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<form action=\"Controller\" method=\"post\" name=\"form1\" id=\"form1\">\r\n");
      out.write("\t\t  <table width=\"95%\" height=\"198\" border=\"0\" align=\"center\" cellpadding=\"8\" bordercolor=\"#9EB874\">\r\n");
      out.write("            <tr> </tr>\r\n");
      out.write("            <tr style=\"vertical-align: top\"> </tr>\r\n");
      out.write("            <tr style=\"vertical-align: top\"> </tr>\r\n");
      out.write("            <tr style=\"vertical-align: top\"> </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr style=\"vertical-align: top\"> </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("      <td valign=\"middle\"><div align=\"left\"><strong>Vacancies: </strong><span class=\"style1\">*</span> </div></td>\r\n");
      out.write("      <td>\r\n");
      out.write("        <div align=\"left\">\r\n");
      out.write("\r\n");
      out.write("            <select name=\"vid\" id=\"vid\"  style=\"width:207px;\" onchange=\"showEmp(this.value);\">\r\n");
      out.write("            <option value=\"\" selected=\"selected\">--Select--</option>\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("           </select>\r\n");
      out.write("            \r\n");
      out.write("        </div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("\t<tr>\r\n");
      out.write("      <td valign=\"middle\"><div align=\"left\"><strong>Interviewer: </strong><span class=\"style1\">*</span> </div></td>\r\n");
      out.write("      <td>\r\n");
      out.write("          <div align=\"left\">\r\n");
      out.write("          <div id=\"eid\" style=\"width:207px;\">\r\n");
      out.write("              ");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("            <tr style=\"vertical-align: top\">\r\n");
      out.write("              \r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr style=\"vertical-align: top\"> </tr>\r\n");
      out.write("            <tr style=\"vertical-align: top\" class=\"FooterColor\"> </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("\t\t  \r\n");
      out.write("  \t\t  \r\n");
      out.write("\t\t  <div align=\"center\">\r\n");
      out.write("                      <input type=\"hidden\" name=\"req_type\" value=\"4\"/>\r\n");
      out.write("\t\t    <input type=\"reset\" name=\"reset\" value=\"Reset\">\r\n");
      out.write("            <input type=\"submit\" name=\"Submit\" value=\"Submit\" />\r\n");
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

      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_url_scope_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setDriver("sun.jdbc.odbc.JdbcOdbcDriver");
    _jspx_th_sql_setDataSource_0.setVar("myconn");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:odbc:recruitment");
    _jspx_th_sql_setDataSource_0.setScope("session");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_url_scope_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_url_scope_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setVar("ints");
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myconn}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_0.setSql("select * from vacancy");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource_nobody.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ints.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("intsche1");
    _jspx_th_c_forEach_0.setVarStatus("stat");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${intsche1.Vid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${intsche1.vdetail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
