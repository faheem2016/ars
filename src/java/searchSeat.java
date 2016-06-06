/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/searchSeat"})
public class searchSeat extends HttpServlet {

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
//        response.setCharacterEncoding("UTF-8");
        String flight_no = request.getParameter("flight_no");
        String seat_no = request.getParameter("seat_no");
        
        // todo: select from booked seats and return 0, 1
        DB con=new DB();
        try
        {
            ResultSet a=con.stmt.executeQuery("select * from booked_seats where flight_no="+flight_no+" and seat = "+seat_no+"");
            if(a.next())
            {
                try (PrintWriter out = response.getWriter()) {
            //        response.setContentType("text/html");
            out.print(0);
        }
            }
            else
            {
                try (PrintWriter out = response.getWriter()) {
            //        response.setContentType("text/html");
            out.print(1);
        }
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        
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
//        processRequest(request, response);
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//        String flight_no = request.getParameter("flight_no");
//        String seat_no = request.getParameter("seat_no");
////        response.setContentType("text/html");
//        try (PrintWriter out = response.getWriter()) {
//            //        response.setContentType("text/html");
//            out.println("{success: true}");
//        }

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
