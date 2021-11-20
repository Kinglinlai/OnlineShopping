package net.javaguides.login.web;

import java.io.IOException;
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
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException {
    	        String username = request.getParameter("username");
    	        String password = request.getParameter("password");
    	        LoginBean loginBean = new LoginBean();
    	        loginBean.setUsername(username);
    	        loginBean.setPassword(password);

    	        try {
    	            if (loginDao.validate(loginBean)) {
    	                response.sendRedirect("loginsuccess.jsp");
    	            } else {
    	                
    	                response.sendRedirect("login.jsp");
    	            }
    	        } catch (ClassNotFoundException e) {
    	            e.printStackTrace();
    	        }
    	    }
}
