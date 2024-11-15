package sendredirectandreqDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.jasper.tagplugins.jstl.core.Out;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/search")
@WebServlet("/loginPage")
public class sendredirectandreqDispatcher extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {

		// for sendredirectmethod
//		String searchop = arg0.getParameter("forSearch");
//	  
//		arg1.sendRedirect("https://www.google.com/search?q="+searchop);

		
		PrintWriter out = arg1.getWriter();
		
		
		// for requestDispatcher interface

		String US = arg0.getParameter("UserName");
		String PW = arg0.getParameter("Password");

		
	
		
		if (US.equals("sandip") && PW.equals("sandip") ){
			RequestDispatcher rd =arg0.getRequestDispatcher("/profilePage.jsp");
			rd.forward(arg0, arg1);
		} else {
			RequestDispatcher rd =arg0.getRequestDispatcher("/index.html");
			rd.include(arg0, arg1);
			arg1.setContentType("text/html");
			out.print("<p style='color:red;margin:0;'>*Cardential Is Not Matched</p>");
		}

	}
}
