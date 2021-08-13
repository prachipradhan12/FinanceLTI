package com.finance.service;

import java.util.List;

import com.finance.model.Product;

public interface ProductService {

	public List<Product> viewProduct();
	public Product findProduct(int prodid);
	public String addProducts(Product product);
}
