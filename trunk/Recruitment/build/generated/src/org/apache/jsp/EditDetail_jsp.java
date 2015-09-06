package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_url_scope_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_sql_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_param_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sql_setDataSource_var_url_scope_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_sql_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_param_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sql_setDataSource_var_url_scope_driver_nobody.release();
    _jspx_tagPool_sql_query_var_sql_dataSource.release();
    _jspx_tagPool_sql_param_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
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
        if(utype.equals("HR"))
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/UnauthorisedUser.jsp"));
        if(utype.equals("interviewer"))
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/UnauthorisedUser.jsp"));

    if(utype.equals("applicant")){


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
      out.write("<script language=\"JavaScript\" src=\"calendar_us.js\"></script>\r\n");
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    /*\r\n");
      out.write("    function setCheckedValue() {\r\n");
      out.write("        radioObj=document.forms['form1'].elements['sex']\r\n");
      out.write("\tif(!radioObj)\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\tvar radioLength = radioObj.length;\r\n");
      out.write("\tif(radioLength == undefined) {\r\n");
      out.write("            radioObj.checked = (radioObj.value == ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf1.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".toString());\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tfor(var i = 0; i < radioLength; i++) {\r\n");
      out.write("\t\tradioObj[i].checked = false;\r\n");
      out.write("\t\tif(radioObj[i].value == ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf1.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".toString()) {\r\n");
      out.write("\t\t\tradioObj[i].checked = true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("*/\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"page_wrap clearfix\">\r\n");
      out.write("  <div class=\"header_text\">\r\n");
      out.write("    <h1>&nbsp;</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"topnav\" id=\"nav\"> \r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"/Recruitment\">Home</a></li>\r\n");
      out.write("      <li><a href=\"EditDetail.jsp\">Edit Profile</a></li>\r\n");
      out.write("      <li><a href=\"ApplyJobs.jsp\">Apply Jobs</a></li>\r\n");
      out.write("      <li><a href=\"changePassword.jsp\">Change password</a></li>\r\n");
      out.write("      <li><a href=\"ApplicantInterviewDate.jsp\">Interview Date</a></li>\r\n");
      out.write("      <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_sql_query_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_sql_query_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_sql_query_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <center>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        </center>\r\n");
      out.write("  <div class=\"container clearfix\">\r\n");
      out.write("    <h2 align=\"left\">general information </h2>\r\n");
      out.write("    <p align=\"center\">&nbsp;</p>\r\n");
      out.write("\t\t<form action=\"Controller\" method=\"get\" name=\"form1\" id=\"form1\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  <p>&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("                  ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t  <p align=\"left\">&nbsp; </p>\r\n");
      out.write("\t\t  <p>&nbsp;</p>\r\n");
      out.write("          <h2 align=\"left\">Graduation</h2>\r\n");
      out.write("\t\t  <p align=\"left\">&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("                  ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  \t\t  \r\n");
      out.write("\t\t  <div align=\"center\">\r\n");
      out.write("                      <input type=\"hidden\" name=\"req_type\" value=\"1\"/>\r\n");
      out.write("\t\t    <input type=\"reset\" name=\"reset\" value=\"Reset\">\r\n");
      out.write("            <input type=\"submit\" name=\"Submit\" value=\"Submit\" />\r\n");
      out.write("          </div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<p>&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"footer\" id=\"footer\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");

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
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setVar("apps");
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myconn}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_0.setSql("SELECT * from applicant where Aid=?");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_sql_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_0, _jspx_page_context, _jspx_push_body_count_sql_query_0))
            return true;
          out.write("\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_0 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_0);
    _jspx_th_sql_param_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Aid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_0 = _jspx_th_sql_param_0.doStartTag();
    if (_jspx_th_sql_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_0);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_1.setParent(null);
    _jspx_th_sql_query_1.setVar("stdx");
    _jspx_th_sql_query_1.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myconn}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_1.setSql("SELECT * from stdx where Aid=?");
    int[] _jspx_push_body_count_sql_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_1 = _jspx_th_sql_query_1.doStartTag();
      if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_1[0]++;
          _jspx_th_sql_query_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_1.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_sql_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_1, _jspx_page_context, _jspx_push_body_count_sql_query_1))
            return true;
          out.write("\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_sql_query_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_1[0]--;
      }
      if (_jspx_th_sql_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_1.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource.reuse(_jspx_th_sql_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_1 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_1);
    _jspx_th_sql_param_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Aid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_1 = _jspx_th_sql_param_1.doStartTag();
    if (_jspx_th_sql_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_1);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_1);
    return false;
  }

  private boolean _jspx_meth_sql_query_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_2.setParent(null);
    _jspx_th_sql_query_2.setVar("stdxii");
    _jspx_th_sql_query_2.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myconn}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_2.setSql("SELECT * from stdxii where Aid=?");
    int[] _jspx_push_body_count_sql_query_2 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_2 = _jspx_th_sql_query_2.doStartTag();
      if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_2[0]++;
          _jspx_th_sql_query_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_2.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_sql_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_2, _jspx_page_context, _jspx_push_body_count_sql_query_2))
            return true;
          out.write("\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_sql_query_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_2[0]--;
      }
      if (_jspx_th_sql_query_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_2.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource.reuse(_jspx_th_sql_query_2);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_2 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_2);
    _jspx_th_sql_param_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Aid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_2 = _jspx_th_sql_param_2.doStartTag();
    if (_jspx_th_sql_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_2);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_2);
    return false;
  }

  private boolean _jspx_meth_sql_query_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_3 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_3.setParent(null);
    _jspx_th_sql_query_3.setVar("graduation");
    _jspx_th_sql_query_3.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myconn}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_3.setSql("SELECT * from graduation where Aid=?");
    int[] _jspx_push_body_count_sql_query_3 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_3 = _jspx_th_sql_query_3.doStartTag();
      if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_3[0]++;
          _jspx_th_sql_query_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_3.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_sql_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_3, _jspx_page_context, _jspx_push_body_count_sql_query_3))
            return true;
          out.write("\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_sql_query_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_3[0]--;
      }
      if (_jspx_th_sql_query_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_3.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource.reuse(_jspx_th_sql_query_3);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_3 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_3);
    _jspx_th_sql_param_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Aid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_3 = _jspx_th_sql_param_3.doStartTag();
    if (_jspx_th_sql_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_3);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${apps.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("inf1");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t  <table width=\"95%\" height=\"198\" border=\"0\" align=\"center\" cellpadding=\"8\" bordercolor=\"#9EB874\" on>\r\n");
          out.write("            <tr> </tr>\r\n");
          out.write("            <tr style=\"vertical-align: top\"> </tr>\r\n");
          out.write("            <tr style=\"vertical-align: top\"> </tr>\r\n");
          out.write("            <tr style=\"vertical-align: top\"> </tr>\r\n");
          out.write("            <tr style=\"vertical-align: top\">\r\n");
          out.write("              <td height=\"46\" align=\"center\" valign=\"middle\" class=\"LabelColor\" style=\"text-align: right\"><div align=\"left\"><strong>First Name:</strong><span class=\"style1\">*</span> </div></td>\r\n");
          out.write("              <td width=\"24%\" valign=\"middle\" class=\"TitleColor\"><label for=\"first\"></label>\r\n");
          out.write("                  \r\n");
          out.write("                  <input type=\"text\" id=\"fname\" name=\"fname\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf1.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\r\n");
          out.write("              </td>\r\n");
          out.write("              <td width=\"60%\" valign=\"middle\" class=\"TitleColor\"><label for=\"last\"><strong>Last Name: </strong><span class=\"style1\">*</span> </label>\r\n");
          out.write("                  <input type=\"text\" id=\"lname\" name=\"lname\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf1.lname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\r\n");
          out.write("              </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr style=\"vertical-align: top\"> </tr>\r\n");
          out.write("            <tr style=\"vertical-align: top\">\r\n");
          out.write("              <td valign=\"middle\" class=\"LabelColor\" style=\"text-align: right\"><div align=\"left\"><strong>Sex</strong><span class=\"style1\"><span class=\"style2\">:</span> *</span></div></td>\r\n");
          out.write("              <td colspan=\"2\"><p class=\"TitleColor\" >\r\n");
          out.write("\r\n");
          out.write("                  <label for=\"male\">Male </label>\r\n");
          out.write("                  <input type=\"radio\" id=\"male\" name=\"sex\" value=\"Male\" />\r\n");
          out.write("                  <label for=\"female\">Female </label>\r\n");
          out.write("                  <input type=\"radio\" id=\"female\" name=\"sex\" value=\"Female\" />\r\n");
          out.write("              </p></td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr style=\"vertical-align: top\">\r\n");
          out.write("              <td align=\"left\" class=\"LabelColor\" style=\"text-align: right\"><div align=\"left\"><strong>Date of Birth:</strong> <span class=\"style1\">*</span> </div></td>\r\n");
          out.write("              <td colspan=\"2\"><!-- calendar attaches to existing form element -->\r\n");
          out.write("                  <input type=\"text\" name=\"dob\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf1.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\r\n");
          out.write("                  <script language=\"JavaScript\">\r\n");
          out.write("\tnew tcal ({\r\n");
          out.write("\t\t// form name\r\n");
          out.write("\t\t'formname': 'form1',\r\n");
          out.write("\t\t// input name\r\n");
          out.write("\t\t'controlname': 'dob'\r\n");
          out.write("\t});\r\n");
          out.write("\r\n");
          out.write("\t        </script>\r\n");
          out.write("                  <br />\r\n");
          out.write("                  <span class=\"style4\">mm/dd/yyyy</span> </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr style=\"vertical-align: top\"> </tr>\r\n");
          out.write("            <tr style=\"vertical-align: top\" class=\"FooterColor\"> </tr>\r\n");
          out.write("          </table>\r\n");
          out.write("\t\t  <p>&nbsp;</p>\r\n");
          out.write("  <h2 align=\"left\">Contact Details</h2>\r\n");
          out.write("  <p align=\"left\">&nbsp;</p>\r\n");
          out.write("  <table width=\"722\" border=\"0\" align=\"center\">\r\n");
          out.write("    <tr>\r\n");
          out.write("      <td width=\"70\"><div align=\"left\"><strong>E-mail:</strong> <span class=\"style1\">*</span> </div></td>\r\n");
          out.write("      <td width=\"239\"><div align=\"left\">\r\n");
          out.write("        <input name=\"email\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf1.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"30\">\r\n");
          out.write("      </div></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("    <tr>\r\n");
          out.write("      <td><div align=\"left\"><strong>Address line: </strong><span class=\"style1\">*</span> </div></td>\r\n");
          out.write("      <td>\r\n");
          out.write("        <div align=\"left\">\r\n");
          out.write("          <textarea name=\"address\" rows=\"4\" cols=\"23\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf1.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</textarea>\r\n");
          out.write("        </div></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td width=\"70\"><div align=\"left\"><strong>City:</strong> <span class=\"style1\">*</span> </div></td>\r\n");
          out.write("\t\t<td width=\"239\"><div align=\"left\">\r\n");
          out.write("\t\t  <div align=\"left\">\r\n");
          out.write("\t\t    <input name=\"city\" type=\"text\" size=\"30\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf1.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t    \r\n");
          out.write("            </div></div></td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("      <td width=\"70\"><div align=\"left\"><strong>State:</strong> <span class=\"style1\">*</span> </div></td>\r\n");
          out.write("      <td width=\"239\"><div align=\"left\">\r\n");
          out.write("        <select name=\"state\" id=\"state\" class=\"bigselect\" style=\"width:207px;\">\r\n");
          out.write("\t\t\t\t\t<option value=\"0\">--Select--</option>\r\n");
          out.write("\t\t\t\t\t<option value=\"AN    \">Andaman and Nicobar Islands   </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"AP    \">Andhra Pradesh                </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"AR    \">Arunachal Pradesh             </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"AS    \">Assam                         </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"BR    \">Bihar                         </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"CH    \">Chandigarh (UT)               </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"CT    \">Chhattisgarh                  </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"DD    \">Daman and Diu (UT)            </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"DL    \">Delhi (UT)                    </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"DN    \">Dadra and Nagar Haveli (UT)   </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"GA    \">Goa                           </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"GJ    \">Gujarat                       </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"HP    \">Himachal Pradesh              </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"HR    \">Haryana                       </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"JH    \">Jharkhand                     </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"JK    \">Jammu and Kashmir             </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"KA    \">Karnataka                     </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"KL    \">Kerala                        </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"LA    \">Lashwadeep(UT)                </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"MH    \">Maharashtra                   </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"ML    \">Meghalaya                     </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"MN    \">Manipur                       </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"MP    \">Madhya Pradesh                </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"MZ    \">Mizoram                       </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"NG    \">Nagaland                      </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"OR    \">Orissa                        </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"PB    \">Punjab                        </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"PY    \">Pondicherry (UT)              </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"RJ    \">Rajasthan                     </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"SK    \">Sikkim                        </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"TN    \">Tamil Nadu                    </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"TR    \">Tripura                       </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"UP    \">Uttar Pradesh                 </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"UT    \">Uttaranchal                   </option>\r\n");
          out.write("\t\t\t\t\t<option value=\"WB    \">West Bengal                   </option>\r\n");
          out.write("\r\n");
          out.write("\t\t\t  </select>\r\n");
          out.write("      </div></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("      <td width=\"70\"><div align=\"left\"><strong>PIN Code: </strong><span class=\"style1\">*</span> </div></td>\r\n");
          out.write("      <td width=\"239\"><div align=\"left\">\r\n");
          out.write("        <input name=\"pin\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf1.pin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"30\">\r\n");
          out.write("      </div></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("      <td width=\"70\" valign=\"top\"><div align=\"left\"><strong>Phone with Area Code: </strong></div></td>\r\n");
          out.write("      <td width=\"239\" valign=\"bottom\"><div align=\"left\">\r\n");
          out.write("        <input name=\"phone\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf1.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"30\"><br>\r\n");
          out.write("        <span class=\"style4 style3\"><em>Please don't use brackets or hyphen to separate the area code</em></span>      </div></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("      <td width=\"70\" valign=\"top\"><div align=\"left\"><strong>Mobile: </strong><span class=\"style1\">*</span> </div></td>\r\n");
          out.write("      <td width=\"239\"><div align=\"left\">\r\n");
          out.write("        <input name=\"mobile\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf1.mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"30\"><br>\r\n");
          out.write("        <span class=\"style4 style3\"><em>ex: 9876543210</em></span>      </div></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("\r\n");
          out.write("        \r\n");
          out.write("\t <!--<tr style=\"vertical-align: top\" class=\"FooterColor\">\r\n");
          out.write("     <td colspan=\"3\">\r\n");
          out.write("\t  \t<input name=\"Previous\" type=\"button\" value=\"Previous\" />\r\n");
          out.write("\t  \t<input type=\"reset\" name=\"reset\" value=\"Reset\">\r\n");
          out.write("        <input type=\"submit\" name=\"Submit\" value=\"Next\" />     </td>\r\n");
          out.write("    </tr>-->\r\n");
          out.write("  </table>\r\n");
          out.write("  ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stdx.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("inf2");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          <p>&nbsp;</p>\r\n");
          out.write("\t\t  <h2 align=\"left\">Academic Qualification</h2>\r\n");
          out.write("\t\t  <p align=\"left\">&nbsp;</p>\r\n");
          out.write("\t\t  <table width=\"719\" border=\"0\" align=\"center\">\r\n");
          out.write("  <tr>\r\n");
          out.write("    <td width=\"713\" valign=\"top\"><div align=\"left\" class=\"style6\">  Std X Details</div></td>\r\n");
          out.write("  </tr>\r\n");
          out.write("</table>\r\n");
          out.write("\r\n");
          out.write("\t\t  <table width=\"722\" border=\"0\" align=\"center\">\r\n");
          out.write("    <tr>\r\n");
          out.write("      <td width=\"162\" valign=\"middle\"><div align=\"left\"><strong>Year of passing:</strong> <span class=\"style1\">*</span> </div></td>\r\n");
          out.write("      <td width=\"550\"><input name=\"yrp1\" type=\"text\" id=\"yrp1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf2.yrp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"30\" /></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("    <tr>\r\n");
          out.write("      <td valign=\"middle\"><div align=\"left\"><strong>Board: </strong><span class=\"style1\">*</span> </div></td>\r\n");
          out.write("      <td>\r\n");
          out.write("        <div align=\"left\">\r\n");
          out.write("          <select name=\"boardx\" class=\"bigselect\" id=\"boardx\" style=\"width:207px;\">\r\n");
          out.write("            <option value=\"0\" selected=\"selected\">--Select--</option>\r\n");
          out.write("            <option value=\"state\">State Board</option>\r\n");
          out.write("            <option value=\"C.B.S.E\">C.B.S.E</option>\r\n");
          out.write("            <option value=\"I.C.S.E\">I.C.S.E</option>\r\n");
          out.write("              </select>\r\n");
          out.write("        </div></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td width=\"162\" valign=\"middle\"><div align=\"left\"><strong>Percentage:</strong> <span class=\"style1\">*</span> </div></td>\r\n");
          out.write("\t\t<td width=\"550\"><div align=\"left\">\r\n");
          out.write("\t\t  <div align=\"left\">\r\n");
          out.write("\t\t    <input name=\"marks1\" type=\"text\" id=\"marks1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf2.marks}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"30\">\r\n");
          out.write("          </div></div></td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("  </table>\t  \r\n");
          out.write("\r\n");
          out.write("  ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stdxii.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("inf3");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t  <table width=\"719\" border=\"0\" align=\"center\">\r\n");
          out.write("            <tr>\r\n");
          out.write("              <td width=\"713\" valign=\"top\"><div align=\"left\" class=\"style6\"> Std XII Details</div></td>\r\n");
          out.write("            </tr>\r\n");
          out.write("          </table>\r\n");
          out.write("\t\t  <table width=\"722\" border=\"0\" align=\"center\">\r\n");
          out.write("            <tr>\r\n");
          out.write("              <td width=\"162\" valign=\"middle\"><div align=\"left\"><strong>Year of passing:</strong> <span class=\"style1\">*</span> </div></td>\r\n");
          out.write("              <td width=\"550\"><input name=\"yrp2\" type=\"text\" id=\"yrp2\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf3.yrp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"30\" /></td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr>\r\n");
          out.write("              <td valign=\"middle\"><div align=\"left\"><strong>Board: </strong><span class=\"style1\">*</span> </div></td>\r\n");
          out.write("              <td><div align=\"left\">\r\n");
          out.write("                  <select name=\"boardxii\" class=\"bigselect\" id=\"boardxii\" style=\"width:207px;\">\r\n");
          out.write("                    <option value=\"0\" selected=\"selected\">--Select--</option>\r\n");
          out.write("                    <option value=\"state\">State Board</option>\r\n");
          out.write("                    <option value=\"C.B.S.E\">C.B.S.E</option>\r\n");
          out.write("                    <option value=\"I.S.C\">I.S.C</option>\r\n");
          out.write("                </select>\r\n");
          out.write("              </div></td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr>\r\n");
          out.write("              <td width=\"162\" valign=\"middle\"><div align=\"left\"><strong>Percentage:</strong> <span class=\"style1\">*</span> </div></td>\r\n");
          out.write("              <td width=\"550\"><div align=\"left\">\r\n");
          out.write("                  <div align=\"left\">\r\n");
          out.write("                    <input name=\"marks2\" type=\"text\" id=\"marks2\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf3.marks}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"30\" />\r\n");
          out.write("                </div></div></td>\r\n");
          out.write("            </tr>\r\n");
          out.write("          </table>\r\n");
          out.write("                  ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${graduation.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("inf4");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t  <table width=\"722\" border=\"0\" align=\"center\">\r\n");
          out.write("    <tr>\r\n");
          out.write("      <td width=\"162\" valign=\"middle\"><div align=\"left\"><strong>Degree:</strong> <span class=\"style1\">*</span> </div></td>\r\n");
          out.write("      <td width=\"550\"><select name=\"degree\" class=\"bigselect\" id=\"degree\" style=\"width:207px;\">\r\n");
          out.write("        <option value=\"0\" selected=\"selected\">--Select--</option>\r\n");
          out.write("        <option value=\"BTech\">B Tech</option>\r\n");
          out.write("        <option value=\"Bsc\">Bsc</option>\r\n");
          out.write("          </select></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("    <tr>\r\n");
          out.write("      <td valign=\"middle\"><div align=\"left\"><strong>Branch: </strong><span class=\"style1\">*</span> </div></td>\r\n");
          out.write("      <td>\r\n");
          out.write("        <div align=\"left\">\r\n");
          out.write("          <select name=\"branch\" class=\"bigselect\" id=\"branch\" style=\"width:207px;\">\r\n");
          out.write("            <option value=\"0\" selected=\"selected\">--Select--</option>\r\n");
          out.write("            <option value=\"CSE\">Computer Sc. &amp;  Engg.</option>\r\n");
          out.write("            <option value=\"IT\">Information Technology</option>\r\n");
          out.write("            <option value=\"EE\">Electrical Engg.</option>\r\n");
          out.write("            <option value=\"ECE\">Electronics &amp; Comm. Engg</option>\r\n");
          out.write("              </select>\r\n");
          out.write("        </div></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td width=\"162\" valign=\"middle\"><div align=\"left\"><strong>College:</strong> <span class=\"style1\">*</span> </div></td>\r\n");
          out.write("\t\t<td width=\"550\"><div align=\"left\">\r\n");
          out.write("\t\t  <div align=\"left\">\r\n");
          out.write("\t\t    <input name=\"college\" type=\"text\" id=\"college\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf4.college}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"30\">\r\n");
          out.write("\t\t    \r\n");
          out.write("          </div></div></td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("      <td width=\"162\" valign=\"middle\"><div align=\"left\"><strong>University:</strong> <span class=\"style1\">*</span> </div></td>\r\n");
          out.write("      <td width=\"550\"><div align=\"left\">\r\n");
          out.write("        <input name=\"university\" type=\"text\" id=\"university\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf4.university}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"30\" />\r\n");
          out.write("      </div></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("      <td width=\"162\" valign=\"middle\"><div align=\"left\"><strong>Year                                   of passing: </strong><span class=\"style1\">*</span> </div></td>\r\n");
          out.write("      <td width=\"550\"><div align=\"left\">\r\n");
          out.write("        <input name=\"yrp3\" type=\"text\" id=\"yrp3\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf4.yrp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"30\">\r\n");
          out.write("      </div></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("      <td width=\"162\" valign=\"middle\"><div align=\"left\"><strong>Mode of education: </strong><span class=\"style1\">*</span></div></td>\r\n");
          out.write("      <td width=\"550\" valign=\"bottom\"><div align=\"left\">\r\n");
          out.write("        <select name=\"me\" class=\"bigselect\" id=\"me\" style=\"width:207px;\">\r\n");
          out.write("          <option value=\"0\" selected=\"selected\">--Select--</option>\r\n");
          out.write("          <option value=\"FT\">Full Time</option>\r\n");
          out.write("          <option value=\"PT\">Part Time</option>\r\n");
          out.write("          <option value=\"D\">Distance</option>\r\n");
          out.write("              </select>\r\n");
          out.write("        <br>\r\n");
          out.write("      </div></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("      <td width=\"162\" valign=\"middle\"><div align=\"left\"><strong>Overall                                   Percentage/CGPA: </strong><span class=\"style1\">*</span> </div></td>\r\n");
          out.write("      <td width=\"550\"><div align=\"left\">\r\n");
          out.write("        <input name=\"marks3\" type=\"text\" id=\"marks3\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inf4.marks}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"30\">\r\n");
          out.write("        <br>\r\n");
          out.write("      </div></td>\r\n");
          out.write("    </tr>\r\n");
          out.write("  </table>\r\n");
          out.write("                  ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
