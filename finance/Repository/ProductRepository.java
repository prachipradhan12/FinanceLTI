package com.finance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finance.Model.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}
