package io.java.springbootstarter.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class productService {
	
	private List<product> products = new ArrayList<>(Arrays.asList(
			new product("1", "samsung tv", "tv", "30000","36 inch LED TV")
			));
	public List<product> getAllProducts(){
		return products;
	}
	public product getProduct(String id) {
		return products.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addProduct(product prod) {
		products.add(prod);
		
	}
	public void updateProduct(String id, product prod) {
		for(int i = 0; i<products.size(); i++) {
			product p = products.get(i);
			if(p.getId().equals(id)) {
				products.set(i, prod);
				return;
			}
		}
		
	}
	public void deleteProduct(String id) {
		products.removeIf(p->p.getId().equals(id));
	}
	
	
}
