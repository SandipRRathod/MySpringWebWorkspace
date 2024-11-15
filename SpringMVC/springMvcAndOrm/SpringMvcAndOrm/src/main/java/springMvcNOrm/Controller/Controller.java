package springMvcNOrm.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMvcNOrm.Models.Product;
import springMvcNOrm.Models.Services.productService;

@org.springframework.stereotype.Controller
public class Controller {

//	@Autowired
//	private productService productService;
	
	
	
	@RequestMapping("/")
	public String home() {
		return "Home";
	}

	@RequestMapping(path = "/productForm", method = RequestMethod.POST)
	public String ProductDetail(@ModelAttribute Product product, Model model){
		System.out.println(product);
	
		
//		this.productService.createProduct(product);
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springMvcOrm", "root", "sandip");
//
//		PreparedStatement ps = con.prepareStatement("insert into product() values(?,?,?,?)");
//		ps.setString(1, product.getpName());
//		ps.setString(2, product.getpPrice());
//		ps.setString(3,product.getpMfg());
//		ps.setString(4, product.getpExpiry());
//		ps.executeUpdate();
//    
//        
//		 model.addAttribute("Desc", "Product Added SuccesFully...");
		
		
		return "Product";
	}

}
