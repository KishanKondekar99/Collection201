package com.product;

import java.util.ArrayList;
import java.util.List;

public class ProductoperationService {
	
	
	List<ProductEntity> List =new ArrayList<ProductEntity>();
			
	public String addProduct(ProductEntity product) {
		
		List.add(product);
		
		return "Product Added Succefully !";
		
	}

}
