package NIET;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register2
 */
@WebServlet("/Register2")
public class Register2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String pin=request.getParameter("pin");
		String deptname=request.getParameter("deptname");
		String position=request.getParameter("position");
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfile","root","manager");
			PreparedStatement ps=con.prepareStatement("insert into studentfile values(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,  firstname);
			ps.setString(2,  lastname);
			ps.setString(3,  email);
			ps.setString(4,  phone);
			ps.setString(5,  address);
			ps.setString(6,  pin);
			ps.setString(7,  deptname);
			ps.setString(8,  position);
			ps.setString(9,  uname);
			ps.setString(10,  password);
			
			int i=ps.executeUpdate();
			if(i>0) {
				out.println("You are successfully registered");
				out.println("Go to Login Page: <a href='formlogin.jsp'>Click Me!</a>");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
