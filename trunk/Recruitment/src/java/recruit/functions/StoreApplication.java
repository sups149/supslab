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
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sups
 */
public class StoreApplication extends HttpServlet {
    Connect c=new Connect();//returns a new connection
    Connection conn=null;
    Statement st = null;
    ResultSet rs = null;
    private RequestDispatcher rd;
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        session=request.getSession(true);
        String Aid=(String)session.getAttribute("Aid");
        String astat[]=request.getParameterValues("astat[]");

        //get current date
        String pattern = "MM/dd/yyyy";
        SimpleDateFormat myformat = new SimpleDateFormat(pattern);
        String appdate=myformat.format(new Date());
        PreparedStatement pstmt;
        for(int i=0;i<astat.length;i++){
            try {
                String sql = "insert into applicant_vacancy (Aid, Vid, appdate) values (?, ?, ?)";
                conn = c.connect();
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, Aid);
                pstmt.setString(2, astat[i]);
                pstmt.setString(3, appdate);
                int count=pstmt.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(StoreApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
         //out.println(""+Aid+" "+astat[i]+"");
                rd=request.getRequestDispatcher("/RegisteredApplicantHome.jsp");
                rd.forward(request, response);
        }
        try {
            //TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StoreApplication</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StoreApplication at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
        } finally { 
            out.close();
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
