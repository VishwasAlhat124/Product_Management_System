package com.jka.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jka.dao.ProductDao;
import com.jka.entity.Product;
import com.jka.service.ProductService;

@Service
public class ProductServiceIMPL implements ProductService {

	@Autowired
	private ProductDao dao;
	
	@Override
	public String saveProduct(Product product) {
		String addProduct = dao.saveProduct(product);
		return addProduct;
	}

	@Override
	public Product getProductById(long productId) {
		Product product = dao.getProductById(productId);
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> allProducts = dao.getAllProducts();
		return allProducts;
	}

	@Override
	public String deleteProduct(long productId) {
		String deleteProduct = dao.deleteProduct(productId);
		return deleteProduct;
	}

	@Override
	public String updateProduct(long productId) {
		String updateProduct = dao.updateProduct(productId);
		return updateProduct;
	}

	@Override
	public List<Product> sortProductById_ASC() {
		List<Product> list = dao.sortProductById_ASC();
		return list;
	}

	@Override
	public List<Product> sortProductByName_DESC() {
		List<Product> list = dao.sortProductByName_DESC();
		return list;
	}

	@Override
	public double getmaxPriceProducts() {
		double products = dao.getmaxPriceProducts();
		return products;
	}

	@Override
	public long countSumOfProductPrice() {
		long products = dao.countSumOfProductPrice();
		return products;
	}

	@Override
	public long getTotalCountOfProducts() {
		long products = dao.getTotalCountOfProducts();
		return products;
	}

}
