package com.finance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.model.Product;
import com.finance.repository.ProductRepository;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
     @Autowired
     ProductRepository prodRepo;
     
	@Override
	public List<Product> viewProduct() {
		// TODO Auto-generated method stub
		return prodRepo.findAll();
	}

	@Override
	public Product findProduct(int prodid) {
		// TODO Auto-generated method stub
		return prodRepo.findById(prodid).get();
	}

	@Override
	public String addProducts(Product product) {
		// TODO Auto-generated method stub
		prodRepo.save(product);
		return "Added";
	}

}
