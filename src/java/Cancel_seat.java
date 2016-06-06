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
        
        String t_no = request.getParameter("ticketNo");
        String pas_id = "";
        String flight_no = "";
        DB con=new DB();
        DB con1=new DB();
        DB con2=new DB();
        try 
        {
            con.rs=con.stmt.executeQuery("select seat,pas_id, flight_no from booked_seats where seat='"+t_no+"'");
            if(con.rs.next())
            {
                pas_id = con.rs.getString("pas_id");
                flight_no = con.rs.getString("flight_no");
                try
                {
                    con1.stmt.execute("insert into cancelation_detail(pas_id,seat,flight_no,cancel_date,cancel_charge)"
                            + " values('"+pas_id+"','"+t_no+"','"+flight_no+"',SYSDATE(), '"+2000+"')");
                    try
                    {
                        con1.stmt.execute("delete from booked_seats where seat='"+t_no+"'");
                    }
                    catch(SQLException e)
                    {
                        System.out.println(e);
                        request.setAttribute("error", "111  " +e);
                request.getRequestDispatcher("seats_c.jsp").forward(request, response);;
                    }
                }
                catch(SQLException e)
                {
                    System.out.println(e);
                    request.setAttribute("error", "222  "+e);
                request.getRequestDispatcher("seats_c.jsp").forward(request, response);;
                }
                
                request.setAttribute("success", "Ticket has been successfully Deleted!");
                request.getRequestDispatcher("seats_c.jsp").forward(request, response);
            }
            else
            {
                request.setAttribute("error", "This ticket does not exist.");
                request.getRequestDispatcher("seats_c.jsp").forward(request, response);
            }
        }
        catch (SQLException e)
        {
            request.setAttribute("error", e);
                request.getRequestDispatcher("seats_c.jsp").forward(request, response);;
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
