package com.myretail.productattribute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cache.RedisCacheManagerBuilderCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class MyretailProductattributeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyretailProductattributeApiApplication.class, args);
	}
	


}
