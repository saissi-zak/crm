package com.crm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.model.Product;
import com.crm.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productrepository;
	
	public List<Product> getAllProduct(){
		return productrepository.findAll();
	}
	
	public Optional<Product> getbyid(long id) {
		return productrepository.findById(id);
	}
	
	public Product insertproduct(Product prod) {
		return productrepository.save(prod);
	}
	
	public String deleteprod(long id) {
		 productrepository.deleteById(id);
		 return "delete ok";
	}
	
	public Product updateprod(Product prod, long id) {
		prod.setId(id);
		return productrepository.save(prod);
	}
}
