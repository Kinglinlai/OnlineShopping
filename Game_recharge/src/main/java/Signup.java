import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/Signup")
public class Signup extends HttpServlet{
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
        
        if(firstname.contentEquals("") || lastname.contentEquals(""))
        {
            out.println("<h3>Missing Name!</h3>");
            
        }
        else if(accountname.length() > 10 || accountname.contentEquals("")) {
        	out.println("<h3>Invalid Input! Try Again!!!</h3>");
        	
        }
        else if(phonenumber.contains("") || phonenumber.contains("_") || phonenumber.length() > 10 || !phonenumber.matches("[0-9]+")) {
        	out.println("<h3>Invalid Phone Number!</h3>");
        	
        }
        else if (password.contains("") || password.length() > 10) {
        	out.println("<h3>Invalid PassCode!!!</h3>");
        	
        }
        else if (password != confirmpassword) {
        	out.println("<h3>Password does not match!!!</h3>");
        	
        }
        else {
        	try {
	        	Class.forName("com.mysql.jdbc.Driver");
	        	Connection con = DriverManager.getConnection("jdbc:mysql:/ /localhost:3306/test", "username", "password");
	        	PreparedStatement ps = con.prepareStatement("insert into User values(?,?,?,?,?,?)");
	        	ps.setString(1, firstname);
	            ps.setString(2, lastname);
	            ps.setString(3, phonenumber);
	            ps.setString(4, accountname);
	            ps.setString(5, password);
	            ps.setString(6, confirmpassword);
	            int i = ps.executeUpdate();
            
	            if(i > 0) {
	            	out.println("<h3>You are sucessfully registered</h3>");
	            }
            }
        	catch(Exception se) {
                se.printStackTrace();
            }
        
        
        	}
        }
}
