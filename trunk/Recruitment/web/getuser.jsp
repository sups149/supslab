<%@ page import="java.sql.*" %> 
<%
String Eid = request.getParameter("Eid").toString();
String data ="";

Connection conn = null;
    String url = "jdbc:odbc:recruitment";
    //String dbName = "user_register";
    //String driver = "com.mysql.jdbc.Driver";
    String userName = "";
    String password = "";

    int sumcount=0;
	Statement st;
    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

      conn = DriverManager.getConnection(url,userName,password);
String query = "select * from interviewer where Eid='"+Eid+"'";

st = conn.createStatement();
ResultSet rs = st.executeQuery(query);
while(rs.next())
{
data = ":" + rs.getString(2) + " " + rs.getString(3) +":"+ Eid;
}


out.println(data);
}
catch (Exception e) {
e.printStackTrace();
}
%> 