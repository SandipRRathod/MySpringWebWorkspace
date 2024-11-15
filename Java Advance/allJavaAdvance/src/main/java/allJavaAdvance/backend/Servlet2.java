package allJavaAdvance.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Servlet2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("UserName");
		String password = req.getParameter("Password");

		PrintWriter out = resp.getWriter();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "sandip");
			PreparedStatement ps = con.prepareStatement("select * from StudentDetail where User_Name=? and User_Password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			Resultset rs = (Resultset) ps.executeQuery();

			if (((ResultSet) rs).next()) {
				RequestDispatcher rs1 = req.getRequestDispatcher("/ProfilePage.jsp");
						rs1.include(req, resp);
						resp.setContentType("text/html");
						out.print("Welcome "+username);
			} else {
				RequestDispatcher rs1 = req.getRequestDispatcher("/Login.jsp");
				rs1.include(req, resp);
		resp.setContentType("text/html");
		out.print(" no matched cardential..");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}



	}
}
