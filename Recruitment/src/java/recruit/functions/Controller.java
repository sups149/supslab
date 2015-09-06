/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recruit.functions;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sups
 */
public class Controller extends HttpServlet {
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
        session =request.getSession(true);
        try {
            int req=Integer.parseInt(request.getParameter("req_type"));
            switch(req){

			case 1:
				rd = request.getRequestDispatcher("/getInformation.jsp");
				rd.forward(request,response);
				break;
                        case 2:
                                //String utype=request.getParameter("utype");
                                //request.setAttribute("utype", utype);
				//if((request.getParameter("utype")).equals("applicant")){
                                rd = request.getRequestDispatcher("/LoginValidation");
				rd.forward(request,response);
                                break;
                         /*       }

                                if((request.getParameter("utype")).equals("interviewer")){

                                rd = request.getRequestDispatcher("/InterviewerLoginValidation");
				rd.forward(request,response);
                                }

                                if((request.getParameter("utype")).equals("HR")){
                                rd = request.getRequestDispatcher("/HRLoginValidation");
				rd.forward(request,response);
                                }
				break;*/
                        case 3:
				rd = request.getRequestDispatcher("/CreateVacancy");
				rd.forward(request,response);
				break;
                        case 4:
				rd = request.getRequestDispatcher("/storeIntSchedule.jsp");
				rd.forward(request,response);
				break;
                        case 5:
				rd = request.getRequestDispatcher("/StoreApplication");
				rd.forward(request,response);
				break;
                        case 6:
				rd = request.getRequestDispatcher("/ChangePassword");
				rd.forward(request,response);
				break;
                        case 7:
				rd = request.getRequestDispatcher("/getApplicant.jsp");
				rd.forward(request,response);
				break;
                        case 8:
				rd = request.getRequestDispatcher("/ManagerAllocatedRoomView");
				rd.forward(request,response);
				break;
                        case 9:
				rd = request.getRequestDispatcher("/ManagerTransactionView");
				rd.forward(request,response);
				break;
                        case 10:
				rd = request.getRequestDispatcher("/RegisteredCustomerLogin");
				rd.forward(request,response);
				break;
                        }
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
