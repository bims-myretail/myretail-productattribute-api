package com.myretail.productattribute;

import java.io.Serializable;
import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.DBObject;

@Document(collection = "product")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	private BigInteger id;


	private DBObject attribute ;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}



	public DBObject getAttribute() {
		return attribute;
	}

	public void setAttribute(DBObject attribute) {
		this.attribute = attribute;
	}

	


}
