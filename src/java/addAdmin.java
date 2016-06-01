/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Faheem
 */
@WebServlet(urlPatterns = {"/addAdmin"})
public class addAdmin extends HttpServlet {

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
        
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        DB con=new DB();
        DB con1=new DB();
        String userID="";
         try
        {
            con.rs=con.stmt.executeQuery("select admin_name from admin where admin_name='"+name+"'");
            if(con.rs.next())
            {
                userID=con.rs.getString("admin_name");
                
            }
            else
            {
                userID="";
                password="";
            }
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
         
         if(userID.equals(name)){
            request.setAttribute("error", "Username already exists!");
            request.getRequestDispatcher("addAdmin.jsp").forward(request, response);
         }
         else{
             try
            {

                con.stmt.execute("INSERT INTO admin (admin_name, admin_password) "
                        + "VALUES('"+name+"','"+ password +"')");
                request.setAttribute("success", "New Admin successfully Added!");
                request.getRequestDispatcher("admins.jsp").forward(request, response);
            }
            catch(SQLException e)
            {
                System.out.println(e);
                request.setAttribute("error", e);
                request.getRequestDispatcher("admins.jsp").forward(request, response);
            }
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
