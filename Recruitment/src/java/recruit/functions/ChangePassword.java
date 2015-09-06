/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recruit.functions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import recruit.conn.Connect;

/**
 *
 * @author sups
 */
public class ChangePassword extends HttpServlet {
    Connect c=new Connect();//returns a new connection
    Connection conn=null;
    Statement st=null;
    HttpSession session;

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
            String utype=(String)session.getAttribute("utype");
            String newpass = request.getParameter("newpass");

            if(utype.equals("applicant")){
                String sql1 = "select password from applicant where Aid = ?";
                conn = c.connect();

                //String password = (String)session.getAttribute("password");
                String Aid = (String)session.getAttribute("Aid");
            
                PreparedStatement pstmt = conn.prepareStatement(sql1);
                pstmt.setString(1, Aid);
                ResultSet rs = pstmt.executeQuery();
                while(rs.next()){
                String password=rs.getString(1);
                //out.println(password);
                if(password.equals(request.getParameter("curpass"))){
                String sql = "update applicant set password = ? where Aid=?";
                conn = c.connect();
                PreparedStatement pstmt1 = conn.prepareStatement(sql);
                pstmt1.setString(1, newpass);
                pstmt1.setString(2, Aid);
                int count=pstmt1.executeUpdate();
                RequestDispatcher rd=request.getRequestDispatcher("/PassChanged.html");
                rd.forward(request, response);
                }
                else{
                RequestDispatcher rd=request.getRequestDispatcher("/PassUnmatched.html");
                rd.forward(request, response);
                }
                }
            }


            if(utype.equals("interviewer")){
                String sql1 = "select password from interviewer where Eid = ?";
                conn = c.connect();

                //String password = (String)session.getAttribute("password");
                String Eid = (String)session.getAttribute("Eid");

                PreparedStatement pstmt = conn.prepareStatement(sql1);
                pstmt.setString(1, Eid);
                ResultSet rs = pstmt.executeQuery();
                while(rs.next()){
                String password=rs.getString(1);
                //out.println(password);
                if(password.equals(request.getParameter("curpass"))){
                String sql = "update interviewer set password = ? where Eid=?";
                conn = c.connect();
                PreparedStatement pstmt1 = conn.prepareStatement(sql);
                pstmt1.setString(1, newpass);
                pstmt1.setString(2, Eid);
                int count=pstmt1.executeUpdate();
                RequestDispatcher rd=request.getRequestDispatcher("/PassChanged.html");
                rd.forward(request, response);
                }
                else{
                RequestDispatcher rd=request.getRequestDispatcher("/PassUnmatched.html");
                rd.forward(request, response);
                }
                }
            }


            if(utype.equals("HR")){
                String sql1 = "select password from HR where Hid = ?";
                conn = c.connect();

                //String password = (String)session.getAttribute("password");
                String Hid = (String)session.getAttribute("Hid");

                PreparedStatement pstmt = conn.prepareStatement(sql1);
                pstmt.setString(1, Hid);
                ResultSet rs = pstmt.executeQuery();
                while(rs.next()){
                String password=rs.getString(1);
                //out.println(password);
                if(password.equals(request.getParameter("curpass"))){
                String sql = "update HR set password = ? where Hid=?";
                conn = c.connect();
                PreparedStatement pstmt1 = conn.prepareStatement(sql);
                pstmt1.setString(1, newpass);
                pstmt1.setString(2, Hid);
                int count=pstmt1.executeUpdate();
                RequestDispatcher rd=request.getRequestDispatcher("/PassChanged.html");
                rd.forward(request, response);
                }
                else{
                RequestDispatcher rd=request.getRequestDispatcher("/PassUnmatched.html");
                rd.forward(request, response);
                }
                }
            }
            
            
            try {
                /* TODO output your page here
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet changePassword</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet changePassword at " + request.getContextPath () + "</h1>");
                out.println("</body>");
                out.println("</html>");
                 */
            } finally {
                out.close();
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
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
