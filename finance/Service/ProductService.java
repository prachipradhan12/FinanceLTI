package com.finance.Service;

import java.util.List;

import com.finance.Model.Product;



public interface ProductService {
	public List<Product> viewProduct();
	public Product findProduct(int prodid);

}
