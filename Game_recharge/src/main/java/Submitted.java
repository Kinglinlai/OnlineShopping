import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/Submitted")
public class Submitted extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String title = "Using GET Method to Read Form Data";
		out.println("<html>");
		out.println("<head><title>" + title + "</title></head>");
		out.println("<body>");
		out.println("<h4>Submitted Data</h4>");
		out.println("<ul>\n" +
		      "  <li><b>First Name</b>: "
		      + request.getParameter("first_name") + "\n" +
		      "  <li><b>Last Name</b>: "
		      + request.getParameter("last_name") + "\n" +
               "</ul>\n");
		out.println("</body>");
		out.println("</html>");
	}
}
