<%@ page import="java.sql.*" %> 
<%
//String Vid ="V001";
String Vid = request.getParameter("vid");
String data1 ="";
String data2 ="";
String data ="";
String buffer="<select name='eid'  id='eid' style='width:207px;'><option value='' selected='selected'>--Select--</option>";
Connection conn = null;
    String url = "jdbc:odbc:recruitment";
    //String dbName = "user_register";
    //String driver = "com.mysql.jdbc.Driver";
    String userName = "";
    String password = "";

    int sumcount=0;
	Statement st;
    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();

      conn = DriverManager.getConnection(url,userName,password);
String query = "select * from interviewer where Eid not in (select Eid from int_schedule where Vid in (select Vid from vacancy where Vid='"+Vid+"'))";
//String query="select * from interviewer";
st = conn.createStatement();
ResultSet rs = st.executeQuery(query);
while(rs.next())
{
    buffer+="<option value='"+rs.getString(1)+"'>"+rs.getString(2)+" "+rs.getString(3)+"</option>";
    
}
buffer=buffer+"</select>";
response.getWriter().println(buffer);

out.println(data);
}
catch (Exception e) {
e.printStackTrace();
}
%> 