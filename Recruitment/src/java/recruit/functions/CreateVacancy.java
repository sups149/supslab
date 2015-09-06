/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recruit.functions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import recruit.conn.Connect;

/**
 *
 * @author sups
 */
public class CreateVacancy extends HttpServlet {
    Connect c=new Connect();
    Connection conn=null;
    HttpSession session;
    Statement st=null;
    ResultSet rs=null;
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            session = request.getSession(false);
            //Vid auto generation
            String sql1 = "select max(Vid) as Lastid from allvid";
            String LastVid = "V000";
            conn = c.connect();
            st = conn.createStatement();
            rs = st.executeQuery(sql1);
            if (rs != null) {
                rs.next();
                LastVid = rs.getString("Lastid");
                rs.next();
            }
            String nextId = "";
            String s3 = LastVid.substring(0, 3);
            String s2 = LastVid.substring(0, 2);
            String s1 = LastVid.substring(0, 1);
            int nVid = Integer.parseInt(LastVid.substring(1)) + 1;
            if (nVid < 10) {
                nextId = "" + s3 + "" + nVid;
            } else if (nVid < 100) {
                nextId = "" + s2 + "" + nVid;
            } else if (nVid < 1000) {
                nextId = "" + s1 + "" + nVid;
            }
            request.setAttribute("nextId", nextId);
            String sql2 = "insert into allvid values('" + nextId + "')";
            conn = c.connect();
            st = conn.createStatement();
            st.executeUpdate(sql2);

            int nov=Integer.parseInt(request.getParameter("nov"));
            String vdetail=request.getParameter("vdetail");
            String closedate=request.getParameter("closedate");
            String int_date=request.getParameter("int_date");
            String vstatus="open";
            //get current date
            String pattern = "MM/dd/yyyy";
            SimpleDateFormat myformat = new SimpleDateFormat(pattern);
            String opendate=myformat.format(new Date());
            try{
            String sql3 = "insert into vacancy (Vid, vdetail, nov, opendate, closedate, int_date, vstatus) values (?,?,?,?,?,?,?)";
            conn = c.connect();
            PreparedStatement pstmt=conn.prepareStatement(sql3);
            pstmt.setString(1, nextId);
            pstmt.setString(2, vdetail);
            pstmt.setInt(3, nov);
            pstmt.setString(4, opendate);
            pstmt.setString(5, closedate);
            pstmt.setString(6, int_date);
            pstmt.setString(7, vstatus);
            int count=pstmt.executeUpdate();
            RequestDispatcher rd=request.getRequestDispatcher("/vacancycreated.html");
            rd.forward(request, response);
            }catch (SQLException ex) {
            Logger.getLogger(CreateVacancy.class.getName()).log(Level.SEVERE, null, ex);
        }
             finally {
                out.close();
            }
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CreateVacancy</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CreateVacancy at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        } catch (SQLException ex) {
            Logger.getLogger(CreateVacancy.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
