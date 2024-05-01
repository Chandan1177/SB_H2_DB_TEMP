package com.asr.sb.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asr.sb.entity.Product;
import com.asr.sb.repo.ProductRepository;

@RestController
public class ProductRestController {
	
	@Autowired
	private ProductRepository repo;
	
	@PostMapping(value="/product", consumes = "application/json")
	public ResponseEntity<String> addProduct(@RequestBody Product product){
		Product sava=repo.save(product);
		return new ResponseEntity<>("Product saved",HttpStatus.CREATED);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> products(){
		return new ResponseEntity<List<Product>>(repo.findAll(), HttpStatus.OK);
	}
	
}
