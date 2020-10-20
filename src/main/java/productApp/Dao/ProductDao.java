package productApp.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import productApp.Entity.Product;

@Component
public class ProductDao {

	
	@Autowired
	private HibernateTemplate  hibernateTemplate;
	//SAVE PRODUCT
	@Transactional
	public void createProduct(Product product) {
		
		this.hibernateTemplate.saveOrUpdate(product);
		
	}
	//GET ALL PRODUCT
	public List<Product> getProducts(){ 
		
		List<Product> list=this.hibernateTemplate.loadAll(Product.class);
		return list;
	}
	
	//DELETE SINGLE PRODUCT
	@Transactional
	public void deleteProduct(int pid) {
		
		Product p = this.hibernateTemplate.get(Product.class, pid);
		
		this.hibernateTemplate.delete(p);
	}
	
	//GET SINGLE PRODUCT
	public Product getProduct(int pid) {
		
		return this.hibernateTemplate.get(Product.class,pid);
		
	}
	
	
	
}
