package io.java.springbootstarter.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class productController {

	@Autowired
	private productService prodServ;
	
	@RequestMapping("/products")
	public List<product> getAllProducts(){
		return prodServ.getAllProducts();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/products/{id}")
	public product getProduct(@PathVariable String id){
		return prodServ.getProduct(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/products")
	public void addProduct(@RequestBody product prod){
		prodServ.addProduct(prod);
		return;
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/products/{id}")
	public void updateProduct(@RequestBody product prod, @PathVariable String id){
		prodServ.updateProduct(id, prod);
		return;
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/products/{id}")
	public void deleteProduct(@PathVariable String id){
		prodServ.deleteProduct(id);
		return;
	}
	
}
