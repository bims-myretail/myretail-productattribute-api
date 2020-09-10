package com.myretail.productattribute;

import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myretail")
public class ProductAttributeController {

	Logger logger = LoggerFactory.getLogger(ProductAttributeController.class);

	@Autowired
	ProductRepository productRepo;

	@Cacheable(value = "products", key = "#id")
	@RequestMapping("/productattribute")
	public Optional<Product> findProductAttribute(@RequestParam("productID") String id) {
		logger.info("**** Fetching from DB ****");
		return productRepo.findById(id);
	}

	@CachePut(value="products",key = "#productDTO.productID")
	@RequestMapping(path = "/productattribute", method = RequestMethod.POST)
	public Optional<Product> updateProductAttribute(@RequestBody ProductDTO productDTO) {
		logger.info("**** Update Product Attribute ****");
		Optional<Product> product = productRepo.findById(productDTO.getProductID());
		for (Map.Entry<String, Object> entry : productDTO.getAttributes().entrySet()) {
			product.get().getAttribute().put(entry.getKey(), entry.getValue());
		}
		productRepo.save(product.get());

		return productRepo.findById(productDTO.getProductID());
	}

}
