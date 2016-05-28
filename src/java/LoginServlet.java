import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
            // get request parameters for userID and password
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
                    DB con=new DB();
                    String userID="",password="";
                    try
                    {
                        con.rs=con.stmt.executeQuery("select admin_name,admin_password from admin where admin_name='"+user+"'");
                        if(con.rs.next())
                        {
                            userID=con.rs.getString("admin_name");
                            password=con.rs.getString("admin_password");
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
		
		
		if(userID.equals(user) && password.equals(pwd)){
			HttpSession session = request.getSession();
			session.setAttribute("user", "Pankaj");
			//setting session to expiry in 30 mins
			session.setMaxInactiveInterval(30*60);
			Cookie userName = new Cookie("user", user);
			userName.setMaxAge(30*60);
			response.addCookie(userName);
			response.sendRedirect("LoginSuccess.jsp");
		}else{
                        request.setAttribute("error", "Either user name or password is wrong.");
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                        response.sendRedirect("login.jsp");
			
		}

	}

}