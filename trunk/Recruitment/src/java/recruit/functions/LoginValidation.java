/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recruit.functions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
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
public class LoginValidation extends HttpServlet {
    Connect c=new Connect();//returns a new connection
    Connection conn=null;
    Statement st=null;
    HttpSession session;
    //private RequestDispatcher rd;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        boolean flag=false;

        try {
            String utype=(String)request.getParameter("utype");

            if(utype.equals("applicant")){
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            //out.println("<h1>ApplicantLogin</h1>");
            String Aid = request.getParameter("uid");
            String pass = request.getParameter("password");
            String sql = "select password,fname from applicant where Aid = ? and password= ?";
            //String sql1= "select password from applicant where Aid = '"+Aid+"'";
            //out.println(""+pass+"");
            //request.setAttribute("Aid", Aid);
            conn = c.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, Aid);
            pstmt.setString(2, pass);
            ResultSet rs = pstmt.executeQuery();
            //st=conn.createStatement(sql);

            while(rs.next()){
                String name=rs.getString(2);
                session=request.getSession();
                //String utype=(String)request.getAttribute("utype");
                session.setAttribute("utype", utype);
                session.setAttribute("Aid", Aid);
                session.setAttribute("Gid", Aid);
                session.setAttribute("name", name);
                session.setAttribute("password", pass);
                RequestDispatcher rd=request.getRequestDispatcher("/RegisteredApplicantHome.jsp");
                rd.forward(request, response);
                flag=true;
            }
          
            }
            if(utype.equals("HR")){
            String Hid = request.getParameter("uid");
            String pass = request.getParameter("password");
            String sql = "select fname,password from HR where Hid = ? and password= ?";
            //String sql1= "select password from HR where Aid = '"+Hid+"'";
            //out.println(""+pass+"");

            //session.setAttribute("Gid", Hid);
            conn = c.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, Hid);
            pstmt.setString(2, pass);
            ResultSet rs = pstmt.executeQuery();
            //st=conn.createStatement(sql);

            while(rs.next()){
                String name=rs.getString(1);
                session=request.getSession();
                session.setAttribute("utype", utype);
                session.setAttribute("Hid", Hid);
                session.setAttribute("name", name);
                RequestDispatcher rd=request.getRequestDispatcher("/HRHome.jsp");
                rd.forward(request, response);
                flag=true;
            }
            
            }

           if(utype.equals("interviewer")){
               response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String Eid = request.getParameter("uid");
            String password = request.getParameter("password");
            String sql = "select * from interviewer where Eid = ? and password = ?";
            out.println(Eid);
            conn = c.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, Eid);
            pstmt.setString(2, password);
            out.println(Eid);
            ResultSet rs = pstmt.executeQuery();
            out.println(Eid);




            while(rs.next()){
            String fname = rs.getString(2);
            String lname = rs.getString(3);
            String name = fname+" "+lname;
            session=request.getSession();
            //String utype=(String)request.getAttribute("utype");
            session.setAttribute("utype", utype);
            session.setAttribute("Eid", Eid);
            session.setAttribute("name", name);
            //session.setAttribute("Gid", Eid);
            RequestDispatcher rd=request.getRequestDispatcher("/InterviewerHome.jsp");
            rd.forward(request, response);
            flag=true;
               }
            
            }
            if(!flag){
        response.sendRedirect(response.encodeRedirectURL("/Recruitment/WrongPass.jsp"));
        }
        } catch (SQLException ex) {
            Logger.getLogger(LoginValidation.class.getName()).log(Level.SEVERE, null, ex);
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
