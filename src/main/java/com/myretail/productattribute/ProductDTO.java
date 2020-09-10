package com.myretail.productattribute;

import java.io.Serializable;
import java.util.Map;

/**
 * @author bims
 * 
 *         Product Data Object Class.
 *
 */
public class ProductDTO implements Serializable{

	private static final long serialVersionUID = -8377234868355103057L;

	private String productID;

	private Map<String, Object> attributes;


	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	

}
