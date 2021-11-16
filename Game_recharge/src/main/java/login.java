import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/login")
public class login extends HttpServlet{
	 public login() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String accountname = request.getParameter("accname");
        String password = request.getParameter("password_");
        
        if (accountname.isEmpty() || password.isEmpty()) {
        	out.println("<h3>Please Enter your username or password!</h3>");
        	RequestDispatcher req = request.getRequestDispatcher("login1.jsp");
			req.include(request, response);
        }
        else if(!Validate.checkUser(accountname, password)) {
        	out.println("<h3>Could not Validate your account or password! Please Enter again!</h3>");
        	RequestDispatcher req = request.getRequestDispatcher("login1.jsp");
			req.include(request, response);
        }
        
        else
        {
           RequestDispatcher rs = request.getRequestDispatcher("login2.jsp");
           rs.forward(request, response);
        }
	}
}