package com.sterling.apps.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
public class SwaggerConfig {
	{
		System.out.println("Documentation enabled...");
	}

	@Bean
	public Docket api() {
		System.out.println("Called");
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.sterling.apps"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiDetails());
	}
	
	private ApiInfo apiDetails() {
		return new ApiInfo("People Data API",
				"All Crud operations of People Data",
				"1.0",
				"Terms of Service : http://abc.com",
				new Contact("ABC Corporation","abc.com","info@abc.com")
				,"API 2 license",
				"www.abc.com",
				Collections.emptyList());
	}
}