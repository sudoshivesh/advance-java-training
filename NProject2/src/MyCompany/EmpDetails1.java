package MyCompany;
import java.sql.*;
public class EmpDetails1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/employyy";
		String uname="root";
		String pass="manager";
		String query="select name,mobile,email from employyy where city='delhi'";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
			
		rs.next();
		String name=rs.getString("name");
		String mobile=rs.getString("mobile");
		String email=rs.getString("email");
		String city=rs.getString("city");
		System.out.println(name);
		System.out.println(mobile);
		System.out.println(email);
		System.out.println(city);
		st.close();
		con.close();
	}

}
