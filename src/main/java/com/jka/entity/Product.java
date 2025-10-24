package com.jka.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@Column(unique = true, nullable = false)
	private long productId;
	
	@Column(unique = true, nullable = false)
	private String productName;
	
	@Column(nullable = false)
	private int productQty;
	
	@Column(nullable = false)
	private double productPrice;
	
	
	@OneToOne
	@JoinColumn(name = "supplierId")
	private Supplier supplier;
	
	@OneToOne
	@JoinColumn(name = "categoryId")
	private Category category;

	public Product() {
		super();
	}

	public Product(String productName, int productQty, double productPrice, Supplier supplier, Category category) {
		super();
		this.productName = productName;
		this.productQty = productQty;
		this.productPrice = productPrice;
		this.supplier = supplier;
		this.category = category;
	}

	public Product(long productId, String productName, int productQty, double productPrice, Supplier supplier,
			Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQty = productQty;
		this.productPrice = productPrice;
		this.supplier = supplier;
		this.category = category;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
	
}
