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
 * @author Faheem
 */
@WebServlet(urlPatterns = {"/search"})
public class search extends HttpServlet {
int flag1 = 0, flag2 = 0, flag3 = 0;
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
        
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String date = request.getParameter("date");
        boolean check = compare(from,to,date);
        
            if (check == true) {
            response.sendRedirect("booking.html");
            } else {
                request.setAttribute("error", "Flight is not currently available for this route!");
                request.getRequestDispatcher("index.jsp").forward(request, response);
                response.sendRedirect("index.html");
            }
           
    }

    private boolean compare(String from, String to, String date){
         DB con = new DB();
     
          // check from       
         try{
             
                ResultSet a = con.stmt.executeQuery("SELECT from_name FROM flight_schedule where from_name='"+from+"'");
                
                if(a.next())
                {
                    flag1=1;
                }
                

        }catch(SQLException e)
            {
                System.out.println(e); 
            }
         
         // check to       
         try{
                ResultSet a = con.stmt.executeQuery("SELECT to_name from flight_schedule where to_name='"+to+"'");
                
                
                 if(a.next())
                {
                    flag2=1;
                }
                

        }catch(SQLException e)
            {
                System.out.println(e); 
            }
         
         // check to       
         try{
                ResultSet a = con.stmt.executeQuery("SELECT depart_date FROM flight_schedule where depart_date='"+date+"'");
                
                
                if(a.next())
                {
                    flag3=1;
                }
                

        }catch(SQLException e)
            {
                System.out.println(e); 
            }
         
         if ((flag1 == 1) && (flag2 == 1)&& (flag3== 1) ) {
            return true;
        } else
            return false;
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
