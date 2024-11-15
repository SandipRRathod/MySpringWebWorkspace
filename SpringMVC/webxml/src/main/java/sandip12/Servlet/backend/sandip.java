package sandip12.Servlet.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



//webservlet use for without web.xml
@WebServlet("/sandip")
public class sandip extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	
		
		
		String pfile = arg0.getParameter("pdffile");
		String name = arg0.getParameter("name");
		String email = arg0.getParameter("email");
		
		System.out.println(name+" "+email +" "+pfile);
		
		PrintWriter out = arg1.getWriter();
		out.println("Enterd Name is "+name);
		out.println("Enterd Email is "+email);
		out.println("pdf  is "+pfile);
	}

}
