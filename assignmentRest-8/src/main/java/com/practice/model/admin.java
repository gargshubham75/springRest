package com.practice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Product")

public class admin {

	@Id
	private int id;
	@Field
	private String productName;
	@Field
	private String productStatus;
	@Field
	private int productCost;
	public admin(int id, String productName, String productStatus, int productCost) {
		super();
		this.id = id;
		this.productName = productName;
		this.productStatus = productStatus;
		this.productCost = productCost;
	}
	public int getId() {
		return id;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public int getProductCost() {
		return productCost;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", productName=" + productName + ", productStatus=" + productStatus
				+ ", productCost=" + productCost + "]";
	}
	

}
