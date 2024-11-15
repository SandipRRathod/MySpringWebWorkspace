package springMvcNOrm.Models.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMvcNOrm.Models.Product;
import springMvcNOrm.Models.Dao.productDao;



@Service
public class productService {
   @Autowired
	private productDao dao;
   
 
	public int createProduct(Product product) {
		return this.dao.productInsert(product);
	}
	
	
	
}
