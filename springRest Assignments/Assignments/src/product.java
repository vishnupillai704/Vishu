package com.example.mongoQ8;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class product {
	@Id
	private Integer id;
	private String productname;
	private Integer productcost;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Integer getProductcost() {
		return productcost;
	}
	public void setProductcost(Integer productcost) {
		this.productcost = productcost;
	}

}
