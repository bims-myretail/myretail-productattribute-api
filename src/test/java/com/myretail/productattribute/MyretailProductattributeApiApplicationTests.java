package com.myretail.productattribute;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyretailProductattributeApiApplicationTests {

	@Autowired
	private ProductAttributeController controller;

	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	@Test
	public void testPriceResponse() throws Exception {
		Optional<Product> product = controller.findProductAttribute("1");
		assertThat(product.get().getAttribute()).isNotNull();
	}

}
