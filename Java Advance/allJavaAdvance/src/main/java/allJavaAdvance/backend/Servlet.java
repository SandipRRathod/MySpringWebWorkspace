package allJavaAdvance.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registrationForm")

public class Servlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	PrintWriter out = resp.getWriter();
	
	
	String name=req.getParameter("User_Name");
	String email=req.getParameter("User_Email");
	String pass=req.getParameter("User_Password");
	String gender=req.getParameter("User_gender");
	String city=req.getParameter("User_City");

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "sandip");
		PreparedStatement ps =con.prepareStatement("insert into StudentDetail() values(?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, pass);
		ps.setString(4, gender);
		ps.setString(5, city);
		ps.executeUpdate();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	
	
	} 
	
	resp.setContentType("text/html");
	RequestDispatcher rd = req.getRequestDispatcher("/RegistrationForm.jsp");
		rd.include(req, resp);
		out.print("<h4 style='color:red'>Data Added Succesfully..</h4>");
	
	
	
}
}
