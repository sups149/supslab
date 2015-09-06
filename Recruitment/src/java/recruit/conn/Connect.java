/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recruit.conn;
import java.sql.*;
/**
 *
 * @author sups
 */
public class Connect {
    public Connection connect()
    {
        String url = "jdbc:odbc:recruitment";
        Connection conn =null;
        try{
        	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        	conn = DriverManager.getConnection(url, "", "");
           }catch(Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        return conn;
    }
}
