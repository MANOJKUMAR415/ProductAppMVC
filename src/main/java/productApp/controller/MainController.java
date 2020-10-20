package productApp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productApp.Dao.ProductDao;
import productApp.Entity.Product;

@Controller
public class MainController {

	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model m) {
		
		List<Product> products=productDao.getProducts();
		m.addAttribute("product",products);
		return "index";
	}
	
	
	//SHOW ADD PRODUCT FORM
	@RequestMapping("/showAddProductForm")
	public String saveProductPage(Model m) {
		
		m.addAttribute("title","Add Product");
		
		return "showAddProductForm";	}
	
	
	//SAVE PRODUCT 
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public RedirectView  saveProduct(@ModelAttribute Product product ,HttpServletRequest request) {
		
		System.out.println(product);
	           this.productDao.createProduct(product);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		
		return redirectView;
	}
	
	
	
	//DELETE 
	@RequestMapping("/delete/{productId}")
	public RedirectView delete(@PathVariable("productId") int productId,HttpServletRequest request)
	{
		this.productDao.deleteProduct(productId);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
		
		
	}
	
	@RequestMapping("/update/{productId}")
	public String updateFrom(@PathVariable("productId") int pid, Model m) 
	{
	
		
		Product product=this.productDao.getProduct(pid)	;
		m.addAttribute("product",product);
		
		return "updateform";
	}
	
	
	
	
	
	
}
