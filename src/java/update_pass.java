/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author Admin
 */
@WebServlet(urlPatterns = {"/update_pass"})
public class update_pass extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String T_no=request.getParameter("Ticket_No");
        String pass_name=request.getParameter("name");
        String city=request.getParameter("city");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        DB con=new DB();
        DB con1=new DB();
        DB con2=new DB();
        String p_id="";
        try
        {
            con.rs=con.stmt.executeQuery("select pas_tno from booked_seats where pas_tno='"+T_no+"'");
            if (con.rs.next()) {
                String s_no=con.rs.getString("pas_tno");
                try
                {
                    con1.rs=con1.stmt.executeQuery("select pas_id from booked_seats where pas_tno='"+T_no+"'");
                    while (con1.rs.next())
                    {
                       
                        try
                        {
                            con2.stmt.execute("update traveler_detail set pas_name='"+pass_name+"' pas_city='"+city+"' "
                                    + "pas_email='"+email+"' pas_phone='"+phone+"' where pas_id='"+p_id+"'");
                        }
                        catch(SQLException e)
                        {
                            System.out.println(e);
                        }
                    }
                }
                catch(SQLException e)
                {
                    System.out.println(e);
                }
                response.sendRedirect("p_updated.jsp");
                
            } else {
                request.setAttribute("error", "This ticket does not exist.");
                request.getRequestDispatcher("Update_p.jsp").forward(request, response);
                response.sendRedirect("Update_p.jsp");
            }
            
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet update_pass</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet update_pass at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
