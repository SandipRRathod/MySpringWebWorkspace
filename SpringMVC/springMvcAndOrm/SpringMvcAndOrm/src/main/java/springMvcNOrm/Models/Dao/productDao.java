package springMvcNOrm.Models.Dao;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springMvcNOrm.Models.Product;


@Repository
public class productDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public int productInsert(Product product) {
		return (int) this.hibernateTemplate.save(product);
	}

}
