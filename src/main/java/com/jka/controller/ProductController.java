package com.jka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jka.entity.Product;
import com.jka.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/save-product")
	public String saveProduct(@RequestBody Product product) {
		String addProduct = service.saveProduct(product);
		return addProduct;
	}

	@GetMapping("/get-product-by-Id/{productId}")
	public Product getProductById(@PathVariable long productId) {
		Product product = service.getProductById(productId);
		return product;
	}

	@GetMapping("/get-all-product")
	public List<Product> getProductById() {
		List<Product> allProduct = service.getAllProducts();
		return allProduct;
	}

	@DeleteMapping("/delete-product/{productId}")
	public String deleteProduct(@PathVariable long productId) {
		String deleteProduct = service.deleteProduct(productId);
		return deleteProduct;
	}

	@PutMapping("/update-product/{productId}")
	public String updateProduct(@PathVariable long productId) {
		String updateProduct = service.updateProduct(productId);
		return updateProduct;
	}

	@GetMapping("/sort-product-by-id-asc")
	public List<Product> sortProductById_ASC() {
		List<Product> list = service.sortProductById_ASC();
		return list;
	}

	@GetMapping("/sort-product-by-name-desc")
	public List<Product> sortProductByName_DESC() {
		List<Product> list = service.sortProductByName_DESC();
		return list;
	}
	
	@GetMapping("/get-max-price-product")
	public Double getmaxPriceProducts() {
		double products = service.getmaxPriceProducts();
		return products;
	}
	
	@GetMapping("/count-sum-of-product-price")
	public long countSumOfProductPrice() {
		long products = service.countSumOfProductPrice();
		return products;
	}
	
	@GetMapping("/get-Total-Count-Of-Products")
	public long getTotalCountOfProducts() {
		long products = service.getTotalCountOfProducts();
		return products;
	}
	
}
