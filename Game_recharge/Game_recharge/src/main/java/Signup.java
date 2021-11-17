import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Signup")
public class Signup extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	
	public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("Game_recharge/src/main/webapp/WEB-INF/register1.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String firstname = request.getParameter("first_name");
        String lastname = request.getParameter("last_name");
        String phonenumber = request.getParameter("phone");
        String accountname = request.getParameter("accname");
        String password = request.getParameter("password_");
        String confirmpassword = request.getParameter("confirm");
        
        User user = new User(firstname, lastname, password, accountname, phonenumber);
        
        if(firstname.contentEquals("") || lastname.contentEquals(""))
        {
            out.println("<h3>Missing Name!</h3>");
            response.sendRedirect("register1.jsp");
        }
        else if(accountname.length() > 10 || accountname.contentEquals("")) {
        	out.println("<h3>Invalid Input! Try Again!!!</h3>");
        	response.sendRedirect("register1.jsp");
        }
        else if(phonenumber.contains("") || phonenumber.contains("_") || phonenumber.length() > 10 || !phonenumber.matches("[0-9]+")) {
        	out.println("<h3>Invalid Phone Number!</h3>");
        	response.sendRedirect("register1.jsp");

        }
        else if (password.contains("") || password.length() > 10) {
        	out.println("<h3>Invalid PassCode!!!</h3>");
        	response.sendRedirect("register1.jsp");

        }
        else if (password != confirmpassword) {
        	out.println("<h3>Password does not match!!!</h3>");
        	response.sendRedirect("register1.jsp");
        }
        else {
        	SignupDao rDao = new SignupDao();
    		String result = rDao.insert(user);
    		RequestDispatcher dispatcher = request.getRequestDispatcher("Game_recharge/src/main/webapp/WEB-INF/register2.jsp");
    		dispatcher.forward(request, response);
        	}
        }
}
