package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.model.Product;
import com.crm.service.ProductService;

@Controller
@RequestMapping("/web/product")
public class ProductHtmlController {

		@Autowired
		ProductService productservice;
		
		@GetMapping("")
		public String productlist(Model model) {
			List<Product> prd=(List<Product>)productservice.getAllProduct();
			model.addAttribute("products", prd);
			return "product/products";
		}
		
		@GetMapping("/new")
		public String newproduct(Model model) {
			model.addAttribute("prd", new Product());
			return "product/addproduct";
		}
		
		@PostMapping("")
		public String saveproduct(@ModelAttribute Product prd) {
			productservice.insertproduct(prd);
			return "redirect:/web/product";
		}
		
}
