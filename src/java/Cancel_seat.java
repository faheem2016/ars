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
@WebServlet(urlPatterns = {"/Cancel_seat"})
public class Cancel_seat extends HttpServlet {

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
        
        String t_no=request.getParameter("Ticket_no"); 
        String pas_id="";
        DB con=new DB();
        DB con1=new DB();
        DB con2=new DB();
        try 
        {
            con.rs=con.stmt.executeQuery("select pas_tno,pas_id from booked_seats where pas_tno='"+t_no+"'");
            if(con.rs.next())
            {
                pas_id=con.rs.getString("pas_id");
                try
                {
                    con1.stmt.execute("insert into cancelation_detail(pas_id,pas_tno)"
                            + " values('"+pas_id+"','"+t_no+"')");
                    try
                    {
                        con1.stmt.execute("delete from booked_seats where pas_tno='"+t_no+"'");
                    }
                    catch(SQLException e)
                    {
                        System.out.println(e);
                    }
                }
                catch(SQLException e)
                {
                    System.out.println(e);
                }
                response.sendRedirect("cancel_comp.jsp");
            }
            else
            {
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
            out.println("<title>Servlet Cancel_seat</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Cancel_seat at " + request.getContextPath() + "</h1>");
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
