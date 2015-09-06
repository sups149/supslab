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
import recruit.beans.ContactDetail;
import recruit.beans.GenInformation;
import recruit.beans.Graduation;
import recruit.beans.StdX;
import recruit.beans.StdXII;
import recruit.conn.Connect;

/**
 *
 * @author sups
 */
public class GetInformation extends HttpServlet {
    Connect c=new Connect();//returns a new connection
    Connection conn=null;
    Statement st = null;
    ResultSet rs = null;
    private RequestDispatcher rd;
   
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
            //HttpSession hs=request.getSession(true);
            GenInformation Inf = (GenInformation) request.getAttribute("GenInf");
            ContactDetail Contacts=(ContactDetail)request.getAttribute("Contacts");
            Graduation Grad=(Graduation)request.getAttribute("Grad");
            StdX X=(StdX)request.getAttribute("X");
            StdXII XII=(StdXII)request.getAttribute("XII");
            //String fname="sups";
            String sql1 = "select max(Aid) as Lastid from allaid";
            String LastAid = "A000";
            conn = c.connect();
            st = conn.createStatement();
            rs = st.executeQuery(sql1);
            if(rs!=null){
            rs.next();
            LastAid=rs.getString("Lastid");
            rs.next();
            }
            String nextId = "";
            String s3=LastAid.substring(0, 3);
            String s2=LastAid.substring(0, 2);
            String s1=LastAid.substring(0, 1);
            int nAid = Integer.parseInt(LastAid.substring(1)) + 1;
            if (nAid < 10) {
                nextId = ""+s3+""+ nAid;
            }
            else if (nAid < 100) {
                nextId = ""+s2+""+ nAid;
            }
            else if (nAid < 1000) {
                nextId = ""+s1+""+ nAid;
            }
            request.setAttribute("nextId", nextId);
            String sql2 = "insert into allaid values('"+nextId+"')";
            conn=c.connect();
            st=conn.createStatement();
            st.executeUpdate(sql2);
            out.println("Updated upto sql2");
            

            try {
                String sql3 = "insert into applicant (Aid, fname, mname, lname, sex, dob, email, address, city, state, pin, phone, mobile, password) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                conn = c.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql3);
                pstmt.setString(1, nextId);
                pstmt.setString(2, Inf.getFname());
                pstmt.setString(3, Inf.getMname());
                pstmt.setString(4, Inf.getLname());
                pstmt.setString(5, Inf.getSex());
                pstmt.setString(6, Inf.getDob());
                pstmt.setString(7, Contacts.getEmail());
                pstmt.setString(8, Contacts.getAddress());
                pstmt.setString(9, Contacts.getCity());
                pstmt.setString(10, Contacts.getState());
                pstmt.setString(11, Contacts.getPin());
                pstmt.setString(12, Contacts.getPhone());
                pstmt.setString(13, Contacts.getMobile());
                pstmt.setString(14, Inf.getDob());
                int count = pstmt.executeUpdate();

                //graduation
                String sql4 = "insert into graduation (Aid, degree, branch, college, university, yrp, me, marks) values (?,?,?,?,?,?,?,?)";
                conn=c.connect();
                PreparedStatement pstmt1=conn.prepareStatement(sql4);
                pstmt1.setString(1, nextId);
                pstmt1.setString(2, Grad.getDegree());
                pstmt1.setString(3, Grad.getBranch());
                pstmt1.setString(4, Grad.getCollege());
                pstmt1.setString(5, Grad.getUniversity());
                pstmt1.setString(6, Grad.getYrp3());
                pstmt1.setString(7, Grad.getMe());
                pstmt1.setString(8, Grad.getMarks3());
                int count1=pstmt1.executeUpdate();

                //X
                String sql5 = "insert into stdx (Aid, yrp, board, marks) values (?,?,?,?)";
                conn=c.connect();
                PreparedStatement pstmt2=conn.prepareStatement(sql5);
                pstmt2.setString(1, nextId);
                pstmt2.setString(2, X.getYrp1());
                pstmt2.setString(3, X.getBoardx());
                pstmt2.setString(4, X.getMarks1());
                int count2=pstmt2.executeUpdate();

                //Xii
                String sql6 = "insert into stdxii (Aid, yrp, board, marks) values (?,?,?,?)";
                conn=c.connect();
                PreparedStatement pstmt3=conn.prepareStatement(sql6);
                pstmt3.setString(1, nextId);
                pstmt3.setString(2, XII.getYrp2());
                pstmt3.setString(3, XII.getBoardxii());
                pstmt3.setString(4, XII.getMarks2());
                int count3=pstmt3.executeUpdate();
                //request dispatcher
                rd=request.getRequestDispatcher("/ApplicantLoginInfo.jsp");
                rd.forward(request, response);

                //TODO output your page here
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet GetInformation</title>");
                out.println("</head>");
                out.println("<body>");
                //out.println("<h1>Servlet GetInformation at " + request.getContextPath () + "</h1>");
                out.println("" + Inf.getFname() + "");
                out.println("</body>");
                out.println("</html>");
            } catch (SQLException ex) {
                Logger.getLogger(GetInformation.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                out.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(GetInformation.class.getName()).log(Level.SEVERE, null, ex);
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
