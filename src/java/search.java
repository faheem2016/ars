/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
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
    DB con = new DB();
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
        
        String fromID = request.getParameter("from");
        String toID = request.getParameter("to");
        String date = request.getParameter("date");
        int check = compare(fromID,toID,date);
        
            if (check > 0) {
                request.setAttribute("flight_no", check);
                String from_city=from_city(fromID);
                request.setAttribute("from_city", from_city);
                String to_city=from_city(toID);
                request.setAttribute("to_city", to_city);
                
                Time time=time_check(check);
                request.setAttribute("time", time);

                request.setAttribute("departure_date", date);
                
                String fare=fare(check);
                request.setAttribute("fare", fare);
                
                RequestDispatcher dispatcher = request.getRequestDispatcher("booking.jsp");
                dispatcher.forward(request, response);
            } else {
                request.setAttribute("error", "Flight is not currently available for this route!");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
           
    }
    
    String fare(int check)
    {
      try {
            
            ResultSet a = con.stmt.executeQuery("SELECT fare FROM flight_schedule where flight_no = '"+check +"' " );
            if (a.next()) {
                 return a.getString("fare");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;   
    }
    
    Time time_check(int check)
    {
      try {
            
            ResultSet a = con.stmt.executeQuery("SELECT time FROM flight_schedule where flight_no = '"+check +"' " );
            if (a.next()) {
                 return a.getTime("time");
                 

            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;   
    }
    String from_city(String from)
    {
         try {
            String f ;
            ResultSet a = con.stmt.executeQuery("SELECT name FROM city where id = '"+from +"' " );
            if (a.next()) {
                f = a.getString("name");
                return f;

            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }
    
    private int compare(String from, String to, String date){
         DB con = new DB();
     
          // check from       
         try{
             int f = 0;
                ResultSet a = con.stmt.executeQuery("SELECT * FROM flight_schedule where from_id='"+from+"' AND to_id='"+to+"'AND departure_date='"+date+"'");
                
                if(a.next())
                {
                    f = a.getInt("flight_no");
                    return f;
                }
                

        }catch(SQLException e)
            {
                System.out.println(e); 
            }
         
        return 0;
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
