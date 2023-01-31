

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet1
 */
@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n=request.getParameter("t1");
		String pwd=request.getParameter("t2");
		PrintWriter out=response.getWriter();
		response.setContentType("test/html");
		if(n.equals("niet") && pwd.equals("secret"))
		{
			response.sendRedirect("success.jsp");
		}
		else
		{
			out.println("Sorry ! user or password is invalid..try again");
			RequestDispatcher rd=request.getRequestDispatcher("loginpage.jsp");
			rd.include(request,response);
		}
	}

}
