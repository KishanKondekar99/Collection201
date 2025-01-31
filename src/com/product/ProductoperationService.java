package com.product;

import java.util.ArrayList;
import java.util.List;

public class ProductoperationService {

	List<ProductEntity> List = new ArrayList<ProductEntity>();

	public String addProduct(ProductEntity product) {

		for (ProductEntity productEntity : List) {

			if (productEntity.getProductName().equals(product.getProductName()))
				return "Product already exits";
		}

		List.add(product);
		return "Product Added Succefully now !";

	}

	public Object getAllProduct() {

		try {
			if (List.isEmpty()) {
				return "Product not Exist in our List..";
			} else {
				return List;
			}
		} catch (Exception e) {
			return "something went wrong ...";
		}

	}

}
