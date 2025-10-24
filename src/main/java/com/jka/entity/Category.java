package com.jka.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	
	@Id
	@Column(unique = true, nullable = false)
	private long categoryId;
	
	@Column(unique = true, nullable = false)
	private String categoryName;
	
	@Column(unique = true, nullable = false)
	private String description;
	
	@Column(nullable = false)
	private int discount;
	
	@Column(nullable = false)
	private int gst;
	
	@Column(nullable = false)
	private double deliveryCharges;
	
	public Category() {
		super();
	}

	public Category(String categoryName, String description, int discount, int gst, double deliveryCharges) {
		super();
		this.categoryName = categoryName;
		this.description = description;
		this.discount = discount;
		this.gst = gst;
		this.deliveryCharges = deliveryCharges;
	}

	public Category(long categoryId, String categoryName, String description, int discount, int gst,
			double deliveryCharges) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.description = description;
		this.discount = discount;
		this.gst = gst;
		this.deliveryCharges = deliveryCharges;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

	public double getDeliveryCharges() {
		return deliveryCharges;
	}

	public void setDeliveryCharges(double deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	
	
	

}
