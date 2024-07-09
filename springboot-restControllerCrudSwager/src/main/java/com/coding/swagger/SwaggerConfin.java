package com.coding.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfin {
	
	@Bean
	public Docket createDocket() { 
		
		return new Docket(DocumentationType.SWAGGER_2)  
				.select()  //find controller   classes
				
				//provide all controller common package name
				.apis(RequestHandlerSelectors.basePackage("com.coding.controller")) 
				
				//provide one common path of controllers
				.paths(PathSelectors.regex("/rest.*")) 
				
				.build(); //create Docket with details;
	}
}
