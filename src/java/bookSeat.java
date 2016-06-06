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
@WebServlet(urlPatterns = {"/bookSeat"})
public class bookSeat extends HttpServlet {

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

        String flight_no = request.getParameter("flight_no");
        String seat_no = request.getParameter("seat_no");

        String pName = request.getParameter("name");
        String pPhone = request.getParameter("phone");
        String pEmail = request.getParameter("email");
        String pAccount = request.getParameter("accno");
        String pAccPass = request.getParameter("pass");

        // todo: insert passenger info and get id
        DB con = new DB();
        try {
            con.stmt.execute("insert into traveler_detail(pas_name,pas_tno,pas_email,pas_account,pas_password) values('" + pName + "','" + pPhone + "','" + pEmail + "','" + pAccount + "','" + pAccPass + "')");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try {
            ResultSet test = con.stmt.executeQuery("select pas_id from traveler_detail where pas_name='" + pName + "' and pas_email='" + pEmail + "' and pas_account='" + pAccount + "'");
            if (test.next()) {
                String pas_id = test.getString("pas_id");
                try {
                    con.stmt.execute("insert into booked_seats (flight_no,seat,pas_id) values('" + flight_no + "','" + seat_no + "','" + pas_id + "')");
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        // insert booked seat with flight no and pass id

        try (PrintWriter out = response.getWriter()) {
            out.print(1);
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
