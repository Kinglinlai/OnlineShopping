package net.javaguides.login.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.javaguides.login.bean.LoginBean;
import net.javaguides.login.database.LoginDao;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDao loginDao; 
   
	
    public LoginServlet() {
        super();
        
    }

	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException {
    			response.setContentType("text/html");
    			PrintWriter out = response.getWriter();
    	        String username = request.getParameter("username");
    	        String password = request.getParameter("password");
    	        LoginBean loginBean = new LoginBean();
    	        loginBean.setUsername(username);
    	        loginBean.setPassword(password);
    	        
    	        if (username.isEmpty() || password.isEmpty()) {
    	        	out.println("<h3>Missing Name!</h3>");
    	        	
    	        }
    	        
    	        
    	        try {
    	            if (loginDao.validate(loginBean)) {
    	                response.sendRedirect("login1.jsp");
    	            } else {
    	                
    	                response.sendRedirect("login2.jsp");
    	            }
    	        } catch (ClassNotFoundException e) {
    	            e.printStackTrace();
    	        }
    	    }
}
