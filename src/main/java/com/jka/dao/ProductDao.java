package com.jka.dao;

import java.util.List;

import com.jka.entity.Product;

public interface ProductDao {
	
	public String saveProduct(Product product);

	public Product getProductById(long productId);
	 
	public List<Product> getAllProducts();
	
	public String deleteProduct(long productId);
	
	public String updateProduct(long productId);
	
	public List<Product> sortProductById_ASC();
	
	public List<Product> sortProductByName_DESC();
	
	public double getmaxPriceProducts();
	
	public long countSumOfProductPrice();
	
	public long getTotalCountOfProducts();
	
	
//	public List<Product> importSheet();
//	public List<Product> exportSheet();

}
