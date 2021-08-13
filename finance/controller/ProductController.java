package com.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.model.Product;
import com.finance.service.ProductService;


@RestController
@CrossOrigin(origins = "http://localhost:4200" )
@RequestMapping("financeRest/api")
public class ProductController {
	@Autowired
	ProductService prodService;
	@GetMapping("/products")
	public List<Product> getAll(){
		return prodService.viewProduct();
	}
	@GetMapping("/products/{prodid}")//Find by ID
	public Product getProductById(@PathVariable(value="prodid")int prodid) {
		return prodService.findProduct(prodid);
	}
	@PostMapping("/products")
	public String addProducts(@RequestBody Product product) {
		return prodService.addProducts(product);
	}
}
