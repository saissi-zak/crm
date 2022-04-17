package com.crm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.model.Product;
import com.crm.service.ProductService;

@RestController
@RequestMapping("/produits")
public class ProductController {
	@Autowired
	ProductService productservice;
	
	@GetMapping("/Allproduits")
	public List<Product> getAll(){
		return productservice.getAllProduct();
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getbyid(long id){
		return productservice.getbyid(id);
	}
	
	@DeleteMapping("/suppproduct/{id}")
	public String deletebyid(long id) {
		productservice.deleteprod(id);
		return "delete ok";
	}
	
	@PostMapping("/saveprod")
	public Product saveprod(@RequestBody Product prod) {
		return productservice.insertproduct(prod);
	}
	
	@PutMapping("/modprof/{id}")
	public Product updateprod(@RequestBody Product prod, @PathVariable long id) {
		return productservice.updateprod(prod, id);
	}
}
